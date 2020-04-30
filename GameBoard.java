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
 * Write a description of class GameBoard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameBoard
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class GameBoard
     */
    public GameBoard()
    {
        // initialise instance variables
        x = 0;
    }
    
    static public void test(){
        
        GameSequence g=new GameSequence();
        
        TestSet j1=new TestSet();
        TestSet j2=new TestSet();
        
        j1.setBounds(0,150,50,30);
        j2.setBounds(200,150,50,30);
        
        Note n=new Note("note");
        n.setLocation(50,250);
        
        Dice d1=new Dice(GameSequence.LEFTROLL,g,j1,n);//创建是连接相应的控件实例
        Dice d2=new Dice(GameSequence.RIGHTROLL,g,j2,n);
        
        d1.setBounds(0,100,50,50);
        d2.setBounds(200,100,50,50);
        
        Aliens a1=new Aliens(1);
        Aliens a2=new Aliens(2);
        Aliens a3=new Aliens(3);//测试用的，输入的参数是外星人的名字
        Aliens a4=new Aliens(4);
        
        
        ImageIcon icon[]= new ImageIcon[4];//临时找的一批图片，用于外星人按钮
        icon[0]=new ImageIcon("alien1.jpg");
        icon[0].setImage(icon[0].getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        
        icon[1]=new ImageIcon("alien2.jpg");
        icon[1].setImage(icon[1].getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        
        icon[2]=new ImageIcon("alien3.jpg");
        icon[2].setImage(icon[2].getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        
        icon[3]=new ImageIcon("alien4.jpeg");
        icon[3].setImage(icon[3].getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        
        ChooseAliens c1=new ChooseAliens(a1,d1,icon[0],GameSequence.LEFTCHOOSE,g);
        ChooseAliens c2=new ChooseAliens(a2,d1,icon[1],GameSequence.LEFTCHOOSE,g);
        ChooseAliens c3=new ChooseAliens(a3,d2,icon[2],GameSequence.RIGHTCHOOSE,g);
        ChooseAliens c4=new ChooseAliens(a4,d2,icon[3],GameSequence.RIGHTCHOOSE,g);
        
        c1.setBounds(0,0,50,50);
        c2.setBounds(0,50,50,50);
        c3.setBounds(200,0,50,50);
        c4.setBounds(200,50,50,50);
        
        
        //这些类如上构建后，加入frame后按钮提示框设定框才可正常运行
        
        JPanel p=new JPanel();
        p.setLayout(null);
        p.add(j1);
        p.add(j2);
        p.add(c1);
        p.add(c2);
        p.add(c3);
        p.add(c4);
        p.add(d1);
        p.add(d2);
        p.add(n);
        
        JFrame f=new JFrame();
        f.setBounds(500,400,600,600);
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.setVisible(true);
        
    }

}
