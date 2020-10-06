import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
   {
   int j,n;

   System.out.print("Please enter an integer to create a multiplication table for: ");
{
    Scanner in = new Scanner(System.in);
		    n = in.nextInt();

   System.out.println ("\n");
   for(j=0;j<=n;j++)
  
     System.out.println(n+" X "+j+" = " +n*j);
   }
   }
  }
}
