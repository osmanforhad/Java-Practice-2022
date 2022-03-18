package javapractice.osmanforhad;

/**
 *
 * @author osman forhad
 * 
 */
public class MethodOverLoadingExampleClass {
    
    
    public void osman(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
    
    public void osman(int x, int y, int z){
        int r =  x + y + z;
        System.out.println(r);
    }
    
    public void osman(double e, double f){
        double d = e+f;
        System.out.println(d);
    }
    
}
