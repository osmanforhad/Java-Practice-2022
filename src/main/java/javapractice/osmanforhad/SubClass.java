package javapractice.osmanforhad;

/**
 *
 * @author osman forhad
 */
public class SubClass extends SuperClass{
   
    //__Constructor Method__//
    SubClass(){
        super();//__calling the constructor method from super class__//
        System.out.println("Constructor From Sub Class");
    }
    
    
    //__Override__//
    void Print(){
        super.Print();//__Calling Method from Super Class__//
        System.out.println("From Sub Class");
    }
}
