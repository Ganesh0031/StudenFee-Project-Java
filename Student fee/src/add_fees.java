import com.mysql.cj.protocol.Resultset;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.xml.transform.Result;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;

public class add_fees extends JFrame implements ActionListener {
    Color color,fcolor;
    JPanel leftl,p1,p2,p3;
    ImageIcon i1,i2,i3,i4,i5,i6,i7,i8,c1,c2,c3,c4;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,Print;
    String username;
    Border br;
    JLabel backlabel,Recipt_NO,Payment_type,cheque_NO,Recieved_Form,l6,Course,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,DD_NO,l20,banck_name,date_text;
    JTextField t1,Roll,DD_NO_filed,Back_Name_field,t5,t6,t7,t8,t9,t10,t11,t12,t13,cheque_field,gstno;
    JTextArea ta1;
    JComboBox cb,corseb;
    JDateChooser dateChooser;
    JLabel titlel1,titlel2,titlel3,titlel4;
    JSeparator spt,spt1 ,spt2,spt3;

    add_fees(){

        setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        String Mode_of_Payment[]={"DD","cheque","cash","card",};
        c4=new ImageIcon("images\\logo-removebg-preview (1).png");
        c1=new ImageIcon("images\\l2-removebg-preview.png");
        c2=new ImageIcon("icon\\c3.png");
        i1=new ImageIcon("icon\\icons8-home-50.png");
        i2=new ImageIcon("icon\\icons8-search-client-50.png");
        i3=new ImageIcon("icon\\icons8-edit-64 (2).png");
        i4=new ImageIcon("icon\\icons8-report-64.png");
        i5=new ImageIcon("icon\\back4.jpg");

        b15=new JButton("Print");
        b15.setBackground(new Color(0,0,102));
        b15.setFont(new Font("Tahoma",Font.PLAIN,15));
        b15.setForeground(Color.WHITE);
        b15.addActionListener(this);
        b15.setBounds(1120,600,100,30);
        add(b15);

        color=new Color(0X000047);
        fcolor=new Color(0Xfffff);
        backlabel=new JLabel(i5);
        backlabel.setBounds(0,0,1200,650);

        titlel1=new JLabel("Nashik");
        titlel1.setBounds(650,-8,550,40);
        titlel1.setFont(new Font("arial",Font.BOLD,15));
        titlel1.setForeground(Color.WHITE);
        add(titlel1);

        titlel2=new JLabel("Dr.Moonje Institute of Management and Computer Studies ");
        titlel2.setBounds(450,15,500,30);
        titlel2.setFont(new Font("arial",Font.BOLD,20));
        titlel2.setForeground(Color.WHITE);
        add(titlel2);

        titlel3=new JLabel("AND ADMINISTRATION Nashik");
        titlel3.setBounds(580,30,550,40);
        titlel3.setFont(new Font("arial",Font.BOLD,13));
        titlel3.setForeground(Color.WHITE);
        add(titlel3);

        titlel4=new JLabel("Contact(02427-244521/02427-244947/000000/Email:pirens@gmail.com");
        titlel4.setBounds(500,45,550,40);
        titlel4.setFont(new Font("arial",Font.BOLD,13));
        titlel4.setForeground(Color.WHITE);
        add(titlel4);

        Recipt_NO=new JLabel("Recipt No:");
        Recipt_NO.setFont(new Font("arial",Font.BOLD,15));
        Recipt_NO.setBounds(400,100,100,40);
        Recipt_NO.setForeground(color);
        add(Recipt_NO);
        t1=new JTextField();
        t1.setBounds(560,100,250,30);
        add(t1);

        Payment_type=new JLabel("Mode of Payment:");
        Payment_type.setFont(new Font("arial",Font.BOLD,15));
        Payment_type.setBounds(400,140,150,40);
        Payment_type.setForeground(color);
        add(Payment_type);
        cb=new JComboBox(Mode_of_Payment);
        cb.addActionListener(this);
        cb.setBounds(560,145,250,30);
        add(cb);

        //*************************************** l19 l3 t14 t3 l4 t4
        DD_NO=new JLabel("DD No :");
        DD_NO.setFont(new Font("arial",Font.BOLD,15));
        DD_NO.setBounds(400,180,150,40);
        DD_NO.setForeground(color);
        add(DD_NO);
        //*****************************************

        cheque_NO=new JLabel("cheque No:");
        cheque_NO.setFont(new Font("arial",Font.BOLD,15));
        cheque_NO.setBounds(400,180,150,40);
        cheque_NO.setForeground(color);
        add(cheque_NO);

        //****************************************
        cheque_field=new JTextField();
        cheque_field.setBounds(560,185,250,30);
        add(cheque_field);
        //***************************************
        DD_NO_filed=new JTextField();
        DD_NO_filed.setBounds(560,185,250,30);
        add(DD_NO_filed);

        //*****************************************
        banck_name=new JLabel("Bank Name:");
        banck_name.setFont(new Font("arial",Font.BOLD,15));
        banck_name.setBounds(400,220,150,40);
        banck_name.setForeground(color);
        add(banck_name);
        Back_Name_field=new JTextField();
        Back_Name_field.setBounds(560,220,250,30);
        add(Back_Name_field);
        //*********************************************
        Recieved_Form=new JLabel("Recieved Form:");
        Recieved_Form.setFont(new Font("arial",Font.BOLD,15));
        Recieved_Form.setBounds(400,260,150,40);
        Recieved_Form.setForeground(color);
        add(Recieved_Form);
        t5=new JTextField();
        t5.setBounds(560,260,250,30);
        add(t5);

        l6=new JLabel("The Following payment in the college office for the year:");
        l6.setFont(new Font("arial",Font.BOLD,15));
        l6.setBounds(400,300,500,40);
        l6.setForeground(color);
        add(l6);

        t6=new JTextField("2021");
        t6.setBounds(830,305,100,30);
        add(t6);
        t7=new JTextField("2022");
        t7.setBounds(1000,305,100,30);
        add(t7);

        Course=new JLabel("Course:");
        Course.setFont(new Font("arial",Font.BOLD,15));
        Course.setBounds(400,340,100,40);
        Course.setForeground(color);
        add(Course);
        corseb=new JComboBox();
        corseb.setFont(new Font("arial",Font.BOLD,15));
        corseb.setBounds(500,345,250,30);
        corseb.setForeground(color);
        corseb.addActionListener(this);
        add(corseb);

        date_text=new JLabel("Date :");
        date_text.setFont(new Font("arial",Font.BOLD,15));
        date_text.setBounds(930,95,100,40);
        date_text.setForeground(color);
        add(date_text);
        dateChooser=new JDateChooser();
        dateChooser.setBounds(1000,100,250,30);
        add(dateChooser);

        l9=new JLabel("GSTN:");
        l9.setFont(new Font("arial",Font.BOLD,15));
        l9.setBounds(930,140,100,40);
        l9.setForeground(color);
        add(l9);

        gstno=new JTextField("DAH57685S");
        gstno.setFont(new Font("arial",Font.BOLD,15));
        gstno.setBounds(1000,140,250,30);
        gstno.setForeground(color);
        add(gstno);


        l10=new JLabel("Roll No:");
        l10.setFont(new Font("arial",Font.BOLD,15));
        l10.setBounds(930,180,100,40);
        l10.setForeground(color);
        add(l10);
        Roll=new JTextField();
        Roll.setBounds(1000,185,250,30);
        add(Roll);


        spt=new JSeparator();
        spt.setBounds(305,400,980,40);
        spt.setForeground(color);
        add(spt);

        spt1=new JSeparator();
        spt1.setBounds(305,430,980,40);
        spt1.setForeground(color);
        add(spt1);


        l11=new JLabel("Sr No");
        l11.setBounds(330,395,100,40);
        add(l11);

        l12=new JLabel("Head");
        l12.setBounds(500,395,100,40);
        add(l12);
        l13=new JLabel("Amount(RS)");
        l13.setBounds(950,395,100,40);
        add(l13);

        t8=new JTextField();
        t8.setBounds(400,450,250,30);
        add(t8);

        l14=new JLabel("CGST 9%");
        l14.setBounds(400,480,100,30);
        add(l14);
        l15=new JLabel("SGST 9%");
        l15.setBounds(400,500,100,30);
        add(l15);

        l16=new JLabel("Total in Words");
        l16.setBounds(350,570,100,30);
        add(l16);
        l17=new JLabel("Remark");
        l17.setBounds(350,640,100,30);
        add(l17);

        t9=new JTextField();
        t9.setBounds(450,570,250,30);
        add(t9);

        ta1=new JTextArea();
        ta1.setBounds(450,620,250,70);
        add(ta1);

        t10=new JTextField();
        t10.setBounds(930,450,150,30);
        t10.addActionListener(this);
        add(t10);

        t11=new JTextField();
        t11.setBounds(930,490,150,30);
        add(t11);
        t12=new JTextField();
        t12.setBounds(930,530,150,30);
        add(t12);
        t13=new JTextField();
        t13.setBounds(930,600,150,30);
        add(t13);

        spt2=new JSeparator();
        spt2.setBounds(930,590,150,30);
        add(spt2);

        spt3=new JSeparator();
        spt3.setBounds(1100,500,150,30);
        add(spt3);

        l18=new JLabel("Reciever Signature");
        l18.setBounds(1120,510,150,30);
        add(l18);
        Print=new JButton("Print");
        Print.addActionListener(this);
        Print.setBounds(1120,600,100,30);
        add(Print);

        JLabel l3=new JLabel(c4);
        l3.setFont(new Font("Tahoma",Font.BOLD,30));
        l3.setForeground(Color.WHITE);
        l3.setBounds(0,0,300,150);
        add(l3);

        JLabel l4=new JLabel(c1);
        l4.setFont(new Font("Tahoma",Font.BOLD,30));
        l4.setForeground(Color.WHITE);
        l4.setBounds(850,-35,300,150);
        add(l4);

        JLabel l5=new JLabel(c2);
        l5.setFont(new Font("Tahoma",Font.BOLD,30));
        l5.setForeground(Color.WHITE);
        l5.setBounds(1000,-35,300,150);
        add(l5);


//        t6=new JTextField();
//        t6.setBounds();
//        t7=new JTextField();
//        t7.setBounds();
//        t8=new JTextField();
//        t8.setBounds();


        JPanel p1=new JPanel();
        p1.setLayout(null);

        p1.setBounds(0,0,1950,80);
        p1.setBackground(color);
        add(p1);
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

        b2=new JButton("Search Record");
        b2.setBackground(new Color(0,0,102));
        b2.setFont(new Font("Tahoma",Font.PLAIN,20));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        b2.setBounds(0,130,300,40);

        p2.add(b2);

        b3=new JButton("Edit Courses");
        b3.setBackground(new Color(0,0,102));
        b3.setFont(new Font("Tahoma",Font.PLAIN,20));
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        b3.setBounds(0,180,300,40);
        br=new LineBorder(color);
        p2.add(b3);

        b4=new JButton("Courses List");
        b4.setBackground(new Color(0,0,102));
        b4.setFont(new Font("Tahoma",Font.PLAIN,20));
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        b4.setBounds(0,230,300,40);
        p2.add(b4);

        b5=new JButton("View All Recourd");
        b5.setBackground(new Color(0,0,102));
        b5.setFont(new Font("Tahoma",Font.PLAIN,20));
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        b5.setBounds(0,280,300,40);
        p2.add(b5);

        b6=new JButton("Back");
        b6.setBackground(new Color(0,0,102));
        b6.setFont(new Font("Tahoma",Font.PLAIN,20));
        b6.setForeground(Color.WHITE);
        b6.addActionListener(this);
        b6.setBounds(0,330,300,40);
        p2.add(b6);

        Print=new JButton("Print");
        Print.setBackground(new Color(0,0,102));
        Print.setFont(new Font("Tahoma",Font.PLAIN,20));
        Print.setForeground(Color.WHITE);
        Print.addActionListener(this);
        Print.setBounds(0,380,300,40);
        p2.add(Print);




        b7=new JButton("Logout");
        b7.setBackground(new Color(0,0,102));
        b7.setFont(new Font("Tahoma",Font.PLAIN,20));
        b7.setForeground(Color.WHITE);
        b7.addActionListener(this);
        b7.setBounds(0,420,300,40);
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
        displaycash();
        fillcombox();
        setRecourd();



    }
    public void gettrecourd(){
        Connection c;
        Statement s;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost/final_project_bca","root","");
            PreparedStatement pr=c.prepareStatement("select * from fees order by reciptNo desc limit 1");
            ResultSet r=pr.executeQuery();
            r.next();
            t1.setText(r.getString("reciptNo"));

        }
        catch (Exception e){

        }
    }
    public void displaycash(){
        banck_name.setVisible(false);
        Back_Name_field.setVisible(false);
        cheque_NO.setVisible(false);
        DD_NO_filed.setVisible(false);
        DD_NO.setVisible(false);
        cheque_field.setVisible(false);


    }
    public boolean validationfield(){
//    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
//    JTextArea ta1;

        if (cb.getSelectedItem().toString().equals("cheque")){
            if (cheque_field.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Please  Enter cheque Number");
                return false;
            }
            if (Back_Name_field.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Please  Enter Bank name");
                return false;
            }

        }
        if (cb.getSelectedItem().toString().equals("DD")) {
            if (DD_NO_filed.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please  Enter DD No");
                return false;
            }
            if (Back_Name_field.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please  Enter Bank name");
                return false;
            }
        }
        if (cb.getSelectedItem().toString().equals("card")){
            if (Back_Name_field.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Please  Enter Bank name");
                return false;
            }
        }


        if (t5.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please  Enter Recieved From");
            return false;
        }
        if(dateChooser.getDate()==null){
            JOptionPane.showMessageDialog(this,"Please  select a Data");
            return false;
        }


        if (t10.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please  Enter Amount (in Number)");
            return false;
        }

        return true;

    }
    public  void  fillcombox(){
        Connection c;
        Statement s;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost/final_project_bca","root","");
            PreparedStatement pr=c.prepareStatement("select * from corsee") ;
            ResultSet rr=pr.executeQuery();
            while (rr.next()){
                //cb,
                corseb.addItem(rr.getString("C_name"));

            }
        }
        catch (Exception e){
            e.printStackTrace();

        }

    }
    public int resiptno(){
        Connection c;
        Statement s;
        int receiptno=0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost/final_project_bca","root","");
            PreparedStatement pr=c.prepareStatement("select max(reciptNo) from fees");
            ResultSet sr=pr.executeQuery();
            if (sr.next()==true){
                receiptno =sr.getInt("reciptNo");
                return receiptno+1;

            }
        }
        catch (Exception e){

        }
        return receiptno+1;
    }
    public void setRecourd(){
        Connection c;
        Statement s;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/final_project_bca", "root", "");
            PreparedStatement pr = c.prepareStatement("select * from fees order by reciptNo desc limit 1");
            ResultSet r = pr.executeQuery();
            r.next();
            t1.setText(String.valueOf(r.getInt("reciptNo")));
            DD_NO_filed.setText(r.getString("dd"));
            Back_Name_field.setText(r.getString("banck"));
            cheque_field.setText(r.getString("cheque"));
            t10.setText(r.getString("inishalamount"));
             t11.setText(r.getString("cgst"));
             t12.setText(r.getString("sgst"));
              t5.setText(r.getString("studentname"));
              t6.setText(r.getString("year1"));
            t7.setText(r.getString("year2"));
            ta1.setText(r.getString("reparkk"));
            t9.setText(r.getString("totalword"));
            t8.setText(r.getString("courname"));

            Roll.setText(String.valueOf(r.getInt("reciptNo")));
            gstno.setText(r.getString("gstin"));
            t13.setText(r.getString("totalamoun"));

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void inserdata(){
        //t1,t2,DD_NO_filed,Back_Name_field,t5,t6,t7,t8,t9,t10,t11,t12,t13,cheque_field;
        int reciptNo=Integer.parseInt(t1.getText());
        String studentname=t5.getText();
        String Rol=Roll.getText();
        String paymentmod=cb.getSelectedItem().toString();
        String cheque=cheque_field.getText();
        String banck=Back_Name_field.getText();
        String dd=DD_NO_filed.getText();
        String courname=t8.getText();
        String gstin=gstno.getText();
        String totalamount=t13.getText();
        SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-mm-dd");
        String data=dateFormat.format(dateChooser.getDate());
        String inishalamount=t10.getText();
        String cgst=t11.getText();
        String sgst=t12.getText();
        String totalword=t9.getText();
        String reparkk=ta1.getText();
        int year1=Integer.parseInt(t6.getText());
        int year2=Integer.parseInt(t7.getText());
        Connection c;
        Statement s;
        try{
            System.out.println("step1");
            //String inpu="insert into fees_details values(0,'"+studentname+"','"+Rol+"','"+paymentmod+"','"+cheque+"','"+banck+"','"+dd+"','"+courname+"','"+gstin+"','"+totalamount+"','"+data+"','"+inishalamount+"','"+cgst+"','"+sgst+"','"+totalword+"','"+reparkk+"','"+year1+"','"+year1+"',) ";
           // String inpu="update  fees set studentname='"+studentname+"',RollNo='"+Rol+"',paymentmod='"+paymentmod+"',cheque='"+cheque+"',banck='"+banck+"',dd='"+dd+"',courname='"+courname+"',gstin='"+gstin+"',totalamoun='"+totalamount+"',data='"+data+"',inishalamount='"+inishalamount+"',cgst='"+cgst+"',sgst='"+sgst+"',totalword='"+totalword+"',reparkk='"+reparkk+"',year1='"+year1+"',year2='"+year1+"' where reciptNo='"+reciptNo+"')";
            System.out.println("step2");
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost/final_project_bca","root","");
            PreparedStatement pr=c.prepareStatement("update feess set studentname=?,Rol=?,paymentmod=?,cheque=?,banck=?,dd=?,courname=?,gstin=?,totalamoun=?, data=?,inishalamount=?,cgst=?,sgst=?,totalword=?,reparkk=?,year1=?,year2=? where reciptNo=?");
            System.out.println("step4");
            pr.setString(1,studentname);
            pr.setString(2,Rol);
            pr.setString(3,paymentmod);
            pr.setString(4,cheque);
            pr.setString(5,banck);
            pr.setString(6,dd);
            pr.setString(7,courname);
            pr.setString(8,gstin);
            pr.setString(9,totalamount);
            pr.setString(10,data);
            pr.setString(11,inishalamount);
            pr.setString(12,cgst);
            pr.setString(13,sgst);
            pr.setString(14,totalword);
            pr.setString(15,reparkk);
            pr.setInt(16,year1);
            pr.setInt(17,year2);
            pr.setInt(18,reciptNo);

            System.out.println("step5");
     pr.execute();
            System.out.println("step6");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==b1){
            this.setVisible(false);
            new Dashabord("");
        }
        if (ae.getSource()==Print){
            this.setVisible(false);
            new Printreciept();
        }
        if (ae.getSource()==b7){
            System.exit(0);
        }
        if (ae.getSource()==corseb){
            t8.setText(corseb.getSelectedItem().toString());
        }
        if (ae.getSource()==b15){
            try {
                float amnt = Float.parseFloat(t10.getText());
                float cgst = (amnt * 0.09f);
                float sgst = (amnt * 0.09f);
                t11.setText(Float.toString(cgst));
                t12.setText(Float.toString(sgst));
                float total = amnt + cgst + sgst;
                t13.setText(Float.toString(total));
                t9.setText(NumberToWordsConverter.convert((int) total) + "only");
            }
            catch (Exception e){

            }
        }
        if (ae.getSource()==b15){
            if (validationfield()==true)
            {
                inserdata();
                JOptionPane.showMessageDialog(this,"Recourd Updated !");

            }
        }
        if (ae.getSource()==Print){
            inserdata();
            JOptionPane.showMessageDialog(this,"Fee Add Successfully");
        }

        if (ae.getSource()== cb){
            if ( cb.getSelectedIndex()==0){

                cheque_field.setVisible(false);
                cheque_NO.setVisible(false);

                DD_NO.setVisible(true);
                DD_NO_filed.setVisible(true);

                banck_name.setVisible(true);
                Back_Name_field.setVisible(true);
            }
            else if(cb.getSelectedIndex()==1){
                cheque_field.setVisible(true);
                cheque_NO.setVisible(true);

                DD_NO.setVisible(false);
                DD_NO_filed.setVisible(false);

                banck_name.setVisible(true);
                Back_Name_field.setVisible(true);
            }
            else if(cb.getSelectedIndex()==2){
                cheque_field.setVisible(false);
                DD_NO.setVisible(false);
                cheque_NO.setVisible(false);
                DD_NO_filed.setVisible(false);
                banck_name.setVisible(false);
                Back_Name_field.setVisible(false);
            }
            else if(cb.getSelectedIndex()==3){
                cheque_field.setVisible(false);
                DD_NO.setVisible(false);
                cheque_NO.setVisible(false);
                DD_NO_filed.setVisible(false);
                banck_name.setVisible(true);
                Back_Name_field.setVisible(true);
            }

        }
        if(ae.getSource()==b13){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception e){}
        }else if(ae.getSource()==b14){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception e){}
        }

    }


}
