public class task1PrimeOrNot 
{
//Task 1: Write a Java program to check whether a value is prime or not.
    public static void main(String[] args) 
    {
       int num = 23; 
       int count = 0;
 // Prime means divisible only by 1 and itself
        for (int i = 1; i <= num; i++) 
        {
            if (num % i == 0) // if num is divisible by i
            {
                count++;
            }
        }
        if (count == 2) // only divisible by 1 and itself
        {
            System.out.println(num + " is a Prime Number.");
        }
        else
        {
            System.out.println(num + " is Not a Prime Number.");
        }
    }   
}
