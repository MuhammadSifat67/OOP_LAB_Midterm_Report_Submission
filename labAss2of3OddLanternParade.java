public class labAss2of3OddLanternParade 
{

    public static void main(String[] args)
    {
        int n = 10, odd, sum = 0;
        System.out.print("The Odd Numbers Are: ");
/*3. Write a Java program to print the first n odd numbers and their sum.[TheOddLantern
Parade]*/        
        for (int i=1; i<=n; i++)
        {
            odd = 2*i-1;
            System.out.print(odd+ " ");
            sum = sum+odd;
        }
        System.out.println ();
        System.out.println("The Sum of Odd Natural Number Upto " +n+ " Terms: " + sum);
    }
    
}
