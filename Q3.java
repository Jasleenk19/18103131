import java.util.*;
public class Q3{
	static class Edge{
		int src, dest, cost;
		Edge(int src, int dest, int cost){
			this.src = src;
            this.dest = dest;
            this.cost = cost;
		}
	}
	public static String bellmanFord(ArrayList<Edge> edges, int vertices, int src, int dest){
		int m = edges.size();
		int dist[] = new int[vertices];
		int[] parent = new int[vertices];
		parent[src]=-1;
		Arrays.fill(dist,Integer.MAX_VALUE);
		dist[src] = 0;
		for(int i = 1;i<vertices;i++){
			for(Edge edge:edges){
				int u = edge.src;
				int v = edge.dest;
				int w = edge.cost;
				if(dist[u]!=Integer.MAX_VALUE&&dist[v]>dist[u]+w){
					dist[v] = dist[u]+w;
					parent[v]=u;
				}
			}
		}
		for(Edge edge:edges){
			int u = edge.src;
			int v = edge.dest;
			int w = edge.cost;
			if(dist[u] != Integer.MAX_VALUE && dist[u]+w<dist[v]){
				return "Negative cycle exists";
			}
		}
		Stack<Integer> route = new Stack<>();
        int u = dest;
        route.push(u);
        while(parent[u] != -1){
            route.push(parent[u]);
            u = parent[u];
        }
        System.out.print("Path from source to destination is: "+route.peek());
        route.pop();
        while(!route.empty())
        {
        	System.out.print("->"+route.peek());
        	route.pop();
        }
        System.out.println();
		return dist[dest]==Integer.MAX_VALUE?"No path":String.valueOf(dist[dest]);
	}
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter number of vertices in the graph:");
    	int vertices = sc.nextInt();
    	System.out.println("Enter number of edges in the graph:");
    	int nedges = sc.nextInt();
    	ArrayList<Edge> edges = new ArrayList<Edge>(nedges);
    	System.out.println("Enter the edges in the format: Source Destination Cost");
    	for(int i = 0;i<nedges;i++){
    		edges.add(new Edge(sc.nextInt(),sc.nextInt(),sc.nextInt()));
    	}
    	System.out.println("Enter source vertex:");
    	int src = sc.nextInt();
    	System.out.println("Enter destination vertex:");
    	int dest = sc.nextInt();
    	System.out.println("Total cost is: "+bellmanFord(edges,vertices,src,dest));
    }   
                             
}