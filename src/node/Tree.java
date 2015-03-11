package node;

import java.awt.List;
import java.util.Dictionary;

public class Tree {
	Node head = null;
	Dictionary<String, Double> dict;
	List vars = new List();
	
	
	public Boolean addNode(Node node){
		if(node.getType()==2){
			vars.add(node.getValue());
		}
		if(head.placeNode(node)){
			return true;
		} else {
			System.out.println("Node: "+node+" could not be placed");
			return false;
		}
		
	}
	
}

