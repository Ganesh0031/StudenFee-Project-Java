import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class Login extends JFrame implements ActionListener {
    JPanel head,form;
    Color color;
    ImageIcon back,adminl,exiti,signup,login,error,i;
    JLabel backl,adminll,lLogin,lUsername,Passwordl,masage;
     JTextField Usernamet,Passwordt;
     JButton BLogin,BSignup,BExit;
    Login(){
        i=new ImageIcon("images\\appicon.png");
        setIconImage(i.getImage());
          setTitle("Admin Login");
        setLayout(null);
        error=new ImageIcon("icon\\—Pngtree—error icon_4550477.png");
        back=new ImageIcon("icon\\back3.jpg");
        exiti=new ImageIcon("icon\\exit.png");
        signup=new ImageIcon("icon\\signup.png");
        login=new ImageIcon("icon\\login.png");
        masage=new JLabel("");
        masage.setBounds(300,200,300,40);
        masage.setForeground(Color.red);
        masage.setBackground(Color.black);
        add(masage);
        backl=new JLabel(back);
        backl.setBounds(0,0,500,550);
        adminl=new ImageIcon("icon\\admin.png");
        adminll=new JLabel(adminl);
        adminll.setBounds(0,0,100,50);
        head=new JPanel();
        color=new Color(0X000047);
        head.setBackground(color);
        head.setBounds(0,0,550,80);
        head.add(adminll);
        add(head);
         // head sequsion
        lLogin=new JLabel("Login");
        lLogin.setBounds(200,30,150,40);
        lLogin.setForeground(Color.white);
        lLogin.setFont(new Font("arial",Font.BOLD,20));
        head.add(lLogin);
        form=new JPanel();
        form.setBounds(0,40,550,450);
        form.add(backl);
        lUsername=new JLabel("Username");
        Passwordl=new JLabel("Password");
        lUsername.setBounds(150,130,100,30);
        Passwordl.setBounds(150,180,100,30);
        add(lUsername);
        add(Passwordl);

        Usernamet=new JTextField();
        Usernamet.setFont(new Font("arial",Font.BOLD,16));
        Usernamet.setBounds(250,130,250,30);
        add(Usernamet);
        Passwordt=new JTextField();
        Passwordt.setFont(new Font("arial",Font.BOLD,16));
        Passwordt.setBounds(250,180,250,30);
        add(Passwordt);
        BLogin=new JButton("Login");
        BLogin.setIcon(login);
        BLogin.setBounds(150,250,100,30);
        BLogin.setBackground(Color.green);
        BLogin.addActionListener(this);
        BLogin.setForeground(Color.WHITE);
        BSignup=new JButton("Signup");
        BSignup.setIcon(signup);
        BSignup.addActionListener(this);
        BSignup.setBounds(266,250,120,30);
        BSignup.setBackground(Color.blue);
        BSignup.setForeground(Color.WHITE);

        BExit=new JButton("Exit");
        BExit.setIcon(exiti);
        BExit.addActionListener(this);
        BExit.setBackground(Color.red);
        BExit.setForeground(Color.WHITE);
        BExit.setBounds(400,250,100,30);
        add(BLogin);
        add(BSignup);
        add(BExit);
        add(form);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setBounds(500,100,550,400);
    }
    void uservarification(String user,String pass){
        Connection c;
        Statement s;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost/mca","root","");
            String select="select * from signupp where username=? and password=?";
            PreparedStatement pr=c.prepareStatement(select);
            pr.setString(1,user);
            pr.setString(2,pass);
           ResultSet r= pr.executeQuery();
           if (r.next()){
               JOptionPane.showMessageDialog(this,"Login Successul");
           new Dashabord(user);
           this.dispose();
           }
           else{
               JOptionPane.showMessageDialog(this,"Wrong username and password!");
           }
        }
        catch (Exception e){

        }

    }
    public  void actionPerformed(ActionEvent e){
        if (e.getSource()==BExit){
           System.exit(0);
        }
        if (e.getSource()==BSignup){
            this.setVisible(false);
            new Signup_page();

        }
        if (e.getSource()==BLogin){
            validation();
        }

    }
    boolean validation(){
        String usernas,passwords;
        usernas=Usernamet.getText();
        passwords=Passwordt.getText();
        if (usernas.trim().equals("")||passwords.trim().equals("")){

            masage.setText("Please Enter Username and Password!");

        }
        else{
            uservarification(usernas,passwords);
        }

        return true;
    }
    public static void main(String[] args) {
new Login();
    }
}
