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
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;
/**
 * This class is uesd to represent dice which can be rolled by player.<br/><br/>
 * 
 * When the button is predded, it will show the result of rolling dice.<br><br>
 * 
 * It should link(input correct arguments) with a instance of GameSequence, a instance of TestSet and a instance of Note.
 * 
 * It can be radomly assign a result after player's rolling or assigned a result by the tester.
 *
 * @author YanZhihong 18722031
 * @version 1.0
 */
public class Dice extends JButton implements ActionListener
{
    // instance variables - replace the example below with your own
    private int result;
    private Timer timer;
    private ImageIcon icon[];
    private Random random;
    private int identity;
    private GameSequence sequence;
    private TestSet setting;
    private Note note;
    /**
     * Constructor for objects of class Dice
     * @param  i  a static variable,which contained in the GameSequence, as the identity number of this dice
     * @param  g  a instance of GameSequence that control the coordinate about buttons that player can press
     * @param  l  a instance of TestSet to set the result of this dice 
     * @param  n  a Note label to show the result of every rolling
     */
    public Dice(int i,GameSequence g,TestSet l,Note n){
        setting=l;
        identity=i;
        sequence=g;
        note=n;
        timer=new Timer();
        random=new Random();
        icon= new ImageIcon[11];
        String pName=new String();
        //有个循环
        for(int j=0;j<10;j++){
            pName="dice"+String.valueOf(j)+".png";
            
            icon[j]=new ImageIcon(pName);
            icon[j].setImage(icon[j].getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
            
        }
        icon[10]=new ImageIcon("dice.gif");
        icon[10].setImage(icon[10].getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        setIcon(icon[8]);
        setBorder(null);
        setBackground(null);
        addActionListener(this);
        
        
    }
    
    /**
     * get the result of the dice.
     * 
     * @return a integer value of the result of dice(0-9).
     */
    public int getResult(){
        
        return result;
        
    }
    
    /**
     * set the result of the dice.
     * 
     * @param a integer value of the setting number(0-9).
     */
    public void setResult(int setNumber){
        
        result=setNumber;
        
    }
    
    public void roll(){
        
        result=random.nextInt(10);
        
        setIcon(icon[10]);
        
        timer.schedule(new TimerTask() {
            public void run() {
                setIcon(icon[result]);
                note.showDice(result);
            }
        }, 1000);
        
        
    }
    
    public void actionPerformed(ActionEvent e) {
        if(identity==sequence.getStep()){
            if(setting.getText().length()==0){
                roll();
                sequence.nextStep();
            }else {
                result=Integer.valueOf(setting.getSetText());
                note.showDice(result);
                setIcon(icon[result]);
                setting.setText("");
                sequence.nextStep();
            }
        }
        
    }
}
