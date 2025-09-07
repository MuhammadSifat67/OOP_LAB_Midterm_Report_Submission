public class Q15breakPointByForLoop 
{

    public static void main(String[] args) 
    {
       char i;
//Q-15:Print 'a' to 'z' and break in 'o' using a for loop.
       System.out.print("The Characters from 'a' to 'z' is: ");
       for(i = 'a'; i<='z'; i++)
       {
        System.out.print( i+ " ");
       if(i=='o')
        {
           break;
        }
       }
    }
    
}
