import java.util.Scanner;
public class IT24300066lab5Q1
{
  public static void main(String []a)
  {
    Scanner input = new Scanner(System.in);
    int num1,num2,num3;
    
    System.out.print("enter the first integer:");
    num1 = input.nextInt();
    
    System.out.print("enter the second integer:");
    num2 = input.nextInt();
    
    System.out.print("enter the third integer:");
    num3 = input.nextInt();
    
    int smallest = num1;
    int largest = num1;
 
    if(num2<smallest)
    { 
      smallest = num2;}
       if(num3<smallest)
       { smallest = num3;}
         if(num2>largest)
          { largest = num2;}
           if (num3>largest)
            {  largest = num3;}
            
     System.out.println();
     System.out.println("user entered numbers are :" + num1 + " " + num2 + " " + num3);
     System.out.println("the smallest number is:"+ smallest);
     System.out.print("the largest number is:"+ largest); 
  }


}