import javax.swing.*;
import java.awt.*;

public class load extends JFrame {
    JLabel im;
    JProgressBar pb;
    ImageIcon img;
    JLabel score;
    String na;
    load(String name) throws InterruptedException {
        na=name;
        img=new ImageIcon("icon\\c2.jpg");
        im=new JLabel(img);
        im.setBounds(0,0,600,400);
        score=new JLabel("0 %");
        score.setBounds(550,320,50,30);
        add(score);
        pb=new JProgressBar();
        pb.setBounds(2,345,583,30);
        pb.setForeground(Color.green);

        add(pb);
        add(im);
     setVisible(true);
    setBounds(450,100,600,400);
    proc();
    }
public void proc() throws InterruptedException {
        try {
            for (int i=0;i<=100;i++){
                Thread.sleep(50);
                score.setText(i+" %");
                pb.setString(" Loding.. "+i+" %");
                pb.setValue(i);
            }
            this.setVisible(false);
            new Login();
        }
        catch (Exception e){

        }
}
    public static void main(String[] args) {
        try {
            new  load("Kalyani");
        }
        catch (Exception e){

        }

    }
}
