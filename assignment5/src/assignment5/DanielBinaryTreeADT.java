package assignment5;

import java.util.ArrayList;
public class DanielBinaryTreeADT<T extends DanielAbstractPerson> implements BoundedStackInterface<T> {
  
  Node<T> root;

  public DanielBinaryTreeADT() {
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
    if(this.isEmpty()) {
      return;
    }
  }

  public void push(T person) throws DanielStackOverFlowException {
    if(this.root != null) {
      Node<T> current = this.root;
      Node<T> parent = null;
      int compareInt = current.getPerson().compareTo(person.getFullName());
      while (current != null) {
        compareInt = current.getPerson().compareTo(person.getFullName());
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

  public void sort() {
    //Sorts on push
  }

  public void traversalInOrder(Node<T> aNode)  {
    if(aNode == null)
      return;
    traversalInOrder(aNode.getLeft());
    System.out.println(aNode.getPerson().toString());
    traversalInOrder(aNode.getRight());
  }

  public ArrayList<T> getTeam() throws DanielStackOverFlowException {
    ArrayList<T> team = new ArrayList<>();
    if(this.isEmpty())
      return team;
    //String str = "";
    
    CS420TeamListADT<Node<T>> stack = new CS420TeamListADT<>();
    Node<T> current = this.root;
    while(current != null) {
      stack.push(current);
      current = current.getLeft();
    }
    while(stack.getTeamSize() > 0) {
      current = stack.top();
      stack.pop();
      //str += current.getPerson().toString() + "\n";
      team.add(current.getPerson());
      //System.out.println(current.getPerson().toString());
      if(current.getRight() != null) {
        current = current.getRight();
        while(current != null) {
          stack.push(current);
          current = current.getLeft();
        }
      }
    }

    return team;
  }

  public String toString() {
    try {
      ArrayList<T> team = this.getTeam();
      String str = "";
      for(int i=0; i < team.size(); i++)
        str += "Num: " + (i+1) + " - " + team.get(i).toString() + "\n";
      return str;
    } catch(DanielStackOverFlowException e) {
      e.printStackTrace();
      return "Empty";
    }
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