
package myJava.bootcamp.section6.work;

public class MainForEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setFName("Corey");
        emp1.setLName("Schafer");
        emp1.setAge(38);
        emp1.setTier(2);

        System.out.println(emp1.getFullName());
        System.out.println(emp1.getTier());
        System.out.println(emp1.getAge());
    }
}
