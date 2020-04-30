
/**
 * Write a description of class Aliens here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Aliens
{
    // instance variables - replace the example below with your own
    private int identity;

    /**
     * Constructor for objects of class Aliens
     */
    public Aliens(int i)
    {
        // initialise instance variables
        identity = i;
    }



    
    public boolean move(int diceResult){
        System.out.println(identity+"want move "+diceResult);
        if(identity==1||identity==3){
            if(diceResult>6){
                System.out.println("and it moved");
                return true;
            }else{
                System.out.println("but can't move");
                return false;
            }
        }else{
            
                System.out.println("and it moved");
                return true;
        }
           
    }
    
}
