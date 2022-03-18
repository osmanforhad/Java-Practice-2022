package javapractice.osmanforhad;

/**
 *
 * @author osman forhad
 */
public class Javapractice {

    public static void main(String[] args) {
        //Working With Function Parameter Concept
        AddClass ObjectHolder = new AddClass();
        ObjectHolder.add(6, 5);
        ObjectHolder.multiply(6, 5);
            //Working With OOP JAVA Concept
        MyClass ObjectVariable = new MyClass();
        ObjectVariable.myfunction();
        ObjectVariable.myfunction2();
        //Working With Instance Variable Concept
        InstacneVariableExampleClass MyObject = new InstacneVariableExampleClass();
        MyObject.add();
                  //Accessing instance variable through the object
        System.out.println(MyObject.a);
        //Working With Local Variable Concept
        LocalVariableExampleClass LocalVariableObject = new LocalVariableExampleClass();
        LocalVariableObject.add();
                    //Accessing Local Variable with the help of instance variable through the object
        System.out.println(LocalVariableObject.instanceVariable);
        
    }
}
