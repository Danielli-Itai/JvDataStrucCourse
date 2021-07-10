package binary_sort_tree;





import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;





class TestBSTree {

	@Test
	void test_insert() {
		BSTree tree = new BSTree();
		
		tree.insert(43);
		tree.insert(20);
		tree.insert(72);
		tree.insert(16);
		tree.insert(31);
		tree.insert(65);
		tree.insert(86);
		
		int hight1 = tree.height();
		Assertions.assertEquals(3, hight1);
		return;
	}

	
	@Test
	void test_retreeve() {
		BSNode node = null;
		BSTree tree = new BSTree();

		tree.insert(43);
		tree.insert(20);
		tree.insert(31);

		node = tree.retrieve(0);
		Assertions.assertNull(node);
		
		node = tree.retrieve(31);
		Assertions.assertNotNull(node);
		System.out.println("Found :" + node.getKey());

		int hight2 = tree.height();
		Assertions.assertEquals(3,hight2);
		System.out.println("Hgiht :" + node.getKey());
		
		boolean empty = tree.isEmpty();
		Assertions.assertTrue(!empty);
		System.out.println("Is empty:" + empty);

		boolean full = tree.isFull();
		Assertions.assertTrue(!empty);
		System.out.println("Is full:" + full);

		tree.clear();
		Assertions.assertTrue(tree.isEmpty());
		System.out.println("Is empty:" + empty);
		return;
	}

	@Test
	void test_scan() {
		BSNode node = null;
		BSTree tree = new BSTree();

		tree.insert(25);
		tree.insert(15);
		tree.insert(50);
		tree.insert(10);
		tree.insert(22);
		tree.insert(35);
		tree.insert(70);
		tree.insert(4);
		tree.insert(12);
		tree.insert(18);
		tree.insert(24);
		tree.insert(31);
		tree.insert(44);
		tree.insert(66);
		tree.insert(90);
		
		//https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder
		String preorder = tree.Preorder();
		Assertions.assertEquals(" 25 15 10 4 12 22 18 24 50 35 31 44 70 66 90",preorder);
		System.out.println();
		System.out.println("Preorder (Root, Left, Right):" + preorder);
		
		
		//Inorder traversal of the constructed tree:	1 5 7 10 40 50 
		String inorder = tree.Inorder();
		Assertions.assertEquals(" 4 10 12 15 18 22 24 25 31 35 44 50 66 70 90", inorder);
		System.out.println();
		System.out.println("Inorder (Left, Root, Right):" + inorder );		

		String postorder = tree.Postorder();
		Assertions.assertEquals(" 4 12 10 18 24 22 15 31 44 35 66 90 70 50 25", postorder);
		System.out.println();
		System.out.println("Postorder (Left, Right, Root):" + postorder);		

		return;
	}
}
