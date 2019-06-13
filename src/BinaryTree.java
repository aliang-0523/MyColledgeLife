import java.awt.DisplayMode;
import java.awt.geom.CubicCurve2D;

class Node{
	public int data;
	public Node leftChild;
	public Node rightChild;
	public void DisplayMode() {
		System.out.println(data);
	}

	public Node(int data) {
		this.data=data;
		this.leftChild=null;
		this.rightChild=null;
	}
}
public class BinaryTree {
	private Node root;
	public Node find(int key) {
		Node current=root;
		while(current!=null) {
			if(current.data>key) {
				current=current.leftChild;
			}
			else if(current.data<key) {
				current=current.rightChild;
			}
			System.out.println(current.data);
			return current;
		}
		return null;
	}
	public boolean insert(int key) {
		Node newNode=new Node(key);
		if(root==null) {
			root=newNode;
			return true;
		}
		else {
			Node current=root;
			Node parentNode=null;
			while(current!=null) {
				parentNode=current;
				if(current.data>key) {
					current=current.leftChild;
					if(current==null) {
						parentNode.leftChild=newNode;
						return true;
					}
				}
				else {
					current=current.rightChild;
					if(current==null) {
						parentNode.rightChild=newNode;
						return true;
					}
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		BinaryTree binaryTree=new BinaryTree();
		binaryTree.insert(1);
		binaryTree.find(1);
	}
}
