package binaryTreeInorderTraversal;

public class TreeNode {
	int val;
	Treenode left;
	Treenode right;
	Treenode(){};
	Treenode(int val){this.val=val;}

	Treenode(int val, Treenode left, Treenode right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
}
