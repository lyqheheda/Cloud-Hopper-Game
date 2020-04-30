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
 * Write a description of class Note here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Note extends JLabel
{
    
    
    public Note(String set){
        setSize(500,30);
        setForeground(Color.RED);
        setText(set);
    }

    
    public void showDice(int result){
        setText("The result of dice is "+result);
    }
    
    
    public void showMove(int start, int end, String name){
        setText(name+" moved from "+start+" to "+end);
    }
    
    
    public void noMove(String alienName,String reason){
        setText(alienName+" cannot move because "+reason);
    }
}
