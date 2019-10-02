import java.util.Queue;

public class GDemo {

	public static void main(String[] args) {
		
		WeightedGraph<String> graph = new WeightedGraph<>();
		graph.addVertex("Philly");
		graph.addVertex("Denver");
		graph.addVertex("Chicago");
		graph.addVertex("San Francisco");
		
		graph.addEdge("Philly", "Denver", 2000);
		graph.addEdge("Denver", "Philly", 2000);
		graph.addEdge("Denver", "San Francisco", 1300);
		graph.addEdge("Denver", "Chicago", 1000);
		graph.addEdge("San Francisco", "Denver", 1300);
		graph.addEdge("Chicago", "San Francisco", 1700);
		
		//where can I fly from Denver?
		Queue<String> denverFlights = graph.getToVertices("Denver");
		System.out.println(denverFlights);
		
		//what is the distance between Denver and San Francisco
		System.out.println("Distance between Denver and SF is " + graph.weightIs("Denver", "San Francisco"));
	}
}
