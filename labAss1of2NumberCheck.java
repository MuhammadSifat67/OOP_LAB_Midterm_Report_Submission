public class labAss1of2NumberCheck
{
    public static void main(String[] args) 
    {
        double number = -25.0;
        if(number>0) 
        {
/*2. Write a Java program to check whether a given number is positive, negative, or zero and
print the result.*/
            System.out.println(number+ " is posive.");
        } else if (number<0)
        {
            System.out.println(number + " is Negative.");
        }
        else
            System.out.println("The number is zero." +number);
    }    
}
