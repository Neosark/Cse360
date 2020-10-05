package cse360assignment02;
/**
* The AddingMachine program 
* simply adds or subtracts an inputted number from a saved total
* then is formatted into a string and the output is displayed on the screen.
* @author  Samuel Trujillo
* @since   2020-10-05
*/
public class AddingMachine {
	  private int total;
	  private String methodHistory = ""; // creating history string used to log methods and values used.
	  /**
	   * This method is used to initialize int total
	   * @return nothing
	   */
	  public AddingMachine () 
	  {
	    total = 0;  // not needed - included for clarity
	    methodHistory = "0"; // initializing history string
	  }
	  
	  /**
	   * The getTotal method returns the current total
	   * @return integer total
	   */
	  public int getTotal () 
	  {
	    return total;
	  }
	 
	  /**
	   * The add method adds the parameter to the total variable
	   * @param value, This is the first parameter to the add method
	   * @return nothing
	   */
	  public void add (int value) 
	  {
		  total += value;
		  methodHistory = methodHistory + " + " + value; // append " + value" to the history string
	  }
	  
	   /**
	   * The subtract method subtracts the parameter from the total variable
	   * @param value, This is the first parameter to the subtract method
	   * @return nothing
	   */
	  public void subtract (int value) 
	  {
		  total -= value;							  
		  methodHistory = methodHistory + " - " + value;	// append " - value" to the history string
	  }
	 
	  /**
	   * This method calls methods add and subtract and formats the return into a String
	   * @return String This returns 
	   */
	  public String toString () 
	  {
	    return methodHistory;	// returning the history string
	  }
	  
	  /**
	   * This method is used to clear the memory
	   * @return nothing
	   */
	  public void clear() 
	  {
		  methodHistory = "0"; // clearing the history string
		  total = 0;			// reseting total to 0
	  }
	}