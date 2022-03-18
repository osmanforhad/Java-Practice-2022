package javapractice.osmanforhad;

/**
 *
 * @author osman forhad
 * 
 * This is the sub class
 */
public class SonClass extends FatherClass{
    
    //Method Overriding Concept in Java
     @Override
     public void add () {
       this.c = this.a - this.b;
       System.out.println(this.c);
    }
    
}
