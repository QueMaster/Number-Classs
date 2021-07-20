public class Number
{
  private int value;
  
  public Number()
  {
  
  }
  public void setValue(int value) throws ToHighNumber,ToLowNumber
  {
    if(value>50)
	{
	  throw new ToHighNumber("The value entered is too high.");
	}
	else if(value<10)
	{
	  throw new ToLowNumber("The value entered is too low");
	}
	else
	{
	  this.value = value;
	}
  }
  
  public int getValue()
	{
	  return value;
	}
}