import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;

public class painding_Fee extends JFrame implements ActionListener {
    Color color,fcolor;
    JPanel leftl;
    DefaultTableModel m=new DefaultTableModel();
    JTable t=new JTable(m);
    ImageIcon i1,i2,i3,i4,i5,c2,c4,i;
    JButton b1,b2,b3,b4,b5,b7,b13,b14,b15,Print,Exam_fee,Admission_Fee,Painding_Fee,Course;
    JButton Submit,Print_Exam_Fee_Recipt;
    Border br;
    JTextField Courses,t9,Total_Amount,t11,t12,t13;
    JComboBox corseb;
    JLabel titlel1,titlel2,titlel3,titlel4,backlabel;
    painding_Fee(){
        setLayout(null);

        m.addColumn("reciptNo ");
        m.addColumn("data");
        m.addColumn("paymentmod");
        m.addColumn("Fee_Types");
        m.addColumn("Student_Name");
        m.addColumn("roll");
        m.addColumn("year01");
        m.addColumn("year02");
        m.addColumn("Castes");
        m.addColumn("MobileNo");
        m.addColumn("courname");
        m.addColumn("Total_Amounts");
        m.addColumn("ped_unpe");
        m.addColumn("reparkk");

        i=new ImageIcon("images\\appicon.png");
        setIconImage(i.getImage());
        setTitle("Painding Fee");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        String Mode_of_Payment[]={"Cash","Online"};
        String c[]={"Select Cource Name"};
        c4=new ImageIcon("images\\l2-removebg-preview.png");
        //c1=new ImageIcon("images\\l2-removebg-preview.png");
        c2=new ImageIcon("icon\\l2-removebg-preview.png");
        i1=new ImageIcon("icon\\icons8-home-50.png");
        i2=new ImageIcon("icon\\icons8-search-client-50.png");
        i3=new ImageIcon("icon\\icons8-edit-64 (2).png");
        i4=new ImageIcon("icon\\icons8-report-64.png");
        i5=new ImageIcon("icon\\back4.jpg");

        color=new Color(0X000047);
        fcolor=new Color(0Xfffff);
        backlabel=new JLabel(i5);
        backlabel.setBounds(0,0,1200,650);

        titlel1=new JLabel("pravara");
        titlel1.setBounds(650,-8,550,40);
        titlel1.setFont(new Font("arial",Font.BOLD,15));
        titlel1.setForeground(Color.WHITE);
        add(titlel1);

        titlel2=new JLabel("PIRENS INSTITUTE OF BUSSINESS MANAGEMENT ");
        titlel2.setBounds(450,15,500,30);
        titlel2.setFont(new Font("arial",Font.BOLD,20));
        titlel2.setForeground(Color.WHITE);
        add(titlel2);

        titlel3=new JLabel("AND ADMINISTRATION (IBMA) LONI (BK)");
        titlel3.setBounds(580,30,550,40);
        titlel3.setFont(new Font("arial",Font.BOLD,13));
        titlel3.setForeground(Color.WHITE);
        add(titlel3);

        titlel4=new JLabel("Contact(02427-244521/02427-244947/000000/Email:pirens@gmail.com");
        titlel4.setBounds(500,45,550,40);
        titlel4.setFont(new Font("arial",Font.BOLD,13));
        titlel4.setForeground(Color.WHITE);
        add(titlel4);



        JLabel l3=new JLabel(c4);
        l3.setFont(new Font("Tahoma",Font.BOLD,30));
        l3.setForeground(Color.WHITE);
        l3.setBounds(0,0,300,150);
        add(l3);

        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,1950,80);
        p1.setBackground(color);
        add(p1);

