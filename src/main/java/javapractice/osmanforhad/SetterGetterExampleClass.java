package javapractice.osmanforhad;

/**
 *
 * @author osman forhad
 */
public class SetterGetterExampleClass {
    private final String name = "osman";
    private String address;

    public String GetterName(){
        return name;
    }
    public void SetterAddress(String setAddress){
        this.address = setAddress;
        System.out.println(this.address);
    }
}
