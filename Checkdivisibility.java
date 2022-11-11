/* Task 1, Number 3
The program will check for divisibility test of integers 
*/
import java.util.Scanner;
public class Checkdivisibility{
    public static void main(String[]args){
int num,cen=1, den=2,een=3,feen=4,geen=5,heen=6,jeen=7,keen=8,meen=9;
Scanner s=new Scanner(System.in);
//divisibility test  for 1
System.out.println("divisibility test for 1");
System.out.println("Enter any number");
num=s.nextInt();
if (num%cen==0){
    System.out.println("Any number divided by 1 will give the number itself");
    
}


//divisibility test for  2
System.out.println("divisibility test for 2");
System.out.println("Enter any number");
num=s.nextInt();
if (num%den==0){
    System.out.println("The number is divisible by 2");
    
}
else {
    System.out.println("The number is not divisible by 2");
}
//divisibility test  for 3
System.out.println("divisibility test for 3");
System.out.println("Enter any number");
num=s.nextInt();
if (num%een==0){
    System.out.println("The number is divisible by 3");
    
}
else {
    System.out.println("The number is not divisible by 3");
}


//divisibility test  for 4
System.out.println("divisibility test for 4");
System.out.println("Enter any number");
num=s.nextInt();
if (num%feen==0){
    System.out.println("The number is divisible by 4");
    
}
else {
    System.out.println("The number is not divisible by 4");
}

//divisibility test  for 5
System.out.println("divisibility test for 5");
System.out.println("Enter any number");
num=s.nextInt();
if (num%geen==0){
    System.out.println("The number is divisible by 5");
    
}
else {
    System.out.println("The number is not divisible by 5");
}

//divisibility test  for 6
System.out.println("divisibility test for 6");
System.out.println("Enter any number");
num=s.nextInt();
if (num%heen==0){
    System.out.println("The number is divisible by 6");
    
}
else {
    System.out.println("The number is not divisible by 6");
}

//divisibility test  for 7
System.out.println("divisibility test for 7");
System.out.println("Enter any number");
num=s.nextInt();
if (num%jeen==0){
    System.out.println("The number is divisible by 7");
    
}
else {
    System.out.println("The number is not divisible by 7");
}

//divisibility test  for 8
System.out.println("divisibility test for 8");
System.out.println("Enter any number");
num=s.nextInt();
if (num%keen==0){
    System.out.println("The number is divisible by 8");
    
}
else {
    System.out.println("The number is not divisible by 8");
}

//divisibility test  for 9
System.out.println("divisibility test for 9");
System.out.println("Enter any number");
num=s.nextInt();
if (num%meen==0){
    System.out.println("The number is divisible by 9");
    
}
else {
    System.out.println("The number is not divisible by 9");
}






    }
}