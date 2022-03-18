package javapractice.osmanforhad;

/**
 *
 * @author osman forhad
 */
public class InstacneVariableExampleClass {
    
    //Instance variable
    public int a = 10;
    public int b = 12;
    public int c;
    
    public void add(){
        this.c = this.a + this.b;
        System.out.println(this.c);
    }
}
