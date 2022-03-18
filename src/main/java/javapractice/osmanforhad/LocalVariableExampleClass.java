package javapractice.osmanforhad;

/**
 *
 * @author osman forhad
 */
public class LocalVariableExampleClass {

    //Instance Variable
    public int instanceVariable;
    
    public void add() {
        //Local variable
        int a = 50;
        this.instanceVariable = a; //working with local and instnace variable concept
        int b = 50;
        int c;
        c = a+b;
        System.out.println(c);

    }
}
