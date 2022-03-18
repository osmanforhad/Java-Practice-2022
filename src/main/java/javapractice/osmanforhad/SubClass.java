package javapractice.osmanforhad;

/**
 *
 * @author osman forhad
 */
public class SubClass extends SuperClass{
   
    //__Override__//
    void Print(){
        super.Print();//__Calling Method from Super Class__//
        System.out.println("From Sub Class");
    }
}
