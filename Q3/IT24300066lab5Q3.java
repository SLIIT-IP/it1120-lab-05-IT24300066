import java.util.Scanner;
public class IT24300066lab5Q3
{
 public static void main(String []a)
 { 
   final double room_per_day = 48000;
   final double discount_for_3_or_4_days = 0.1;
   final double discount_for_5_or_more_days = 0.2;
   Scanner input = new Scanner(System.in);

   System.out.print("enter start date(1-31): ");
   int start_date = input.nextInt();
   if(start_date < 1 || start_date > 31)
   {System.out.print("Error: Days must be between 1 and 31");}

   else
    {
     System.out.print("enter end date(1-31): ");
     int end_date = input.nextInt();
     
     if(end_date < 1 || end_date > 31)
     {System.out.print("Error: Days must be between 1 and 31");}
    
     else if(start_date > end_date)
     System.out.print("Error: Start date must be less than end date");

     else
      {
       System.out.println();
       System.out.println("Room charge per day:"+room_per_day);

       final int reserved_days = (end_date - start_date); 
       final double total_amount_without_discount = room_per_day * reserved_days; 
       System.out.println("number of days reserved:"+reserved_days);
    
       switch(reserved_days)
        {
           case 1:
           case 2: 
                   System.out.println("Total amount to be paid:"+total_amount_without_discount);

                   break;

           case 3:
           case 4:
                   double discount_amount_for_3_or_4_days = total_amount_without_discount * discount_for_3_or_4_days;
                   double total_amount_for_3_or_4_days = total_amount_without_discount - discount_amount_for_3_or_4_days;
                   System.out.println("Total amount to be paid:"+total_amount_for_3_or_4_days);

                   break;

           default: 
                    double discount_amount_for_5_or_more_days = total_amount_without_discount * discount_for_5_or_more_days;
                    double total_amount_for_5_or_more_days = total_amount_without_discount - discount_amount_for_5_or_more_days;
                    System.out.println("Total amount to be paid:"+total_amount_for_5_or_more_days);

        }   

      }
    }
    

}
 
}