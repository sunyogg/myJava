public class MainForCarpet {
    public static void main(String[] args) {
        Floor floor = new Floor(10.0, 12.0);
        Carpet carpet = new Carpet(8);
        Calculator calculate = new Calculator(floor, carpet);
        System.out.println(calculate.getTotalCost());
    }
}