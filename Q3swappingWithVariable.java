public class Q3swappingWithVariable 

{

    public static void main(String[] args) 
    {
        int a = 22;
        int b = 36;//Q-3: Swap two variable using a third variable.
        int swap;
        
        System.out.println("Before Swapping.");
        System.out.println ("a = " +a);
        System.out.println ("b = " +b);
        
        swap = a;
        a = b;
        b = swap;
        System.out.println("After Swapping.");
        System.out.println ("a = " +a);
        System.out.println ("b = " +b);
    }
    
}
