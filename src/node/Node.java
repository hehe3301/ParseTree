package node;

public class Node {
	Node rChild= null; //the right child of this node
	Node lChild= null; //the left child of this node
	int type;    //The type of this node: 1 for number, 2 for variable, 3 for operator
	String data; //The value of the string
	
	public Node(int type, String value){
		this.type=type;
		this.data=value;
	}
	
	public String toString(){
		if (type == 3){
			return "(" + lChild.toString() + data + rChild.toString() + ")";
		} else {
			return data;
		}
	}
	
	public boolean placeNode(Node node){
		if(this.type != 3){
			return false;
		}
		if(lChild == null){
			lChild = node;
			return true;
		} else if(rChild == null){
			rChild = node;
			return true;
		}
		
		if(lChild.placeNode(node)){
			return true;
		} else if(rChild.placeNode(node)){
			return true;
		}
		
		return false;
	}

	public int getType() {
		// TODO Auto-generated method stub
		return type;
	}

	public String getValue() {
		// TODO Auto-generated method stub
		return data;
	}

}
