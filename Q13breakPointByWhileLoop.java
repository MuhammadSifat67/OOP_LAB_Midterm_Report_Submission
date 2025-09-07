public class Q13breakPointByWhileLoop
{

    public static void main(String[] args) 
    {
        char i = 'a';
//Q-13:Print 'a' to 'z' and break in 'k' using a while loop. 
        while (i<='z')
        {
            System.out.print(i+ " ");
            
            if (i=='k')
            {
                break;
            }
            i++;
        }
    }
    
}
