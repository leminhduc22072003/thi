package BuildClass;

import java.util.*;
public class ComplexNumber
{
    protected double a, b;

    public ComplexNumber(double realPart, double imaginaryPart)
    {
        a = realPart;
        b = imaginaryPart;
    }

    public final double GetReal()
    {
        return a;
    }

    public final void SetReal(double a)
    {
        this.a = a;
    }

    public final double GetImaginary()
    {
        return b;
    }

    public final void SetImaginary(double b)
    {
        this.b = b;
    }

    public final String toString()
    {
        return "(" + a + "," + b + ")";
    }

    public final double GetMagnitude()
    {
        return Math.sqrt((a * a) + (b * b));
    }

    public final void Add(ComplexNumber c2)
    {
        a += c2.GetReal();
        b += c2.GetImaginary();
    }
}