import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;
public class addfees extends JFrame implements ActionListener {
    Color color,fcolor;
    JPanel leftl;
    ImageIcon i1,i2,i3,i4,i5,c1,c2,c4,i;
    JButton b1,b2,b3,b4,b5,b7,b13,b14,b15,Print,Submit,Exam_fee,Admission_Fee,Painding_Fee,Print_Exam_Fee_Recipt;
    Border br;
    JLabel backlabel,Recipt_NO,Payment_type,Student_Name,year_title,Course,Fee_Type,Roll_no,l11,l12,l13,Remark,date_text,mobile_text,Caste_Text;
    JTextField Reciptno,Roll,Student_Name_Input,year1,year2,Courses,t9,Total_Amount,t11,t12,t13,gstno,Mobile,TotalinWordsinput;
    JTextArea ta1;

    JComboBox cb,corseb ,feetype,ped_unped,Caste;
    JDateChooser dateChooser;
    JLabel titlel1,titlel2,titlel3,titlel4,CoursesName,Total_Amount_text,TotalinWords,ped_unped_text;
    JSeparator spt,spt1 ,spt2,spt3;
    addfees(){
        setLayout(null);
        i=new ImageIcon("images\\appicon.png");
        setIconImage(i.getImage());

        setTitle("Add Student Fee");
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

        titlel3=new JLabel("AND ADMINISTRATION NASHIK ");
        titlel3.setBounds(580,30,550,40);
        titlel3.setFont(new Font("arial",Font.BOLD,13));
        titlel3.setForeground(Color.WHITE);
        add(titlel3);

        titlel4=new JLabel("Contact(0253 230 9617/Email:moonje@gmail.com");
        titlel4.setBounds(500,45,550,40);
        titlel4.setFont(new Font("arial",Font.BOLD,13));
        titlel4.setForeground(Color.WHITE);
        add(titlel4);

        Recipt_NO=new JLabel("Recipt No:");
        Recipt_NO.setFont(new Font("arial",Font.BOLD,15));
        Recipt_NO.setBounds(400,100,100,40);
        Recipt_NO.setForeground(color);
        add(Recipt_NO);
        Reciptno=new JTextField();
        Reciptno.setFont(new Font("arial",Font.BOLD,15));
        Reciptno.setBounds(560,100,250,30);
        add(Reciptno);

        Payment_type=new JLabel("Mode of Payment:");
        Payment_type.setFont(new Font("arial",Font.BOLD,15));
        Payment_type.setBounds(400,140,150,40);
        Payment_type.setForeground(color);
        add(Payment_type);
        cb=new JComboBox(Mode_of_Payment);
        cb.addActionListener(this);
        cb.setBounds(560,145,250,30);
        add(cb);
        //***************************************

        //****************************************

        Student_Name=new JLabel("Student Name:");
        Student_Name.setFont(new Font("arial",Font.BOLD,15));
        Student_Name.setBounds(400,190,150,40);
        Student_Name.setForeground(color);
        add(Student_Name);
        Student_Name_Input=new JTextField();
        Student_Name_Input.setBounds(560,190,250,30);
        add(Student_Name_Input);

        year_title=new JLabel("The Following payment in the college office for the year:");
        year_title.setFont(new Font("arial",Font.BOLD,15));
        year_title.setBounds(400,230,500,40);
        year_title.setForeground(color);
        add(year_title);

        year1=new JTextField("2022");
        year1.setFont(new Font("arial",Font.BOLD,15));
        year1.setBounds(1000,230,100,30);
        add(year1);

        year2=new JTextField("2023");
        year2.setFont(new Font("arial",Font.BOLD,15));
        year2.setBounds(1150,230,100,30);
        add(year2);

        Course=new JLabel("Course:");
        Course.setFont(new Font("arial",Font.BOLD,15));
        Course.setBounds(400,275,100,40);
        Course.setForeground(color);
        add(Course);
        corseb=new JComboBox(c);
        corseb.setFont(new Font("arial",Font.BOLD,15));
        corseb.setBounds(560,280,250,30);
        corseb.setForeground(color);
        corseb.addActionListener(this);
        add(corseb);


        date_text=new JLabel("Date :");
        date_text.setFont(new Font("arial",Font.BOLD,15));
        date_text.setBounds(910,95,100,40);
        date_text.setForeground(color);
        add(date_text);
        dateChooser=new JDateChooser();
        dateChooser.setBounds(1000,100,250,30);

        add(dateChooser);

        Fee_Type=new JLabel("Fee Type:");
        Fee_Type.setFont(new Font("arial",Font.BOLD,15));
        Fee_Type.setBounds(910,140,100,40);
        Fee_Type.setForeground(color);
        add(Fee_Type);
        String feetypes[]={"Admission Fee","Pending Fee","Exam Fee"};
        feetype=new JComboBox(feetypes);
        feetype.setFont(new Font("arial",Font.BOLD,15));
        feetype.setBounds(1000,140,250,30);
        feetype.setForeground(color);


        add(feetype);

        Roll_no=new JLabel("Roll No:");
        Roll_no.setFont(new Font("arial",Font.BOLD,15));
        Roll_no.setBounds(910,180,100,40);
        Roll_no.setForeground(color);
        add(Roll_no);
        Roll=new JTextField();
        Roll.setBounds(1000,185,250,30);
        add(Roll);

        mobile_text=new JLabel("Mobile No:");
        mobile_text.setFont(new Font("arial",Font.BOLD,15));
        mobile_text.setBounds(400,340,250,30);
        add(mobile_text);
        Mobile=new JTextField();
        Mobile.setBounds(560,340,250,30);
        add(Mobile);
        Caste_Text=new JLabel("Caste:");
        Caste_Text.setFont(new Font("arial",Font.BOLD,15));
        Caste_Text.setBounds(910,280,250,30);
        add(Caste_Text);
        String caste_list[]={"OPEN","OBC","SC","ST","NT"};
        Caste=new JComboBox(caste_list);
        Caste.setBounds(1000,280,250,30);
        add(Caste);

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

        CoursesName=new JLabel("Course:");
        CoursesName.setBounds(400,450,100,30);
        CoursesName.setFont(new Font("arial",Font.BOLD,15));
        add(CoursesName);
        Courses=new JTextField();
        Courses.setBounds(500,450,250,30);
        add(Courses);

//        l14=new JLabel("CGST 9%");
//        l14.setBounds(400,480,100,30);
//        add(l14);
//        l15=new JLabel("SGST 9%");
//        l15.setBounds(400,500,100,30);
//        add(l15);

        TotalinWords=new JLabel("Total in Words:");
        TotalinWords.setFont(new Font("arial",Font.BOLD,15));
        TotalinWords.setBounds(370,500,130,30);
        add(TotalinWords);
        TotalinWordsinput=new JTextField();
        TotalinWordsinput.setBounds(500,500,250,30);
        add(TotalinWordsinput);
        Remark=new JLabel("Remark");
        Remark .setFont(new Font("arial",Font.BOLD,15));
        Remark.setBounds(380,550,100,30);
        add(Remark);

        ta1=new JTextArea();
        ta1.setBounds(500,550,250,70);
        add(ta1);

        Total_Amount_text=new JLabel("Total Amount:");
        Total_Amount_text.setBounds(790,450,130,30);
        Total_Amount_text.setFont(new Font("arial",Font.BOLD,15));
        add(Total_Amount_text);
        Total_Amount=new JTextField();
        Total_Amount.setBounds(930,450,150,30);
        Total_Amount.addActionListener(this);
        add(Total_Amount);

        ped_unped_text=new JLabel("Paid / UnPaid");
        ped_unped_text.setBounds(790,490,120,30);
        ped_unped_text.setFont(new Font("arial",Font.BOLD,15));
        add(ped_unped_text);
        String  pen_unped_Amount[]={"Paid","Unpaid"};
        ped_unped=new JComboBox(pen_unped_Amount);
        ped_unped.setBounds(930,490,150,30);
        add(ped_unped);





        Submit=new JButton("Submit");
        Submit.setBackground(new Color(0,0,102));
        Submit.setFont(new Font("Tahoma",Font.PLAIN,13));
        Submit.setForeground(Color.WHITE);
        Submit.addActionListener(this);
        Submit.setBounds(930,530,150,30);
        add(Submit);

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
        fillcombox();
        int reci=resiptno();
        Reciptno.setText(Integer.toString(reci));
    }


