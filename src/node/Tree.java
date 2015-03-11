package node;

import java.util.ArrayList;
import java.util.Dictionary;

public class Tree {
	Node head = null;
	Dictionary<String, Double> dict;
	ArrayList<String> vars = new ArrayList<String>();
	int numVars = 0;
	
	public Boolean addNode(Node node){
		if(node.getType()==2 && !vars.contains(node.getValue()) ){ //if what are are adding is a variable and we don't already know about it
			vars.add(node.getValue());
			numVars++;
		}
		if(head.placeNode(node)){
			return true;
		} else {
			System.out.println("Node: "+node+" could not be placed");
			return false;
		}
		
	}
	
}

