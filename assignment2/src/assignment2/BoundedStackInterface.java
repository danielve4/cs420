package assignment2;

public interface BoundedStackInterface<DanielPersonType> extends StackInterface<DanielPersonType> {

  public void push(DanielPersonType element) throws StackOverFlowException;
  public boolean isFull();
  
}
