package assignment5;

public interface DanielStackInterface<T> {
  
  public void pop() throws DanielStackUnderFlowException;
  public T top() throws DanielStackUnderFlowException;
  public boolean isEmpty();

}
