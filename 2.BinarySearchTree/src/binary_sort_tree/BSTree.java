package binary_sort_tree;

public class BSTree {

	private BSNode root;
	public BSTree (){
		
	}
	
	// Binary search tree manipulation methods
	public void insert(int newKey){
		if(null == this.root) {
			this.root = new BSNode(newKey,null,null);
		}else {
			BSNode.AddNode(this.root, newKey);					
		}
	}

	public BSNode retrieve(int searchKey) { 
		return BSNode.FindNode(this.root, searchKey);
	}
	
	//Return the tree height.
	int height() {
		return(BSNode.Hight(this.root, 0));
	}

	// Binary search tree status methods
	public boolean isEmpty(){
		return(null == this.root);
	}
	public boolean isFull(){
		return(false);
	}
	
	// Print tree methods
	public String Preorder(){
		return BSNode.Preorder(this.root);
	}
	public String Inorder(){
		return BSNode.Inorder(this.root);
	}
	public String Postorder(){
		return BSNode.Postorder(this.root);	
	}

	//	Clear the whole tree.
	public void clear (){
		this.root = null;
	}// Clear tree
}
