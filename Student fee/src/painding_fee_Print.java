import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.*;



public class painding_fee_Print extends JFrame implements ActionListener {
    JPanel leftl,p2,p3;
    JTextField inputid;
    JButton Print,Search,Course,Print_painding_fee;
    JButton b1,b2,b3,b4,b5,b7,b13,b14,b15,Submit,Exam_fee,Admission_Fee,Painding_Fee,Print_Exam_Fee_Recipt;
    Color color,fcolor;
    ImageIcon i1,i2,i3,i4,i5,i6,c1,c2,c4,picon1,picon2,i;
    JLabel backlabel,Payment_type,date_text,collegemasage,gstin,ptitlel1,ptitlel2,picon01,picon02;
    JLabel l1,l2,l3,l4,l5,sig,datall,gstnol,totalword,remarklview,totalpriceview,titlel1,titlel2,titlel3,titlel4;
    JLabel pimg,ncolege,n2college,year1l,year2l,sr_no,head,amoutsr,coursel,total_in_wordl,remarkl,inishalamount,cgstll,sgstll;

    JLabel roll,viewroll;
    JSeparator spt,spt1 ,spt2,spt3,spt4,spt5;
    JLabel IDin,Signature_Of_Department,Fee_Type,Caste ,Student_Name,Mobile_No,Recipt_NO;
    JLabel Recipt_NO_value,Payment_type_value,Student_Name_value,Mobile_No_value,date_value,Fee_Type_value,Roll_value,Caste_value,Total_Amount,Paid_Unpaid;
    JLabel cource_value,total_word_values,Remark_values,Total_amount_values,paid_unpaid_valuesl,Year1_value,Year2_value;
    painding_fee_Print(){
        color=new Color(0X000047);
        setLayout(null);
        this.setBackground(Color.CYAN);
        p3=new JPanel();
        p3.setLayout(null);
        p3.setBounds(310,100,970,605);
        p3.setBackground(Color.WHITE);
        i=new ImageIcon("images\\appicon.png");
        setIconImage(i.getImage());
        setTitle("Painding Fee Print");
        picon2=new ImageIcon("images\\l1.jpg");
        picon1=new ImageIcon("images\\l2-removebg-preview.png");
        c4=new ImageIcon("images\\l2-removebg-preview.png");
        c2=new ImageIcon("icon\\l2-removebg-preview.png");
        i1=new ImageIcon("icon\\icons8-home-50.png");
        i2=new ImageIcon("icon\\icons8-search-client-50.png");
        i3=new ImageIcon("icon\\icons8-edit-64 (2).png");
        i4=new ImageIcon("icon\\icons8-report-64.png");
        i5=new ImageIcon("icon\\back4.jpg");
        i6=new ImageIcon("icon\\c4.jpg");
        pimg=new JLabel(i6);
        pimg.setBounds(50,-10,100,200);
        p3.add(pimg);

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


        picon01=new JLabel(picon1);
        picon01.setBounds(50,20,110,130);
        p3.add(picon01);

        ncolege=new JLabel("PRAVARA");
        ncolege.setBounds(420,20,300,30);
        ncolege.setFont(new Font("arial",Font.PLAIN,17));
        p3.add(ncolege);
        n2college=new JLabel("PIRENS INSTITUTE OF BUSSINESS MANAGEMENT");
        n2college.setBounds(180,10,700,100);
        n2college.setFont(new Font("arial",Font.PLAIN,25));
        p3.add(n2college);

        ptitlel1=new JLabel("AND ADMINISTRATION (IBMA) LONI (BK)");
        ptitlel1.setBounds(350,30,500,100);
        p3.add(ptitlel1);

        ptitlel2=new JLabel("Contact(02427-244521/02427-244947/000000/Email:pirens@gmail.com");
        ptitlel2.setBounds(280,50,500,100);
        p3.add(ptitlel2);
        spt=new JSeparator();
        spt.setBounds(00,150,1350,30);
        spt.setBackground(color);
        p3. add(spt);

        picon02=new JLabel(picon2);
        picon02.setBounds(800,20,130,130);
        p3.add(picon02);





        //*****************************************************************************
        Recipt_NO=new JLabel("Recipt NO :");
        Recipt_NO.setFont(new Font("arial",Font.BOLD,15));
        Recipt_NO.setBounds(50,160,100,30);
        p3.add(Recipt_NO);

        Recipt_NO_value=new JLabel();
        Recipt_NO_value.setFont(new Font("arial",Font.BOLD,15));
        Recipt_NO_value.setBounds(200,160,200,30);
        p3.add(Recipt_NO_value);

        Payment_type=new JLabel("Payment Mode :");
        Payment_type.setFont(new Font("arial",Font.BOLD,15));
        Payment_type.setBounds(50,190,150,30);
        p3.add(Payment_type);
        Payment_type_value=new JLabel();
        Payment_type_value.setFont(new Font("arial",Font.BOLD,15));
        Payment_type_value.setBounds(200,190,200,30);
        p3.add(Payment_type_value);

        Student_Name=new JLabel("Student Name  :");
        Student_Name.setFont(new Font("arial",Font.BOLD,15));
        Student_Name.setBounds(50,220,150,30);
        p3.add(Student_Name);

        Student_Name_value=new JLabel();
        Student_Name_value.setFont(new Font("arial",Font.BOLD,15));
        Student_Name_value.setBounds(200,220,200,30);
        p3.add(Student_Name_value);

        Mobile_No=new JLabel("Mobile No :");
        Mobile_No.setFont(new Font("arial",Font.BOLD,15));
        Mobile_No.setBounds(50,250,150,30);
        p3.add(Mobile_No);

        Mobile_No_value=new JLabel("Mobile No  ");
        Mobile_No_value.setFont(new Font("arial",Font.BOLD,15));
        Mobile_No_value.setBounds(200,250,200,30);
        p3.add(Mobile_No_value);




        collegemasage=new JLabel("The following payment in the office the year");
        collegemasage.setFont(new Font("arial",Font.BOLD,15));
        collegemasage.setBounds(50,280,450,30);
        p3.add(collegemasage);
        Year1_value=new JLabel("year1");
        Year1_value.setFont(new Font("arial",Font.BOLD,15));
        Year1_value.setBounds(420,280,100,30);
        p3.add(Year1_value);


        Year2_value=new JLabel("year2");
        Year2_value.setFont(new Font("arial",Font.BOLD,15));
        Year2_value.setBounds(470,280,100,30);
        p3.add(Year2_value);

        date_text=new JLabel("Date :");
        date_text.setFont(new Font("arial",Font.BOLD,15));
        date_text.setBounds(700,160,100,30);
        p3.add(date_text);

        date_value=new JLabel("Date");
        date_value.setFont(new Font("arial",Font.BOLD,15));
        date_value.setBounds(780,160,200,30);
        p3.add(date_value);

        roll=new JLabel("Roll No:");
        roll.setBounds(700,230,100,30);
        roll.setFont(new Font("arial",Font.BOLD,15));
        p3.add(roll);
        Roll_value=new JLabel("Roll No");
        Roll_value.setBounds(780,230,200,30);
        Roll_value.setFont(new Font("arial",Font.BOLD,15));
        p3.add(Roll_value);

        Fee_Type=new JLabel("Fee Type ");
        Fee_Type.setFont(new Font("arial",Font.BOLD,15));
        Fee_Type.setBounds(700,190,100,30);
        p3.add(Fee_Type);

        Fee_Type_value=new JLabel("Fee Type");
        Fee_Type_value.setFont(new Font("arial",Font.BOLD,15));
        Fee_Type_value.setBounds(780,190,200,30);
        p3.add(Fee_Type_value);

        Caste=new JLabel("Caste :");
        Caste.setFont(new Font("arial",Font.BOLD,15));
        Caste.setBounds(700,280,200,30);
        p3.add(Caste);

        Caste_value=new JLabel("Caste");
        Caste_value.setFont(new Font("arial",Font.BOLD,15));
        Caste_value.setBounds(780,280,200,30);
        p3.add(Caste_value);

        sr_no=new JLabel("Sr.No");
        sr_no.setFont(new Font("arial",Font.BOLD,15));
        sr_no.setBounds(50,345,100,30);
        sr_no.setBackground(color);
        p3.add(sr_no);

        head=new JLabel("Head");
        head.setFont(new Font("arial",Font.BOLD,15));
        head.setBounds(200,345,100,30);
        head.setBackground(color);
        p3.add(head);

        amoutsr=new JLabel("Amouut(Rs)");
        amoutsr.setFont(new Font("arial",Font.BOLD,15));
        amoutsr.setBounds(600,345,400,30);
        amoutsr.setBackground(color);
        p3.add(amoutsr);


        spt2=new JSeparator();
        spt2.setBounds(0,350,1350,30);
        spt2.setBackground(color);
        p3.add(spt2);

        spt3=new JSeparator();
        spt3.setBounds(0,370,1350,30);
        spt3.setBackground(color);
        p3.add(spt3);

        coursel=new JLabel("Cource");
        coursel.setFont(new Font("arial",Font.BOLD,15));
        coursel.setBounds(100,380,100,30);
        coursel.setBackground(color);
        p3.add(coursel);

        cource_value=new JLabel("Cource");
        cource_value.setFont(new Font("arial",Font.BOLD,15));
        cource_value.setBounds(200,380,200,30);
        cource_value.setBackground(color);
        p3.add(cource_value);

        total_in_wordl=new JLabel("Total in word:-");
        total_in_wordl.setFont(new Font("arial",Font.BOLD,15));
        total_in_wordl.setBounds(50,410,200,30);
        total_in_wordl.setBackground(color);
        p3.add(total_in_wordl);

        total_word_values=new JLabel("Total in word");
        total_word_values.setFont(new Font("arial",Font.BOLD,15));
        total_word_values.setBounds(200,410,300,30);
        total_word_values.setBackground(color);
        p3.add(total_word_values);

        remarkl=new JLabel("Remark");
        remarkl.setFont(new Font("arial",Font.BOLD,15));
        remarkl.setBounds(100,440,100,30);
        remarkl.setBackground(color);
        p3.add(remarkl);

        Remark_values=new JLabel("Remark");
        Remark_values.setFont(new Font("arial",Font.BOLD,15));
        Remark_values.setBounds(200,440,100,30);
        Remark_values.setBackground(color);
        p3.add(Remark_values);


        spt1=new JSeparator();
        spt1.setBounds(100,490,150,30);
        spt1.setBackground(color);
        p3.add(spt1);
        Signature_Of_Department=new JLabel("Signature Of Department ");
        Signature_Of_Department.setFont(new Font("arial",Font.BOLD,15));
        Signature_Of_Department.setBounds(100,510,200,30);
        Signature_Of_Department.setBackground(color);
        p3.add(Signature_Of_Department);

//        sgstl=new JLabel("Total Words ");
//        sgstl.setFont(new Font("arial",Font.BOLD,15));
//        sgstl.setBounds(200,440,100,30);
//        sgstl.setBackground(color);
//        p3.add(sgstl);


        totalword=new JLabel("");
        totalword.setFont(new Font("arial",Font.BOLD,15));
        totalword.setBounds(200,500,300,30);
        totalword.setBackground(color);
        p3.add(totalword);


        remarklview=new JLabel();
        remarklview.setFont(new Font("arial",Font.BOLD,15));
        remarklview.setBounds(200,540,100,30);
        remarklview.setBackground(color);
        p3.add(remarklview);

        inishalamount=new JLabel("");
        inishalamount.setFont(new Font("arial",Font.BOLD,15));
        inishalamount.setBounds(600,380,100,30);
        inishalamount.setBackground(Color.BLUE);
        p3.add(inishalamount);

        Total_Amount=new JLabel("Total Amount:");
        Total_Amount.setFont(new Font("arial",Font.BOLD,15));
        Total_Amount.setBounds(550,410,150,30);
        Total_Amount.setBackground(color);
        p3.add(Total_Amount);


        Total_amount_values=new JLabel("Amount:");
        Total_amount_values.setFont(new Font("arial",Font.BOLD,15));
        Total_amount_values.setBounds(680,410,200,30);
        Total_amount_values.setBackground(color);
        p3.add(Total_amount_values);

        Paid_Unpaid=new JLabel("Paid/Unpaid:");
        Paid_Unpaid.setFont(new Font("arial",Font.BOLD,15));
        Paid_Unpaid.setBounds(550,440,100,30);
        Paid_Unpaid.setBackground(color);
        p3.add(Paid_Unpaid);

        paid_unpaid_valuesl=new JLabel("Paid/Unpaid:");
        paid_unpaid_valuesl.setFont(new Font("arial",Font.BOLD,15));
        paid_unpaid_valuesl.setBounds(680,440,200,30);
        paid_unpaid_valuesl.setBackground(color);
        p3.add(paid_unpaid_valuesl);
        //



//        totalprice=new JLabel("total Fee Paid");
//        totalprice.setFont(new Font("arial",Font.BOLD,15));
//        totalprice.setBounds(600,500,100,30);
//        totalprice.setBackground(color);
//        p3.add(totalprice);
//        totalpriceview=new JLabel("total Fee Paid");
//        totalpriceview.setFont(new Font("arial",Font.BOLD,15));
//        totalpriceview.setBounds(600,540,100,30);
//        totalpriceview.setBackground(color);
//        p3.add(totalpriceview);


        spt4=new JSeparator();
        spt4.setFont(new Font("arial",Font.BOLD,15));
        spt4.setBounds(550,490,150,30);
        spt4.setBackground(color);
        p3.add(spt4);

        sig=new JLabel("Receiver Signature");
        sig.setFont(new Font("arial",Font.BOLD,15));
        sig.setBounds(550,510,150,30);
        sig.setBackground(color);
        p3.add(sig);

        spt5=new JSeparator();
        spt5.setBounds(0,600,1350,100);
        spt5.setBackground(Color.GREEN);
        p3.add(spt5);
        //******************************************************************************
        add(p3);

        JPanel  feerecipt=new JPanel();
//        feerecipt.setBounds(310,100,970,605);
        feerecipt.setLayout(null);
        feerecipt.setBackground(Color.WHITE);
        add(feerecipt);

        leftl=new JPanel();
        leftl.setBounds(0,0,1350,100);
        leftl.setBackground(color);

        color=new Color(0X000047);
        fcolor=new Color(0Xfffff);

        backlabel=new JLabel(i5);
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

        p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,65,300,1000);
        color=new Color(0X000047);
        p2.setBackground(color);
        add(p2);



