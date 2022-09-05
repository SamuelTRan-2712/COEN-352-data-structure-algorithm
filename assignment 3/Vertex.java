public class Vertex {
	
	int indexOfVertices; //declaration of index of a corresponding vertex
	String vertexName;
	boolean visited; // false if the vertex is already visited, else is true
	
	//Vertex's constructor
	Vertex(int n, String name){
		indexOfVertices = n;
		vertexName = name;
		visited = false;
	}
	
	void ifVisited() {
		visited = true;
	}
	
	void ifUnVisisted() {
		visited = false;
	}


}
