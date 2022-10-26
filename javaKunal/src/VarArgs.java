
// 31

// to pass arbitrary number of arguments in the method call define the parameter
// using three dots(...) before the name of the paratmeter.
// static void func_name(parameter_type ...parameter_name){
     //method body
//}

public class VarArgs {
    public static void main(String[] args) {

        func(3, 2, 3, 4, 55, 75, 54, 2);

    }
    static void func(int a, int ...v){
        System.out.println(a);
        for (int i:v){
            System.out.println(i);
        }
    }
}
