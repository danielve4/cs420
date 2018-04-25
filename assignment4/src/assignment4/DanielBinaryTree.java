public class DanielBinaryTree {
  
  Node root;
  public DanielBinaryTree(Node node) {
    this.root = root;
  }
  
  public DanielBinaryTree(String value) {
    this.root = new Node(value);
  }



  public class Node {
    String name;
    Node left;
    Node right;
    
    public Node(String name, Node left, Node right) {
      this.name = name;
      this.left = left;
      this.right = right;
    }
    
    public Node(String name) {
      this.name = name;
      this.left = null;
      this.right = null;
    }
  }  
  
}