package javapractice.osmanforhad;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author osman forhad
 */
public class ThreadExampleAClass extends Thread{
    @Override
    public void run(){
        for (int i=0; i<=10; i++){
            try {
                sleep(900);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadExampleAClass.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("AA");
        }
    }
}
