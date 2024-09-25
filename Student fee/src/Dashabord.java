import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashabord extends JFrame implements ActionListener{



//    32ImageIcon collegelogo,backimg,pluse,ilseachrecord,iviewrecord,iEditcouese,iviewcouse,iviewreport,logoutimg,aboutimg;

    JPanel main,n0;
    JButton n1 ,n2,n3,n4,n5,n6,addfees;
    JLabel back,label,searchl,viewrol,editcl,viewcl,viewrl;
    Color color;
    JButton backb,aboutb;
    JLabel showuser,adminl;
    JLabel titlel1,titlel2,titlel3,titlel4,aboutimgl,logoutimgl,ipluse,logl,abol,lseachrecord,viewrecord,Editcouese,viewcouse,viewreport,backlabel,logo;
    ImageIcon i1,i2,i3,i4,i5,c1,c2,c4,collegelogo,backimg,logoutimg,aboutimg,pluse,ilseachrecord,iviewrecord,iviewreport,iEditcouese,iviewcouse;
    ImageIcon ad,i;
    Dashabord(String usern){
        setLayout(null);
        color=new Color(0X000047);
        i=new ImageIcon("images\\appicon.png");
        setIconImage(i.getImage());
        setTitle("Dashabord");
        ad=new ImageIcon("icon\\adm.png");
        adminl=new JLabel(ad);
        adminl.setBounds(850,120,50,30);
        add(adminl);
        showuser=new JLabel("Welcome "+usern);
        showuser.setBounds(900,120,400,30);
        showuser.setFont(new Font("arial",Font.BOLD,20));
        showuser.setBackground(color);
        add(showuser);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        c1=new ImageIcon("images\\l1.jpg");
        c4=new ImageIcon("images\\l2-removebg-preview.png");
        // c2=new ImageIcon("icon\\c3.png");
        i1=new ImageIcon("icon\\icons8-home-50.png");
        i2=new ImageIcon("icon\\icons8-search-client-50.png");
        i3=new ImageIcon("icon\\icons8-edit-64 (2).png");
        i4=new ImageIcon("icon\\icons8-report-64.png");
        i5=new ImageIcon("icon\\back4.jpg");
        JLabel l3=new JLabel(c4);
        l3.setFont(new Font("Tahoma",Font.BOLD,30));
        l3.setForeground(Color.WHITE);
        l3.setBounds(5,-15,400,134);
        add(l3);

        JLabel l4=new JLabel(c1);
        l4.setFont(new Font("Tahoma",Font.BOLD,30));
        l4.setForeground(Color.WHITE);
        l4.setBounds(900,-30,320,170);
        add(l4);

        JLabel l5=new JLabel(c2);
        l5.setFont(new Font("Tahoma",Font.BOLD,30));
        l5.setForeground(Color.WHITE);
        l5.setBounds(970,-35,300,150);
        add(l5);
        collegelogo=new ImageIcon("images\\logo.png");
        backimg=new ImageIcon("icon\\back4.jpg");
        logoutimg=new ImageIcon("icon\\logout.png");
        aboutimg=new ImageIcon("icon\\about.png");
        aboutimgl=new JLabel(aboutimg);
        logoutimgl=new JLabel(logoutimg);
        logoutimgl.setBounds(0,0,100,40);
        pluse=new ImageIcon("icon\\icons8-plus-minus-+---96 (1).png");
        ilseachrecord=new ImageIcon("icon\\icons8-search-in-list-96.png");
        iviewrecord=new ImageIcon("icon\\icons8-open-book-100.png");
        iEditcouese=new ImageIcon("icon\\icons8-book-and-pencil-100.png");
        iviewcouse=new ImageIcon("icon\\icons8-open-book-100.png");
        iviewreport=new ImageIcon("icon\\icons8-report-64.png");

        titlel1=new JLabel("pravara");
        titlel1.setBounds(650,-8,550,40);
        titlel1.setFont(new Font("arial",Font.BOLD,15));
        titlel1.setForeground(Color.WHITE);
        add(titlel1);

        titlel2=new JLabel("Dr.Moonje Institute of Management and Computer Studies ");
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

        ipluse=new JLabel(pluse);
        lseachrecord=new JLabel(ilseachrecord);
        viewrecord=new JLabel(iviewrecord);
        Editcouese=new JLabel(iEditcouese);
        viewcouse=new JLabel(iviewcouse);
        viewreport=new JLabel(iviewreport);

        ipluse.setBounds(-30,0,100,100);
        lseachrecord.setBounds(-30,0,100,100);
        viewrecord.setBounds(-30,0,100,100);
        Editcouese.setBounds(-30,0,100,100);
        viewcouse.setBounds(-30,0,100,100);
        viewreport.setBounds(-30,0,100,100);

        addfees=new JButton("Add fees");
        addfees.setFont(new Font("arial",Font.BOLD,20));
        addfees.setBounds(300,200,100,30);
        addfees.setForeground(Color.WHITE);
        add(addfees);

        searchl=new JLabel("Search Record");
        searchl.setFont(new Font("arial",Font.BOLD,20));
        searchl.setBounds(0,0,100,100);
        searchl.setForeground(Color.WHITE);

        viewrol=new JLabel("View Record");
        viewrol.setFont(new Font("arial",Font.BOLD,20));
        viewrol.setBounds(0,0,100,100);
        viewrol.setForeground(Color.WHITE);

        editcl=new JLabel("Edit Course");
        editcl.setFont(new Font("arial",Font.BOLD,20));
        editcl.setBounds(100,0,100,100);
        editcl.setForeground(Color.WHITE);

        viewcl=new JLabel("View Course");
        viewcl.setFont(new Font("arial",Font.BOLD,20));
        viewcl.setBounds(0,0,100,100);
        viewcl.setForeground(Color.WHITE);

        viewrl=new JLabel("View Report");
        viewrl.setFont(new Font("arial",Font.BOLD,20));
        viewrl.setBounds(0,0,100,100);
        viewrl.setForeground(Color.WHITE);

        backlabel=new JLabel(backimg);
        backlabel.setBounds(0,0,1200,650);
        logo=new JLabel();
        logo.setBounds(-5,0,1200,100);
        add(logo);

        n0=new JPanel();
        n0.setBounds(0,0,1200,110);
        n0.setBackground(color);
        add(n0);
        n1=new JButton("Add Fee");
        n1.setFont(new Font("arial",Font.BOLD,20));
        n1.setForeground(Color.WHITE);
        n1.setIcon(pluse);
        n1.setBackground(color);
        n1.setBounds(290,200,280,140);
        n1.addActionListener(this);
        add(n1);

        n2=new JButton("Search Record");
        n2.setIcon(ilseachrecord);
        n2.setForeground(Color.WHITE);
        n2.setFont(new Font("arial",Font.BOLD,20));
        n2.setBounds(580,200,290,140);
        n2.setBackground(color);
        n2.addActionListener(this);
        add(n2);

        n3=new JButton("View Record");
        n3.setIcon(iviewrecord);
        n3.setForeground(Color.WHITE);
        n3.setFont(new Font("arial",Font.BOLD,20));
        n3.setBounds(880,200,280,140);
        n3.setBackground(color);
        n3.addActionListener(this);
        add(n3);

        n4=new JButton("Edit Course");
        n4.setIcon(iEditcouese);
        n4.setForeground(Color.WHITE);
        n4.setFont(new Font("arial",Font.BOLD,20));
        n4.setBounds(290,350,280,140);
        n4.setBackground(color);
        n4.addActionListener(this);
        add(n4);

        n5=new JButton("view Course");
        n5.setIcon(iviewcouse);
        n5.setForeground(Color.WHITE);
        n5.setFont(new Font("arial",Font.BOLD,20));
        n5.setBounds(580,350,290,140);
        n5.setBackground(color);
        n5.addActionListener(this);
        add(n5);

        n6=new JButton("view Report");
        n6.setIcon(iviewreport);
        n6.setForeground(Color.WHITE);
        n6.setFont(new Font("arial",Font.BOLD,20));
        n6.setBounds(880,350,280,140);
        n6.setBackground(color);
        add(n6);
        logl=new JLabel("Logout");
        logl.setBounds(0,0,100,30);
        logl.setForeground(color);
        logl.setFont(new Font("arial",Font.BOLD,15));

        abol=new JLabel("About");
        abol.setBounds(0,0,100,30);
        abol.setFont(new Font("arial",Font.BOLD,15));
        abol.setForeground(color);

        aboutb=new JButton("About");
        aboutb.setBounds(500,500,150,50);
        aboutb.setBackground(color);
        aboutb.setForeground(Color.WHITE);
        aboutb.setFont(new Font("Arial",Font.BOLD,20));
        add(aboutb);

        backb=new JButton("Logout");
        backb.setBounds(800,500,150,50);
        backb.setBackground(Color.red);
        backb.setForeground(Color.WHITE);
        backb.setFont(new Font("Arial",Font.BOLD,20));
        backb.addActionListener(this);
        add(backb);

        main=new JPanel();
        main.setBounds(0,100,1200,650);
        main.add(backlabel);
        add(main);
        setVisible(true);
        setBounds(170,30,1200,750);
    }
    public  void actionPerformed(ActionEvent e){
        if (e.getSource()==n1){
            this.setVisible(false);
            new addfees();
        }  if (e.getSource()==n2){
            this.setVisible(false);
            new SearchRecourd();
        }
        if (e.getSource()==n3){
            this.setVisible(false);
            new view_All_re();
        } if (e.getSource()==n4){
            this.setVisible(false);
            new editCource();
        }
        if (e.getSource()==n5){
            this.setVisible(false);
            new viewCourse();
        }
        if (e.getSource()==backb){
            new Login();
            this.setVisible(false);
        }
    }


}