        try{
            Connection con;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/mca","root","");
            PreparedStatement p=con.prepareStatement("select * from pending_fee");
            ResultSet r=p.executeQuery();
            while (r.next()){
                String reciptN=r.getString("reciptNo");
                String data=r.getString("data");
                String paymentmod=r.getString("paymentmod");
                String Fee_Types=r.getString("Fee_Types");
                String Student_Name=r.getString("Student_Name");
                String roll=r.getString("roll");
                String year01=r.getString("year01");
                String year02=r.getString("year02");
                String Castes=r.getString("Castes");
                String MobileNo=r.getString("MobileNo");
                String courname=r.getString("courname");
                String Total_Amounts=r.getString("Total_Amounts");
                String ped_unpe=r.getString("ped_unpe");
                String reparkk=r.getString("reparkk");

                m.addRow(new Object[]{reciptN,data,paymentmod,Fee_Types,Student_Name,roll,year01,year02,Castes,MobileNo,courname,Total_Amounts,ped_unpe,reparkk});
            }
            JScrollPane j=new JScrollPane(t);
            j.setBounds(300,100,1000,700);
            add(j);
        }
        catch (Exception e){
            System.out.println(e);
        }
//****************//*********************//**************************//*********************//****************//
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,65,300,1000);
        p2.setBackground(color);
        add(p2);

        b1=new JButton("Home");
        b1.setBackground(new Color(0,0,102));
        b1.setFont(new Font("Tahoma",Font.PLAIN,20));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.setBounds(0,80,300,40);
        p2.add(b1);



        b4=new JButton("Course List ");
        b4.setBackground(new Color(0,0,102));
        b4.setFont(new Font("Tahoma",Font.PLAIN,20));
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        b4.setBounds(0,130,300,40);
        p2.add(b4);

        Admission_Fee=new JButton("Show Admission Fee Details");
        Admission_Fee.setBackground(new Color(0,0,102));
        Admission_Fee.setFont(new Font("Tahoma",Font.PLAIN,20));
        Admission_Fee.setForeground(Color.WHITE);
        Admission_Fee.addActionListener(this);
        Admission_Fee.setBounds(0,180,300,40);
        p2.add(Admission_Fee);

        br=new LineBorder(color);

        Print=new JButton("Print Admission Fee Recipt");
        Print.setBackground(new Color(0,0,102));
        Print.setFont(new Font("Tahoma",Font.PLAIN,20));
        Print.setForeground(Color.WHITE);
        Print.addActionListener(this);
        Print.setBounds(0,230,300,40);
        p2.add(Print);

        Painding_Fee=new JButton("Show Painding Fee Details");
        Painding_Fee.setBackground(new Color(0,0,102));
        Painding_Fee.setFont(new Font("Tahoma",Font.PLAIN,20));
        Painding_Fee.setForeground(Color.WHITE);
        Painding_Fee.addActionListener(this);
        Painding_Fee.setBounds(0,280,300,40);
        p2.add(Painding_Fee);

        b5=new JButton("Print Painding Fee Recipt");
        b5.setBackground(new Color(0,0,102));
        b5.setFont(new Font("Tahoma",Font.PLAIN,20));
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        b5.setBounds(0,330,300,40);
        p2.add(b5);

        Exam_fee= new JButton("Show Exam Fee Details");
        Exam_fee.setBackground(new Color(0,0,102));
        Exam_fee.setFont(new Font("Tahoma",Font.PLAIN,20));
        Exam_fee.setForeground(Color.WHITE);
        Exam_fee.addActionListener(this);
        Exam_fee.setBounds(0,380,300,40);
        p2.add(Exam_fee);

        Print_Exam_Fee_Recipt=new JButton("Print Exam Fee Recipt");
        Print_Exam_Fee_Recipt.setBackground(new Color(0,0,102));
        Print_Exam_Fee_Recipt.setFont(new Font("Tahoma",Font.PLAIN,20));
        Print_Exam_Fee_Recipt.setForeground(Color.WHITE);
        Print_Exam_Fee_Recipt.addActionListener(this);
        Print_Exam_Fee_Recipt.setBounds(0,430,300,40);
        p2.add(Print_Exam_Fee_Recipt);


        b7=new JButton("Logout");
        b7.setBackground(new Color(0,0,102));
        b7.setFont(new Font("Tahoma",Font.PLAIN,20));
        b7.setForeground(Color.WHITE);
        b7.addActionListener(this);
        b7.setBounds(0,480,300,40);
        p2.add(b7);

        JLabel l1=new JLabel();
        l1.setBounds(0,0,1950,1000);
        add(l1);

        leftl=new JPanel();
        leftl.setBounds(200,0,1100,750);
        leftl.add(backlabel);
        add(leftl);

        setVisible(true);
        setBounds(140,30,1300,750);
    }
    public void actionPerformed(ActionEvent ae){

        if (ae.getSource()==b1){
            this.setVisible(false);
            new Dashabord("");
        }
        if (ae.getSource()==Course){
            this.setVisible(false);
            new viewCourse();
        }
        if (ae.getSource()==Admission_Fee){
            this.setVisible(false);
            new Admission_fee();
        }
        if (ae.getSource()==Print){
            this.setVisible(false);
            new Printreciept();
        }
        if (ae.getSource()==Painding_Fee){
            this.setVisible(false);
            new painding_Fee();
        }
        if (ae.getSource()==b5){
            this.setVisible(false);
            new painding_fee_Print();
        }
        if (ae.getSource()==Exam_fee){
            this.setVisible(false);
            new Exam_Fee();
        }
        if (ae.getSource()==Print_Exam_Fee_Recipt){
            this.setVisible(false);
            new Examp_fee_Print();
        }
        if (ae.getSource()==b7){
            System.exit(0);
        }

    }


}

