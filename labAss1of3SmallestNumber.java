public class labAss1of3SmallestNumber 
{

    public static void main(String[] args) 
    {
        double num1 = 1998.5;
        double num2 = 77.8;
        double num3 = 155.3;
   //3. Write a Java program to find and print the smallest of three numbers. 
        if (num1<=num2 && num1<=num3)
        {
            System.out.println("The Smallest Number is: " +num1);
        }
        else if(num2<=num1 && num2<=num3)
        {
            System.out.println("The Smallest Number is: " +num2);
        }
        else
        {
            System.out.println("The Smallest Number is: " +num3);
        }
    }
    
}