        p2.setLayout(null);
        p2.setBounds(0,65,300,1000);
        color=new Color(0X000047);
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

       // br=new LineBorder(color);

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

        Print_painding_fee=new JButton("Print");
        Print_painding_fee.setBackground(new Color(0,0,102));
        Print_painding_fee.setFont(new Font("Tahoma",Font.PLAIN,20));
        Print_painding_fee.setForeground(Color.WHITE);
        Print_painding_fee.addActionListener(this);
        Print_painding_fee.setBounds(0,480,300,40);
        p2.add(Print_painding_fee);

        b7=new JButton("Logout");
        b7.setBackground(new Color(0,0,102));
        b7.setFont(new Font("Tahoma",Font.PLAIN,20));
        b7.setForeground(Color.WHITE);
        b7.addActionListener(this);
        b7.setBounds(0,530,300,40);
        p2.add(b7);


        IDin=new JLabel("Enter Student Id and Search Fee Record");
        IDin.setBounds(20,565,300,40);
        IDin.setFont(new Font("arial",Font.PLAIN,15));
        IDin.setForeground(Color.WHITE);
        p2.add(IDin);
        inputid=new JTextField();
        inputid.setBounds(0,600,200,40);
        inputid.setFont(new Font("arial",Font.PLAIN,20));
        p2.add(inputid);

