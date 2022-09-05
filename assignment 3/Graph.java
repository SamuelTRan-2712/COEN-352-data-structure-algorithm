public interface Graph {
	public void addEdgeCheckForDuplicatedEdges (Vertex origin, Vertex destination); //check if the edges are duplicated and if not, build it
	public void buildEdge(Vertex origin, Vertex destination); // if there are not duplication in edges, build it
	//public void printEdges();
	public boolean doThoseVerticesContainEdge(Vertex origin, Vertex destination); //return true if there is an edge between 2 vertices 
	//public String getPrerequisistePath(String courseCode);
	public String getPrerequisistePath(Vertex courseCode);
	//public String[] getPrerequiste();
	public String[] BFS (Vertex a);
	public String[] getPrerequiste(Vertex courseCode);
	
}
