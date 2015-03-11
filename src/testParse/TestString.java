package testParse;
import node.Node;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(1,"1");
		System.out.println("'1' == " +n1+": " + n1.toString().equals("1"));
		Node n2 = new Node(2,"x");
		Node out = new Node(3, "*");
		out.placeNode(n1);
		out.placeNode(n2);
		System.out.println("'(1*x)' == "+out+": " + out.toString().equals("(1*x)"));
		Node head = new Node(3, "+");
		head.placeNode(out);
		head.placeNode(n1);
		System.out.println("'((1*x)+1)' == "+head+": " + head.toString().equals("((1*x)+1)"));

	}

}
