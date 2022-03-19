package javapractice.osmanforhad;

/**
 *
 * @author osman forhad
 */
abstract class AbstractClassExample {
    
    //this is the abstract method
    abstract void demo();
}

//__Helper Class to make accessable the Abastract class by making an object in main class__//
class Helper extends AbstractClassExample{
    @Override
    void demo(){
        System.out.println("This is Abstract Method which override from abstract class");
    }
}
