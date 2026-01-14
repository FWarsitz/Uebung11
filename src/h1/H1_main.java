package h1;

public class H1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node e = new Node(null);
		Node d = new Node(e);
		Node c = new Node(d);
		Node b = new Node(c);
		Node a = new Node(b);
		
		
//		//Beispiele: 
//		System.out.println(distance(a,d)); //3
//		System.out.println(distance(b,d)); //2
//		System.out.println(distance(c,e)); //2
	}
	
	public static int distance(Node x, Node y) {
		if(x.equals(y)) {
			return 0;
		}
		return 1+distance(x.getNext(), y);
	}

}
