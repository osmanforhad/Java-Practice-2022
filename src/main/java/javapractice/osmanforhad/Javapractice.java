package javapractice.osmanforhad;

/**
 *
 * @author osman forhad
 * 
 * This is the Main Class or
 *  Entry Point of the Application
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
        //Working With Static Variable Concept
        System.out.println(StaticMethodVariableExampleClass.a);
         //Working With Static Method Concept
         StaticMethodVariableExampleClass.add();
         //Working With Inheritance and Method Overriging Concept
         SonClass SonObj = new SonClass();
         SonObj.add();
         System.out.println(SonObj.b);
         //Working With Method Overloading Concept
         MethodOverLoadingExampleClass OverloadObj = new MethodOverLoadingExampleClass();
         OverloadObj.osman(3, 2);
         OverloadObj.osman(10, 20, 30);
         OverloadObj.osman(1.3, 5.2);
         //Working With Paramitarized Constructor Method Concept
         ConstructorExampleClass ConstructorObj = new ConstructorExampleClass(900);
         ConstructorObj.demo();
             //constructor overloading
             ConstructorExampleClass ConstructorOveloadObj = new ConstructorExampleClass(10.23467);
        //Working With Super Keyword Concept
        SubClass SuperKeyobj = new SubClass();
        SuperKeyobj.Print();
         //Working With Java Interface Concept
         InterfaceExampleClass InterfaceObj = new InterfaceExampleClass();
         InterfaceObj.FirstMethod();
         InterfaceObj.SecondMethod();
         InterfaceObj.ThirdMethod();
         //Working With Java Abstract Class and Method Concept
           Helper absObj = new Helper();
           absObj.demo();
         //Working With Setter Getter Concept
         SetterGetterExampleClass StrGtrObj = new SetterGetterExampleClass();
         System.out.println(StrGtrObj.GetterName());
         StrGtrObj.SetterAddress("Feni Bangladesh");
        //Working With Thread By Inheritance Concept
        ThreadExampleAClass OsmanObj = new ThreadExampleAClass();
        ThreadExampleBClass ForhadObj = new ThreadExampleBClass();
        OsmanObj.start();
        ForhadObj.start();
        //Working With Thread By Interface Concept
        ThreadByInterfaceA ObjA = new ThreadByInterfaceA();
        ThreadByInterfaceB ObjB = new ThreadByInterfaceB();
        Thread x = new Thread(ObjA);
        x.start();
        Thread y = new Thread(ObjB);
        y.start();
         
    }
}
