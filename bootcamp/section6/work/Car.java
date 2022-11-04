package java.bootcamp.section6.work;

public class Car {

    // states/features/fields of a car;
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        // a setter.
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") ||
                validModel.equals("harrier")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    public String getModel() {
        // a getter.
        return this.model;
    }


}

// The biggest advantage of getters and setters is that we employ checks to
// check whether a value being saved in a variable is correct or within the range
// or not.