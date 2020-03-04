package model;

import java.beans.PropertyChangeSupport;

public class Radiator
{
  private StateControl currentState;

  public Radiator()
  {
    currentState = new OffState();
  }

  public void turnUp()
  {
    currentState.turnUp(this);
  }

  public void turnDown()
  {
    currentState.turnDown(this);
  }

  public void setState(StateControl state)
  {
    currentState = state;
  }

  public int getState()
  {
    if (currentState instanceof OffState)
    {
      return 0;
    }
    else if (currentState instanceof State1)
    {
      return 1;
    }
    else if (currentState instanceof State2)
    {
      return 2;
    }
    else if (currentState instanceof State3)
    {
      return 3;
    }
    else
      //     In case of error
      return -1;
  }
}
