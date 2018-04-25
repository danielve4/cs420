public class DanielBinaryTree {
  
  Node root;

  public DanielBinaryTree() {
    this.root = null;
  }

  public DanielBinaryTree(Node node) {
    this.root = node;
  }
  
  public DanielBinaryTree(String firstName, String lastName) {
    this.root = new Node(firstName, lastName);
  }

  public Node getRoot() {
    return this.root;
  }

  public void setRoot(Node node) {
    this.root = node;
  }

  public void push(String firstName, String lastName) {
    if(this.root != null) {
      Node current = this.root;
      Node parent = null;
      int compareInt = current.getPerson().getFullName().compareTo(lastName+firstName);
      while (current != null) {
        parent = current;
        if(compareInt > 0) {
          //Current last name comes after argument lastName
          current = current.getLeft();
        } else if(compareInt < 0) {
          //Current last name comes before argument lastName
          current = current.getRight();
        } else {
          //Equal
          System.out.println("Can't insert, duplicate");
        }
      }

      current = new Node(firstName, lastName);
      if(compareInt > 0) {
        parent.setLeft(current);
      } else if(compareInt < 0) {
        parent.setRight(current);
      }
    } else {
      this.root = new Node(firstName, lastName);
    }
  }

  public String toString() {
    return this.root.toString();
  }


  public class Node {
    DanielPersonType person;
    Node left;
    Node right;
    
    public Node(DanielPersonType person, Node left, Node right) {
      this.person = person;
      this.left = left;
      this.right = right;
    }
    
    public Node(String firstName, String lastName) {
      this.person = new DanielPersonType(firstName, lastName);
      this.left = null;
      this.right = null;
    }

    public DanielPersonType getPerson() {
      return person;
    }

    public Node getLeft() {
      return this.left;
    }

    public Node getRight() {
      return this.right;
    }

    public void setLeft(Node left) {
      this.left = left;
    }

    public void setRight(Node right) {
      this.right = right;
    }

    public String toString() {
      return person.toString();
    }
  }  
  
}