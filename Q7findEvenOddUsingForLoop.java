public class Q7findEvenOddUsingForLoop 
{

    public static void main(String[] args) 
    {
        int i;//Q-7:Print odd-even numbers from 1 to 10 using a for loop.
        
        for(i=1; i<=10; i++)
        {
            if(i%2==0)
            {
                System.out.println("The Output is 'Even': " +i);
            }
            else if(i%2!=0)
            {
                System.out.println("The Output is 'Odd': " +i);
            }
            else
            {
                System.out.println("INVALID INPUT." +i);
            }
                
       }
    }
    
}