    public boolean validationfield(){
//Reciptno ,dateChooser ,cb,Fee_Type,Student_Name_Input,Roll,year1,year2,corseb,Caste,Mobile,Courses,Total_Amount,ped_unped,ta1
//        int Rol=Integer.parseInt(Roll.getText());
//        int year01=Integer.parseInt(year1.getText());
//        int year02=Integer.parseInt(year2.getText());
//        int Mobil=Integer.parseInt(Mobile.getText());
//        int Total_Amoun=Integer.parseInt(Total_Amount.getText());
        String Reciptn=Reciptno.getText();
        String Student_Name_Inpu=Student_Name_Input.getText();
        String Rol=Roll.getText();
        String year01=year1.getText();
        String year02=year2.getText();
        String Mobil=Mobile.getText();
        String Total_Amoun=Total_Amount.getText();
        if (Reciptn.equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter Recipt Number");
            return false;
        }
        if (Student_Name_Inpu.equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter Student Name");
            return false;
        }
        if (Rol.equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter Student Roll Number");
            return false;
        }
        if (year01.equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter Acadmic Start Year");
            return false;
        }
        if (year02.equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter Acadmic End Year");
            return false;
        }
        if (Mobil.equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter Mobile Number");
            return false;
        }
        if (Total_Amoun.equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter Paiment Amount");
            return false;
        }

        if (Total_Amount.getText().equals("")|| Total_Amount.getText().matches("[0-9]+")==false){
            JOptionPane.showMessageDialog(this,"Please  Enter Amount (in Number)");
            return false;
        }
        return true;
    }
    public  void  fillcombox(){
        Connection c;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost/mca","root","");
            PreparedStatement pr=c.prepareStatement("select * from corsee") ;
            ResultSet rr=pr.executeQuery();
            while (rr.next()){
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
            c= DriverManager.getConnection("jdbc:mysql://localhost/mca","root","");
            PreparedStatement pr=c.prepareStatement("select * from feess");
            ResultSet sr=pr.executeQuery();
            int i=0;
            while (sr.next()){
                receiptno =sr.getInt("reciptNo");

                receiptno++;


            }


        }
        catch (Exception e){

        }
        return receiptno;
    }
    public void inserdata(){
        //Reciptno ,dateChooser ,cb,Fee_Type,Student_Name_Input,Roll,year1,year2,
        // Caste,Mobile,Courses,Total_Amount,ped_unped,ta1

        int reciptNo=Integer.parseInt(Reciptno.getText());
        SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-mm-dd");
        String data=dateFormat.format(dateChooser.getDate());
        String paymentmod=cb.getSelectedItem().toString();
        String Fee_Types=feetype.getSelectedItem().toString();
        String Student_Name=Student_Name_Input.getText();
        String roll=Roll.getText();
        String year01=year1.getText();
        String year02=year2.getText();
        String Castes=Caste.getSelectedItem().toString();
        String MobileNo=Mobile.getText();
        String courname=Courses.getText();
        String Total_Amounts=Total_Amount.getText();
        String ped_unpe=ped_unped.getSelectedItem().toString();
        String reparkk=ta1.getText();
        String no_word=TotalinWordsinput.getText();
        Connection c;
        Statement s;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost/mca","root","");
            s=c.createStatement();
            PreparedStatement p=c.prepareStatement("insert into ");
            p.execute();
         if(Fee_Types.equals("Admission Fee")){
             String inpu="insert into feess values('0','"+data+"','"+paymentmod+"','"+Fee_Types+"','"+Student_Name+"','"+roll+"','"+year01+"','"+year02+"','"+Castes+"','"+MobileNo+"','"+courname+"','"+Total_Amounts+"','"+ped_unpe+"','"+no_word+"','"+reparkk+"')";
             s.execute(inpu);
             JOptionPane.showMessageDialog(this,"Admission Fee Add Successfully");
         }
         else if (Fee_Types.equals("Pending Fee")){
             String inpu="insert into pending_fee values('0','"+data+"','"+paymentmod+"','"+Fee_Types+"','"+Student_Name+"','"+roll+"','"+year01+"','"+year02+"','"+Castes+"','"+MobileNo+"','"+courname+"','"+Total_Amounts+"','"+ped_unpe+"','"+no_word+"','"+reparkk+"')";
             s.execute(inpu);
             JOptionPane.showMessageDialog(this,"Pending Fee Add Successfully");
         }
         else{
             String inpu="insert into exam_fee values('0','"+data+"','"+paymentmod+"','"+Fee_Types+"','"+Student_Name+"','"+roll+"','"+year01+"','"+year02+"','"+Castes+"','"+MobileNo+"','"+courname+"','"+Total_Amounts+"','"+ped_unpe+"','"+no_word+"','"+reparkk+"')";
             s.execute(inpu);
             JOptionPane.showMessageDialog(this,"Exam Fee Fee Add Successfully");
         }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public void actionPerformed(ActionEvent ae){

        if (ae.getSource()==b1){
            this.setVisible(false);
            new Dashabord("");
        }
        if (ae.getSource()==b4){
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
        if (ae.getSource()==corseb){
            Courses.setText(corseb.getSelectedItem().toString());
        }
        if (ae.getSource()==Submit){
            try {

                float amnt = Float.parseFloat(Total_Amount.getText());
                System.out.println(amnt);
                TotalinWordsinput.setText(NumberToWordsConverter.convert((int) amnt));
                System.out.println(NumberToWordsConverter.convert((int) amnt));

            }
            catch (Exception e){
            }
        }
        if (ae.getSource()==Submit){
            if (validationfield()==true)
            {
                inserdata();

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

    public static void main(String[] args) {
        new addfees();
    }
}
