package myJava.bootcamp.section6.work;

public class Employee {
    // fields / attributes
    private String fName;
    private String lName;
    private int tier;
    private int pay;
    private int age;
    private String project;

    // setters
    public void setFName(String firstName) {
        this.fName = firstName;
    }

    public void setLName(String lastName) {
        this.lName = lastName;
    }

    public void setTier (int tier) {
        if (tier > 0 && tier < 3) {
            this.tier = tier;
        } else {
            this.tier = -1;
        }
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public void setAge(int age) {
        if (age > 22 && age < 65) {
            this.age = age;
        } else {
            this.age = -1;
        }
    }

    public void setProject(String projectName) {
        this.project = projectName;
    }

    // getters
    public String getFullName() {
        return this.fName + " " + this.lName;
    }

    public int getTier() {
        return this.tier;
    }

    public int getPay() {
        return this.pay;
    }

    public int getAge() {
        return this.age;
    }

    public String getProject() {
        return this.project;
    }

}