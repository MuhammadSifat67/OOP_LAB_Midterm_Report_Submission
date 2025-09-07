public class Q10rightSideDownPyramidByNumbers1to5 
{

    public static void main(String[] args) 
    {
//Q-10:Print a right-side down pyramid by 1 to 5 numbers.     
        for (int i = 5; i>= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    
}
