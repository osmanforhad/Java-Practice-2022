package javapractice.osmanforhad;

/**
 *
 * @author osman forhad
 */

interface First{
    void FirstMethod();
}
interface Second{
    void SecondMethod();
}
interface Third{
    void ThirdMethod();
}

public class InterfaceExampleClass implements First,Second,Third {
    @Override
    public void FirstMethod(){
        System.out.println("First Interface");
    }
    @Override
    public void SecondMethod(){
        System.out.println("Second Interface");
    }
    @Override
    public void ThirdMethod(){
        System.out.println("Thirs Interface");
    }
}
