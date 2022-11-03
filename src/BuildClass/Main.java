package BuildClass;

import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        boolean debug = false;

        ComplexNumber number = new ComplexNumber(6, 3);
        System.out.println("Number is: " + number.toString());

        number.SetImaginary(-3);
        System.out.println("Number is: " + number.toString());

        System.out.print("Magnitude is: ");
        System.out.println(number.GetMagnitude());

        ComplexNumber number2 = new ComplexNumber(-2, 8);
        number.Add(number2);
        System.out.print("After adding: ");
        System.out.println(number.toString());

        if (debug)
        {
            new Scanner(System.in).nextLine();
        }
    }
}
