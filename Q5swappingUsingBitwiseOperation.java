public class Q5swappingUsingBitwiseOperation 
{

    public static void main(String[] args) 
    {
        int a = 49;//0101
        int b = 98;//1010
        
        System.out.println ("Before Swap: ");
        System.out.println("a: " +a);//Q-5: Swap two numbers using bitwise operation (XOR) in Java.
        System.out.println("b: " +b);
        
        a = a^b;//XOR Sign.
        b = a^b;
        a = a^b;
        
        System.out.println("After Swap: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    
}
