public class labAss2of2StarStepsDisplay 
{

    public static void main(String[] args) 
    {
        int n = 5, i = 1;
/*2. Write a Java program to display a right-angled triangle pattern of stars (*) using nested
while loops. [TheStarStepsDisplay]*/       
        while (i<=n)
        {
            int j = 1;
            while (j<=i)
            {
                System.out.print("*");
                j++;
            }
            System.out.println ();
            i++;          
        }
    }
    
}
