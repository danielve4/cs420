

public interface BoundedStackInterface<T> extends DanielStackInterface<T> {

  public void push(T element) throws DanielStackOverFlowException;
  public boolean isFull();
  
}
