public class GraphTesting {

	public static void main(String[] args) {
		
		GraphRepresentation graph = new GraphRepresentation();
	        Vertex coen212 = new Vertex(0, "COEN212");
	        Vertex coen231 = new Vertex(1, "COEN231");
	        Vertex coen243 = new Vertex(2, "COEN243");
	        Vertex coen244 = new Vertex(3, "COEN244");
	        Vertex coen311 = new Vertex(4, "COEN311");
	        Vertex coen313 = new Vertex(5, "COEN313");
	        Vertex coen316 = new Vertex(6, "COEN316");
	        Vertex coen317 = new Vertex(7, "COEN317");
	        Vertex coen320 = new Vertex(8, "COEN320");
	        Vertex coen346 = new Vertex(9, "COEN346");
	        Vertex coen352 = new Vertex(10, "COEN352");
	        Vertex coen366 = new Vertex(11, "COEN366");
	        Vertex coen390 = new Vertex(12, "COEN390");
	        Vertex coen413 = new Vertex(13, "COEN413");
	        Vertex coen415 = new Vertex(14, "COEN415");
	        Vertex coen421 = new Vertex(15, "COEN421");
	        Vertex coen422 = new Vertex(16, "COEN422");
	        Vertex coen424 = new Vertex(17, "COEN424");
	        Vertex coen432 = new Vertex(18, "COEN432");
	        Vertex coen433 = new Vertex(19, "COEN433");
	        Vertex coen434 = new Vertex(20, "COEN434");
	        Vertex coen446 = new Vertex(21, "COEN446");
	        Vertex coen447 = new Vertex(22, "COEN447");
	        Vertex coen448 = new Vertex(23, "COEN448");
	        Vertex coen451 = new Vertex(24, "COEN451");
	        Vertex coen490 = new Vertex(25, "COEN490");
	        Vertex coen498 = new Vertex(26, "COEN498");


	        graph.buildEdge(coen212,coen311);
	        graph.buildEdge(coen212,coen313);
	        graph.buildEdge(coen212,coen433);
	        graph.buildEdge(coen212,coen451);
	        graph.buildEdge(coen231,coen352);
	        graph.buildEdge(coen231,coen313);
	        graph.buildEdge(coen243,coen244);
	        graph.buildEdge(coen243,coen311);
	        graph.buildEdge(coen244,coen352);
	        graph.buildEdge(coen244,coen433);
	        graph.buildEdge(coen244,coen434);
	        graph.buildEdge(coen311,coen316);
	        graph.buildEdge(coen311,coen317);
	        graph.buildEdge(coen311,coen346);
	        graph.buildEdge(coen311,coen390);
	        graph.buildEdge(coen311,coen316);
	        graph.buildEdge(coen313,coen316);
	        graph.buildEdge(coen313,coen316);
	        graph.buildEdge(coen313,coen413);
	        graph.buildEdge(coen317,coen447);
	        graph.buildEdge(coen317,coen421);
	        graph.buildEdge(coen320,coen421);
	        graph.buildEdge(coen346,coen320);
	        graph.buildEdge(coen346,coen366);
	        graph.buildEdge(coen346,coen422);
	        graph.buildEdge(coen346,coen424);
	        graph.buildEdge(coen352,coen390);
	        graph.buildEdge(coen352,coen346);
	        graph.buildEdge(coen352,coen390);
	        graph.buildEdge(coen366,coen446);
	        graph.buildEdge(coen366,coen447);
	        graph.buildEdge(coen390,coen490);
	        
	       // graph.getPrerequisistePath(coen490);
	        graph.getPrerequiste(coen498);

	}

}
