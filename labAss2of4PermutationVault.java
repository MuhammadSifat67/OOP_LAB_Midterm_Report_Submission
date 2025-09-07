public class labAss2of4PermutationVault 
{

    public static void main(String[] args)
    {
        int n = 5;
        long factorial = 1;
/*4. Write a Java program to calculate and print the factorial of a number using a for loop.
[ThePermutationVault]*/    
        for (int i=1; i<=n; i++)
        {
            factorial = factorial*i;
        }
        System.out.println("The Museum Vault Key " +n+ " Unlocks in: " +factorial+ " Ways.");
    }   
}
