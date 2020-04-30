import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.lang.Math;
/**
 * A button that can be used as control button for players to choose which alien moves in this turn.<br/><br/>
 * 
 * It can be used after correct linking(input correct arguments) and added to the frame.<br><br>
 * 
 * When the button is pressed, the player's order of moving corespound alien will let alien class "know".
 *
 * @author Yanzhihong 18722031
 * @version 1.0
 */
public class ChooseAliens extends JButton implements ActionListener
{
    // instance variables - replace the example below with your own
    private Aliens alien;
    private Dice dice;
    private int identity;
    private GameSequence sequence;
    private boolean canMove;
    /**
     * Constructor for objects of class ChooseAliens<br/><br/>
     * It should link(input correct arguments) with aliens, dice,and the GameSequence<br/><br/>
     * 
     * @param  a  a instance of Aliens that need to be control by this ChooseAliens button
     * @param  d  a instance of Dice that control the movement of the correspond alien 
     * @param  alienPicture  a instance of ImageIcon that contain a picture of correspond alien 
     * @param  i  a int, actually should be one static variable in GameSequence to identify this button's belong of player
     * @param  g  a instance of GameSequence that control the coordinate about buttons that player can press
     */
    public ChooseAliens(Aliens a,Dice d,ImageIcon alienPicture,int i,GameSequence g)
    
    {
        sequence=g;
        identity=i;
        setIcon(alienPicture);
        //setText(String.valueOf(number));
        addActionListener(this);
        alien=a;
        dice=d;
        
    }
    
    
    /**
     * 
     * A actionListener instruct how the button will react when it is pressed
     * 
     * 
     * @param  e  a instance assigned by system
     */
    public void actionPerformed(ActionEvent e){
        if(identity==sequence.getStep()){
            canMove=alien.move(dice.getResult());
            if(canMove==true){
                sequence.nextStep();
            }
        }
        
    }
    
}
