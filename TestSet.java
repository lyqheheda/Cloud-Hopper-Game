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
 * Write a description of class SetNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestSet extends JTextField
{
    String temp;
    /**
     * Constructor for objects of class SetNumber
     */
    public TestSet(){
        
    }


    public String getSetText()
    {
        temp=getText();
        System.out.println(getText());
        System.out.println(temp.length());
        if(temp.length()==1&&(temp.compareTo("0")>=0&&temp.compareTo("9")<=0)){
            return getText();
        }else{
            return "0";
        }
        
    }
}
