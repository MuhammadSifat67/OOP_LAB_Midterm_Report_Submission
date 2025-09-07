public class Q11rightSideDownPyramidByNumbers5to1 
{
    public static void main(String[] args) 
    {
//Q-11:Print a right-side down pyramid by 5 to 1 numbers.
        for (int i = 5; i>= 1; i--)
        {
            for(int j = i; j >= 1; j--)
            {
               System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    
}
