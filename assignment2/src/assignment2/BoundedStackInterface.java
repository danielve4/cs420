package assignment2;

public interface BoundedStackInterface<DanielPersonType> extends DanielStackInterface<DanielPersonType> {

  public void push(DanielPersonType element) throws DanielStackOverFlowException;
  public boolean isFull();
  
}
