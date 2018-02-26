package assignment2;

public interface DanielStackInterface<DanielPersonType> {
  
  public void pop() throws DanielStackUnderFlowException;
  public DanielPersonType top() throws DanielStackUnderFlowException;
  public boolean isEmpty();

}