        Search=new JButton("Search");
        Search.setFont(new Font("Tahoma",Font.PLAIN,15));
        Search.setForeground(Color.WHITE);
        Search.setBackground(new Color(0,0,102));
        Search.setBounds(200,600,100,40);
        Search.addActionListener(this);
        p2.add(Search);

        add(leftl);
        setVisible(true);
        setBounds(140,30,1300,750);
        gettrecourd();
    }
    public void gettrecourd(){
        Connection c;
        Statement s;
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost/mca","root","");
            PreparedStatement pr=c.prepareStatement("select * from pending_fee order by reciptNo desc limit 1");
            ResultSet r=pr.executeQuery();
            r.next();
            Recipt_NO_value.setText(r.getString("reciptNo"));
            Student_Name_value.setText(r.getString("Student_Name"));
            Roll_value.setText(r.getString("roll"));
            cource_value.setText(r.getString("courname"));
            total_word_values.setText(r.getString("no_word"));
            date_value.setText(r.getString("data"));
            Total_amount_values.setText(r.getString("Total_Amounts"));
            Remark_values.setText(r.getString("reparkk"));
            Year1_value.setText(r.getString("year01"));
            Year2_value.setText(r.getString("year02"));
            Payment_type_value.setText(r.getString("paymentmod"));
            Mobile_No_value.setText(r.getString("MobileNo"));
            Fee_Type_value.setText(r.getString("Fee_Types"));
            paid_unpaid_valuesl.setText(r.getString("ped_unpe"));
            Caste_value.setText(r.getString("Castes"));

        }
        catch (Exception e){

        }
    }
    public void showdata(){
        int val=Integer.parseInt(inputid.getText());
        System.out.println(val);

        Connection c;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost/mca","root","");
            PreparedStatement ps=c.prepareStatement("select * from pending_fee where reciptNo='"+val+"'");
            ResultSet r=ps.executeQuery();

            while (r.next()) {
                Recipt_NO_value.setText(r.getString("reciptNo"));
                Student_Name_value.setText(r.getString("Student_Name"));
                Roll_value.setText(r.getString("roll"));
                cource_value.setText(r.getString("courname"));
                total_word_values.setText(r.getString("no_word"));
                date_value.setText(r.getString("data"));
                Total_amount_values.setText(r.getString("Total_Amounts"));
                Remark_values.setText(r.getString("reparkk"));
                Year1_value.setText(r.getString("year01"));
                Year2_value.setText(r.getString("year02"));
                Payment_type_value.setText(r.getString("paymentmod"));
                Mobile_No_value.setText(r.getString("MobileNo"));
                Fee_Type_value.setText(r.getString("Fee_Types"));
                paid_unpaid_valuesl.setText(r.getString("ped_unpe"));
                Caste_value.setText(r.getString("Castes"));

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
        if (ae.getSource()==Print_painding_fee){
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Print Data");

            job.setPrintable(new Printable(){
                public int print(Graphics pg, PageFormat pf, int pageNum){
                    pf.setOrientation(PageFormat.LANDSCAPE);
                    if(pageNum > 0){
                        return Printable.NO_SUCH_PAGE;
                    }

                    Graphics2D g2 = (Graphics2D)pg;
                    g2.translate(pf.getImageableX(), pf.getImageableY());
                    g2.scale(0.47,0.47);

                    p3.print(g2);


                    return Printable.PAGE_EXISTS;


                }
            });
            boolean ok = job.printDialog();
            if(ok){
                try{

                    job.print();
                }
                catch (PrinterException ex){
                    ex.printStackTrace();
                }
            }

        }
        if (ae.getSource()==Search){
            showdata();
        }

    }

    public static void main(String[] args) {
        new painding_fee_Print();
    }

}
