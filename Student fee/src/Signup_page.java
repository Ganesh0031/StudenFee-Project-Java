import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDateChooserBeanInfo;
//String inpu="UPDATE fees SET studentname='"+studentname+"',RollNo='"+Rol+"',paymentmod='"+paymentmod+"',cheque='"+cheque+"',banck='"+banck+"',dd='"+dd+"',courname='"+courname+"',gstin='"+gstin+"',totalamoun='"+totalamount+"',data='"+data+"',inishalamount='"+inishalamount+"',cgst=+'"+cgst+"',sgst='"+sgst+"',totalword='"+totalword+"',reparkk='"+reparkk+"',year1='"+year1+"',year2='"+year2+"' WHERE reciptNo='"+reciptN+"'";

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Signup_page extends JFrame implements ActionListener {
    JPanel headp,form;
    Color hc;
    JDateChooser dateChooser;
    String Firstname,Lastname ,Password,CPassword,username,date,Contact_no;
    JLabel signuplabel,signupl,backl,lFirstname,lLastname ,lPassword,lCPassword,lusername,lDOB,lContact_no,passwordlessthan,cpasswordlessthan,contactvalid;
    JTextField signup,firstname,lname,user,dob,cont;
    ImageIcon back,signupii,i;
    JPasswordField paaw,cpssw;
    JButton singupb,Loginb;
    ImageIcon loginlogo,signuplogo;
    Signup_page(){
        i=new ImageIcon("images\\appicon.png");
        setIconImage(i.getImage());
        setTitle("Admin Signup");
        setLayout(null);
        signuplogo=new ImageIcon("icon\\signup.png");
        loginlogo=new ImageIcon("icon\\login.png");
        signupii=new ImageIcon("icon\\signup.png");
        signuplabel=new JLabel(signupii);
        signuplabel.setBounds(0,20,100,50);
        back=new ImageIcon("icon\\back2.jpg");
        backl=new JLabel(back);
        backl.setBounds(0,0,500,550);
       // getContentPane().setBackground(Color.white);
        headp=new JPanel();
        signupl=new JLabel("signup");
        signupl.setBounds(200,200,200,40);
        signupl.setFont(new Font("arial",Font.BOLD,20));
        signupl.setForeground(Color.WHITE);
        headp.add(signuplabel);
        headp.add(signupl);
        headp.setBounds(0,0,500,80);
        hc=new Color(0X000047);
        headp.setBackground(hc);
        add(headp);
        form=new JPanel();
        form.setBounds(0,40,500,550);
        form.add(backl);
        firstname=new JTextField();
        firstname.setBounds(240,105,230,30);
        add(firstname);


        lname=new JTextField();
        lname.setBounds(240,155,230,30);
        lname.setFont(new Font("Baskerville Old Face",Font.PLAIN,15));
        add(lname);

        user=new JTextField();
        user.setBounds(240,205,230,30);
        add(user);

        paaw=new JPasswordField();

        paaw.setBounds(240,255,230,30);
        add(paaw);

        cpssw=new JPasswordField();
        cpssw.setBounds(240,305,230,30);
        add(cpssw);

        dateChooser=new JDateChooser();
        dateChooser.setBounds(240,355,230,30);
        add(dateChooser);

        cont=new JTextField();
        cont.setBounds(240,405,230,30);
        add(cont);
        cpasswordlessthan=new JLabel();
        contactvalid=new JLabel();
        lFirstname=new JLabel("Firstname :");
        lLastname=new JLabel("Lastname :");
        lusername=new JLabel("username :");
        passwordlessthan=new JLabel();
        lPassword=new JLabel("Password :");
        lCPassword=new JLabel("Confirme p:");
        lDOB=new JLabel("D.O.B :");
        lContact_no=new JLabel("Contact no :");

        lFirstname.setBounds(150,100,100,40);
        lLastname.setBounds(150,150,100,40);
        lusername.setBounds(150,200,100,40);
        lPassword.setBounds(150,250,100,40);
        passwordlessthan.setBounds(240,225,250,40);
        cpasswordlessthan.setBounds(240,277,250,30);
        lCPassword.setBounds(150,300,100,40);
        lDOB.setBounds(150,350,100,40);
        contactvalid.setBounds(240,372,250,40);
        lContact_no.setBounds(150,400,100,40);

        lFirstname.setFont(new Font("arial",Font.CENTER_BASELINE,12));
        lLastname.setFont(new Font("arial",Font.CENTER_BASELINE,12));
        lusername.setFont(new Font("arial",Font.CENTER_BASELINE,12));
        lPassword.setFont(new Font("arial",Font.CENTER_BASELINE,12));
        lCPassword.setFont(new Font("arial",Font.CENTER_BASELINE,12));
        lDOB.setFont(new Font("arial",Font.CENTER_BASELINE,12));
        lContact_no.setFont(new Font("arial",Font.CENTER_BASELINE,12));

        passwordlessthan.setForeground(Color.red);
        cpasswordlessthan.setForeground(Color.red);
        contactvalid.setForeground(Color.red);
        lFirstname.setForeground(hc);
        lLastname.setForeground(hc);
        lusername.setForeground(hc);
        lPassword.setForeground(hc);
        lCPassword.setForeground(hc);
        lDOB.setForeground(hc);
        lContact_no.setForeground(hc);

        add(lFirstname);
        add(lLastname);
        add(lusername);
        add(lPassword);
        add(lCPassword);
        add(lDOB);
        add(lContact_no);
     add(passwordlessthan);
     add(cpasswordlessthan);
     add(contactvalid);
        singupb=new JButton("Signup");
        singupb.setIcon(signuplogo);
        singupb.setBounds(200,455,120,30);
        singupb.setBackground(Color.BLUE);
        singupb.setForeground(Color.WHITE);
        singupb.addActionListener(this);
        add(singupb);
        Loginb=new JButton("Login");
        Loginb.setIcon(loginlogo);
        Loginb.addActionListener(this);
        Loginb.setBounds(380,455,100,30);
        Loginb.setBackground(Color.green);
        Loginb.setForeground(Color.WHITE);
        add(Loginb);
        add(form);
         setVisible(true);
    setBounds(500,100,500,600);
    }
    void insertdetails(){
        Firstname=firstname.getText();
        Lastname=lname.getText();
        Password=paaw.getText();
        CPassword=cpssw.getText();
        username=user.getText();

        SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-mm-dd");
        String date=dateFormat.format(dateChooser.getDate());
        Contact_no=cont.getText();
        Connection c;
        Statement s;
        String inpu="insert into signupp values(0,'"+Firstname+"','"+Lastname+"','"+username+"','"+CPassword+"','"+Password+"','"+date+"','"+Contact_no+"')";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost/mca","root","");
            s=c.createStatement();
            s.execute(inpu);


        }
        catch (Exception e){

        }


    }
    boolean validation(){


        Firstname=firstname.getText();
        Lastname=lname.getText();
        Password=paaw.getText();
        CPassword=cpssw.getText();
        username=user.getText();

        SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-mm-dd");
        String date=dateFormat.format(dateChooser.getDate());
        Contact_no=cont.getText();
        if (Firstname.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter firstName");
            return false;
        }
        if (Lastname.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter LastName");
            return false;
        }
        if (username.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter username");
            return false;
        }
        if (Password.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter Password");
            return false;
        }
        if (Password.length()<8){
            passwordlessthan.setText("Password should be 8 digit");
            return false;
        }
        else{
            passwordlessthan.setText("");
        }
        if (CPassword.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter CPassword");
            return false;
        }
     if (!Password.equals(CPassword)){
         JOptionPane.showMessageDialog(this,"Password not a match Confirm Password ");
         return false;
     }
     else {

     }
//        if (DOB.equals("")){
//            JOptionPane.showMessageDialog(this,"Please enter Date of Birth");
//            return false;
//        }
        if (Contact_no.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter Contact_no");
            return false;
        }else{

        }

        if (Contact_no.length()==10){
            contactvalid.setText("");
        }
        else{
            contactvalid.setText("contact should be 10 digit");
        }
        insertdetails();
        return true;
    }


    public void actionPerformed(ActionEvent e){
        if (e.getSource()==Loginb){
            this.setVisible(false);
            new Login();

        }
if (e.getActionCommand()=="Signup"){
   if (validation()){
       insertdetails();
       JOptionPane.showMessageDialog(this,"New Admin Registration Successfull !");
   }

}
    }


}
