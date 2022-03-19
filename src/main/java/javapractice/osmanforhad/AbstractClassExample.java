package javapractice.osmanforhad;

/**
 *
 * @author osman forhad
 */
abstract class AbstractClassExample {
    void demo(){
        System.out.println("This is The Abstract Class");
    }
}

//__Helper Class to make accessable the Abastract class by making an object in main class__//
class Helper extends AbstractClassExample{

}
