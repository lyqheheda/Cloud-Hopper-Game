
/**
 * This class is used to control the ability of buttons that can be used by players or it can be said the coordiation of buttons that can be pressed by players.<br/><br/>
 * 
 * For example, the playerleft has to roll the dice before moving the alien.<br/><br/>
 * 
 * This class need only one instance in this program<br/><br/>
 * This class has four static constants used to set the belonging relation of buttons.
 * 
 * For example, when the instance dice1 of class Dice is contructed,
 * input the LEFTROLL represent mark dice1 is belong to playerleft.<br/><br/>
 * 
 * This class only need one instance and input the reference of it in buttons of players to control the game procedure.<br/><br/>
 * 
 * In default, the palyerleft roll the dice first.<br/>
 * 
 * @author YanZhihong_18722031_37532359
 * @version 1.0
 */
public class GameSequence
{
    // instance variables - replace the example below with your own
    private int sequence;
    public static final int LEFTROLL=1;
    public static final int LEFTCHOOSE=2;
    public static final int RIGHTROLL=3;
    public static final int RIGHTCHOOSE=4;
    /**
     * Constructor for objects of class GameSequence
     */
    public GameSequence(){
        // initialise instance variables
        sequence = 1;
        
    }
    
    /**
     * Used to start next step of the game
     * Call it when player rolling or choosing alien
     * 
     */
    public void nextStep(){
        
        sequence++;
        if(sequence==5){
            sequence=1;
        }
        
    }
    
    
    /**
     * Get the recent step of game
     * Call it when judgeing if the button should be pressed
     * If the identity of the button is equal to the return value, it should be pressed
     */
    public int getStep(){
        return sequence;
    }

}
