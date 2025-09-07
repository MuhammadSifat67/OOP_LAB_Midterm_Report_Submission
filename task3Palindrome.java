public class task3Palindrome 
{
/*Task 3: Write a Java program to check if a string is a palindrome by reversing it and comparing it
with the original. [Palindrome]*/
    public static void main(String[] args) 
    {
       int number = 454; 
       int original = number;
       int reversed = 0;

        while (number != 0)
        {
           int digit = number%10;
           reversed = reversed*10 + digit;
            number = number / 10;
        }
        if (original == reversed) 
        {
            System.out.println(" The Number "+original+ " is a palindrome.");
        } 
        else 
        {
            System.out.println(" The Number "+original+ " is not a palindrome.");
        }  
    }
    
}
