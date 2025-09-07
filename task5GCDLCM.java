public class task5GCDLCM 
{

    public static void main(String[] args) 
    {
        int num1 = 24; 
        int num2 = 32; 

        int GCD = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                GCD = i;
            }
        }
        int LCM = (num1 * num2) / GCD;
        
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + GCD);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + LCM);
    }  
}
