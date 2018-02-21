package assignment2;

public interface StackInterface<DanielPersonType> {
  
  public void pop() throws StackUnderFlowException;
  public DanielPersonType top() throws StackUnderFlowException;
  public boolean isEmpty();

}
