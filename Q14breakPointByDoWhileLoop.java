public class Q14breakPointByDoWhileLoop 
{

    public static void main(String[] args) 
    {
        char i = 'a'; 
        do
//Q-14:Print 'a' to 'z' and break in 'k' using a do-while loop.
        {
            System.out.print(i+ " ");
            
            if(i=='k')
            {
                break;
            }
            i++;
        }
        while(i<='z');
    }
    
}
