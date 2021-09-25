import java.util.Scanner;

public class MathFunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        a. To return an harmonic number
         */
        System.out.println("Enter Number for Harmonic Series");
        int num = sc.nextInt();
        System.out.println("H" +num+ " = ");
        MathFunction.harmonicSeries(num);
        System.out.println();
        /*
        b. To return a sin of an angle
         */
        System.out.println(" ");
        System.out.println("Enter Sin Angle : ");
        double sin = sc.nextInt();
        MathFunction.isSin(sin);
        /*
        c. To return cosine of an angle
         */
        System.out.println(" ");
        System.out.println("Enter Cos Angle : ");
        double cosine = sc.nextInt();
        MathFunction.isCosine(cosine);
        /*
        d. To return Binary of a number
         */
        System.out.println(" ");
        System.out.println("Enter Decimal Number : ");
        int decimal = sc.nextInt();
        MathFunction.Binary(decimal);
    }
    /*
   a. To return an harmonic number
    */
    public static void harmonicSeries(int num) {
        for (int i = 1; i <= num; i++) {
            if (i == num)
                System.out.print(" 1/" + i);
            else
                System.out.print(" 1/" + i + " + ");
        }
    }

    /*
    b. To return a sin of an angle
     */
    public static void isSin(double sin) {
        double radian = Math.toRadians(sin);
        double sinValue = Math.sin(radian);
        System.out.println("sin(" + sin + ") =" + sinValue);
    }

    /*
    c. To return cosine of an angle
     */
    public static void isCosine(double cosine) {
        double radian = Math.toRadians(cosine);
        double cosValue = Math.cos(radian);
        System.out.println("cos(" + cosine + ") =" + cosValue);
    }

    /*
    d. To return Binary of a number
     */
    public static void Binary(int decimal) {
        int binary = 0, reminder, temp = 1;
        while (decimal != 0) {
            reminder = decimal % 2;
            decimal = decimal / 2;
            binary = binary + reminder * temp;
            temp = temp * 10;
        }
        System.out.println("Binary number is : " + binary);
    }

    /*
     * Purpose: method for finding square root using newton's law
     * num input from user
     * returns the square root
     * reference by GeeksforGeek etc
     */
    public double squareRootUsingNewtonMethod(int num) {
        double x, epsilon;
        x = num;
        epsilon = 1e-15;
        while (Math.abs(x - num / x) > epsilon * x) {
            x = (num / x + x) / 2.0;
        }
        return x;
    }

    /*
     * Purpose: method for finding prime number or not
     * take num input from user
     * returns true if prime else not prime
     */
    public static boolean isPrime(int num) {
        if (num == 0 || num == 1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % 2 == 0)
                return false;
        }
        return true;
    }

    /*
     * Purpose:Static function that takes one integer command line
        input n.
     * public static long factorial(int n)
     * take input "n" from a user
     * return n * factorial(n - 1);
     */

    public static long factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
}
