package javapractice.osmanforhad;

/**
 *
 * @author osman forhad
 * 
 * This is the super class
 */
public class FatherClass {
    
    public int a = 500;
    public int b = 300;
    public int c;
    
    public void add () {
       this.c = this.a + this.b;
       System.out.println(this.c);
    }
    
}
