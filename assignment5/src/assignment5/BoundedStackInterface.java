package assignment5;

import java.util.ArrayList;

public interface BoundedStackInterface<T> extends DanielStackInterface<T> {

  public void push(T element) throws DanielStackOverFlowException;
  public boolean isFull();
  public ArrayList<T> getTeam() throws DanielStackOverFlowException;
  public void sort();
}
