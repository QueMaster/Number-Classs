import java.util.Scanner;
public class TestNumber
{
   public static void main(String[] args)
   {
     Scanner scan = new Scanner(System.in);
     Number objNum = new Number();
	 String msg = "Enter numeric value that is '10 > value < 50' ";
	 System.out.println(msg);
	 String catchIt = scan.nextLine();
	 int parseIt = Integer.parseInt(catchIt);
	 
	 try
	 {
	   objNum.setValue(parseIt);
	 }
     catch(ToHighNumber e)
	 {
	   System.out.println(e.getMessage());
	 }
	 catch(ToLowNumber e)
	 {
	   System.out.println(e.getMessage());
	 }
	 System.out.println("The number entered is:" +" "+objNum.getValue());
	 
   }



}