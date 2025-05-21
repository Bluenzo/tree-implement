public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);

    root.left = new TreeNode(9);
    root.right = new TreeNode(15);

    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);

    root.right = new TreeNode(15);
    root.right.left = new TreeNode(-3);
    root.right.right = new TreeNode(5);

    root.right.right.right = new TreeNode(22);

    preorder(root);
  }

  public static void preorder(TreeNode current){ //void because we don't print anything
    //if null: return
    if(current == null) return; //current is the TreeNode.  

    //print data
    System.out.println(current.data); //current.data is to print the data inside current.

    //search left
    preorder(current.left); 

    //search right
    preorder(current.right);

  }
}
