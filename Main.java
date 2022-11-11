/*Task 1, Number 1
This program will prompt the user to enter his name and age, Then prints out 
number of characters in his name and whether his age is odd or even 
 */
import java.util.Scanner;
public class Main
{
    static int num;
  public static void main(String[] args) 
  {    
        //Take input from the user
        Scanner reader = new Scanner(System.in);
        Scanner sc=new Scanner(System.in);    
        int count = 0,i=0;    
        System.out.println("Please Enter your sir name =  ");
		String str = sc.nextLine();
		//Use a while loop to calculate the total characters in the string
		while(i < str.length())
		{
			if(str.charAt(i) != ' ') 
			{
				count++;
			}
			i++;
		}		
        //prints the total numbers of characters in the sir name.
		System.out.println("\nThe Total Number of Characters  =  " + count);
        
        System.out.println("Enter your age: ");
        int num = reader.nextInt();
//prints wheather the age is odd or even number.
        if(num % 2 == 0)
            System.out.println(" Your current age is even number");
        else
            System.out.println( " Your current age is odd number");
    }      
}