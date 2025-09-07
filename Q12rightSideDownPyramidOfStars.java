public class Q12rightSideDownPyramidOfStars 
{

    public static void main(String[] args) 
    {
        int n = 4;
//Q-12:Print a right-side down pyramid of stars with 4 rows.    
        for (int i = n; i>= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println( );
        }
    }
    
}
