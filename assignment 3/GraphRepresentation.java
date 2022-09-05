import java.util.LinkedList;
import java.util.HashMap;

public class GraphRepresentation implements Graph {
	//public LinkedList<Vertex> list1 = new LinkedList<Vertex>();
	
	// Here LinkedList<Vertex> is a list holds values of a node's members and adjacencyMatrix 
	// is supposed to map every single node to its list
	public HashMap<Vertex, LinkedList<Vertex>> adjacencyMatrix;
	
	//constructor
	public GraphRepresentation() {
		adjacencyMatrix = new HashMap<>();
	}
	
	
	@Override
	public void addEdgeCheckForDuplicatedEdges(Vertex origin, Vertex destination) {
		
		//create a list to hold neighbor of a vertex
		LinkedList<Vertex> listToHoldVertices = adjacencyMatrix.get(origin);
		
		//retrieve the destination vertex
		if (listToHoldVertices != null) {
			listToHoldVertices.remove(destination);
		}
		
		//if the list is null, then create a new list
		else
			listToHoldVertices = new LinkedList<>();
		
		//then add the removed node to a new list
		listToHoldVertices.add(destination);
		
		//build the graph with the orginal vertex and its neighbor
		adjacencyMatrix.put(origin, listToHoldVertices);
		
	}

	@Override
	public void buildEdge(Vertex origin, Vertex destination) {
		
		//be certain to have every vertex 
		if (!adjacencyMatrix.keySet().contains(destination)) {
			adjacencyMatrix.put(destination, null);
		}
			
		if (!adjacencyMatrix.keySet().contains(origin)) {
				adjacencyMatrix.put(origin, null);
		}
		
		addEdgeCheckForDuplicatedEdges(origin, destination);
	}


	@Override
	public boolean doThoseVerticesContainEdge(Vertex origin, Vertex destination) {
		
		return adjacencyMatrix.containsKey(origin) && adjacencyMatrix.get(origin).contains(destination);
	}

	public String getPrerequisistePath(Vertex courseCode){   //Vertex courseCode) {
		
		String toHoldVisitedVertex = new String();
		
		
		//to check if a vertex is null.... in case the users are a bit slow and for some reason encode a null vertex
		if (courseCode == null) {
			return null;
		}
		
		LinkedList<Vertex> queueToHoldVisitedNode = new LinkedList<>();
		LinkedList<Vertex> allPrequesite = new LinkedList<>();
		
		//every single added node is considered visisted
		queueToHoldVisitedNode.add(courseCode);
		
		while (queueToHoldVisitedNode.isEmpty() == false) {
			
			Vertex tobeVisitedVertex = queueToHoldVisitedNode.remove();
			tobeVisitedVertex.ifVisited();
			
			toHoldVisitedVertex = tobeVisitedVertex.vertexName;
			
			if(allPrequesite == null) {
				continue;
			}
			
			for (Vertex prequesite: allPrequesite) {
				
				queueToHoldVisitedNode.add(prequesite);   
			}
		
		}
		return toHoldVisitedVertex;
		
	}



	@Override
	public String[] getPrerequiste(Vertex courseCode) {
		
		return BFS(courseCode);
	}


	@Override
	public String[] BFS(Vertex a) {
		
		String [] toHoldVisitedVertex = new String[200];
		
		//boolean isVisited[] = new boolean [a.indexOfVertices];
		
		int i = 0;
		
		//to check if a vertex is null.... in case the users are a bit slow and for some reason encode a null vertex
		if (a == null) {
			return null;
		}
		
		LinkedList<Vertex> queueToHoldVisitedNode = new LinkedList<>();
		LinkedList<Vertex> allPrequesite = new LinkedList<>();
		
		//every single added node is considered visisted
		queueToHoldVisitedNode.add(a);
		
		while (queueToHoldVisitedNode.isEmpty() == false) {
			
			Vertex tobeVisitedVertex = queueToHoldVisitedNode.remove();
			tobeVisitedVertex.ifVisited();
			
			toHoldVisitedVertex[i] = tobeVisitedVertex.vertexName;
			i++;
			
			if(allPrequesite == null) {
				continue;
			}
			
			for (Vertex prequesite: allPrequesite) {
				
				queueToHoldVisitedNode.add(prequesite);   
			}
		
		}
		return toHoldVisitedVertex;
		
	}

}
