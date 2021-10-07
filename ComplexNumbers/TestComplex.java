import java.util.Scanner;

public class TestComplex{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the real part of first number: ");
        double re1 = sc.nextDouble();

        System.out.println("Enter the image part of first number: ");
        double im1 = sc.nextDouble();

        System.out.println("Enter the real part of second number: ");
        double re2 = sc.nextDouble();

        System.out.println("Enter the image part of second number: ");
        double im2 = sc.nextDouble();

        Complex firstNumber = new Complex(re1, im1);
        Complex secondNumber = new Complex(re2, im2);
        Complex thirdNumber = Complex.sumOfNumbers(firstNumber, secondNumber);
	    Complex fourthNumber = Complex.subOfNumbers(firstNumber, secondNumber);;

        System.out.println("The first number: (" + firstNumber.re + ") + (" + firstNumber.im + ")i");
        System.out.println("The second number: (" + secondNumber.re + ") + (" + secondNumber.im + ")i");

        System.out.println("Module of the first number: " + firstNumber.getModule());
        System.out.println("Module of the second number: " + secondNumber.getModule());

        System.out.println("Argument of the first number: " + firstNumber.getArgument());
        System.out.println("Argument of the second number: " + secondNumber.getArgument());

        System.out.println("Sum of Numbers: (" + thirdNumber.re + ") + (" + thirdNumber.im + ")i");
        System.out.println("Sub of Numbers: (" + fourthNumber.re + ") + (" + fourthNumber.im + ")i");
    }
}
