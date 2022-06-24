
public class Edge {
	
	private Node src; 
	private Node dst; 
	
	public Edge (Node l, Node m) {
		
		src = l; 
		dst = m; 
	}
	
	public Node getSrc() {
		return src; 
	}
	
	public Node getDst() {
		
		return dst;
	}

}
