package java.bootcamp.section6.challenges;

public class MainForComplex {
    public static void main(String[] args) {
        ComplexNumber cNumber = new ComplexNumber(3, 5);
        System.out.println(cNumber.getReal());
        ComplexNumber cNum = new ComplexNumber(4, 6);
        System.out.println(cNum.getImaginary());
        System.out.println(cNumber.getBoth());
        cNumber.add(cNum);
        System.out.println(cNumber.getBoth());
        cNumber.subtract(2, 3);
        System.out.println(cNumber.getBoth());
        cNumber.subtract(2, 9);
        System.out.println(cNumber.getBoth());
    }
}