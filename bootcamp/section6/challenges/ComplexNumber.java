package java.bootcamp.section6.challenges;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public String getBoth() {
        return (this.real + " + " + "(" + this.imaginary + "i)");
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber number) {
        this.real += number.getReal();
        this.imaginary += number.getImaginary();
    }

    public void subtract (double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber number) {
        this.real -= number.getReal();
        this.imaginary -= number.getImaginary();
    }
}