public class DanielBinaryTree<T extends DanielAbstractPerson> implements BoundedStackInterface<T> {
  
  Node<T> root;

  public DanielBinaryTree() {
    this.root = null;
  }
  
  public Node<T> getRoot() {
    return this.root;
  }

  public void setRoot(Node<T> node) {
    this.root = node;
  }

  public boolean isFull() {
    return false;
  }

  public boolean isEmpty() {
    return this.root == null?true:false;
  }

  public T top() {
    return this.root.getPerson();
  }

  public void pop() {
    
  }

  public void push(T person) {
    if(this.root != null) {
      Node<T> current = this.root;
      Node parent = null;
      int compareInt = current.getPerson().compareTo(person.getFullName());
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
          current = null;
        }
      }
      current = new Node(person);
      if(compareInt > 0) {
        parent.setLeft(current);
      } else if(compareInt < 0) {
        parent.setRight(current);
      }
    } else {
      this.root = new Node(person);
    }
  }

  public String toString() {
    return this.root.toString();
  }


  public class Node<T> {
    T person;
    Node<T> left;
    Node<T> right;

    public Node() {
      this.person = null;
      this.left = null;
      this.right = null;
    }
    
    public Node(T person, Node left, Node right) {
      this.person = person;
      this.left = left;
      this.right = right;
    }

    public Node(T person) {
      this.person = person;
    }
    
    // public Node(String firstName, String lastName) {
    //   this.person = new DanielPersonType(firstName, lastName);
    //   this.left = null;
    //   this.right = null;
    // }

    public T getPerson() {
      return this.person;
    }

    public Node<T> getLeft() {
      return this.left;
    }

    public Node<T> getRight() {
      return this.right;
    }

    public void setLeft(Node<T> left) {
      this.left = left;
    }

    public void setRight(Node<T> right) {
      this.right = right;
    }

    public String toString() {
      return person.toString();
    }
  }  
  
}