import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class SearchRecourd extends JFrame implements ActionListener {
    Color color,fcolor;
    DefaultTableModel m=new DefaultTableModel();
    JTable t=new JTable(m);
    JPanel leftl;
    ImageIcon i1,i2,i3,i4,i5,c1,c2,c4,i;
    JButton b2,b3,b4,b5,b6,b7,Print,search;
    Border br;
    JLabel backlabel;
    JTextField searcht;
    JLabel titlel1,titlel2,titlel3,titlel4;
    DefaultTableModel d=new DefaultTableModel();
    JTable t1=new JTable(d);

    JButton b1;

    String unputstring;

       SearchRecourd() {
           i=new ImageIcon("images\\appicon.png");
           setIconImage(i.getImage());
           setTitle("Search Record");
           m.addColumn("reciptN");
           m.addColumn("date");
           m.addColumn("paymentmod");
           m.addColumn("Fee_Types");
           m.addColumn("Student_Name");
           m.addColumn("roll");
           m.addColumn("year01");
           m.addColumn("year02");
           m.addColumn("Castes");
           m.addColumn("MobileNo");
           m.addColumn("courname");


           setLayout(null);
           setExtendedState(JFrame.MAXIMIZED_BOTH);
           String Mode_of_Payment[] = {"DD", "cheque", "cash", "card",};
           c4=new ImageIcon("images\\l2-removebg-preview.png");
           c2 = new ImageIcon("icon\\c3.png");
           i1 = new ImageIcon("icon\\icons8-home-50.png");
           i2 = new ImageIcon("icon\\icons8-search-client-50.png");
           i3 = new ImageIcon("icon\\icons8-edit-64 (2).png");
           i4 = new ImageIcon("icon\\icons8-report-64.png");
           i5 = new ImageIcon("icon\\back4.jpg");

           color = new Color(0X000047);
           fcolor = new Color(0Xfffff);
           backlabel = new JLabel(i5);
           backlabel.setBounds(0, 0, 1200, 650);

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

           search = new JButton("search");
           search.setBounds(200, 550, 100, 30);
           search.setFont(new Font("arial", Font.BOLD, 13));
           search.setForeground(Color.WHITE);
           search.setBackground(Color.BLUE);
           search.addActionListener(this);
           add(search);
           searcht = new JTextField();
           searcht.setBounds(00, 550, 200, 30);
           searcht.setFont(new Font("arial", Font.BOLD, 13));
           unputstring = searcht.getText();
           searcht.addActionListener(this);
           add(searcht);


           JLabel l3 = new JLabel(c4);
           l3.setFont(new Font("Tahoma", Font.BOLD, 30));
           l3.setForeground(Color.WHITE);
           l3.setBounds(0, 0, 300, 150);
           add(l3);

           JLabel l4 = new JLabel(c1);
           l4.setFont(new Font("Tahoma", Font.BOLD, 30));
           l4.setForeground(Color.WHITE);
           l4.setBounds(850, -35, 300, 150);
           add(l4);

           JLabel l5 = new JLabel(c2);
           l5.setFont(new Font("Tahoma", Font.BOLD, 30));
           l5.setForeground(Color.WHITE);
           l5.setBounds(1000, -35, 300, 150);
           add(l5);

           JPanel p1 = new JPanel();
           p1.setLayout(null);

           p1.setBounds(0, 0, 1950, 80);
           p1.setBackground(color);
           add(p1);
//****************//*********************//**************************//*********************//****************//
           JPanel p2 = new JPanel();
           p2.setLayout(null);
           p2.setBounds(0, 65, 300, 1000);
           p2.setBackground(color);
           add(p2);

           b1 = new JButton("Home");
           b1.setBackground(new Color(0, 0, 102));
           b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
           b1.setForeground(Color.WHITE);
           b1.addActionListener(this);
           b1.setBounds(0, 80, 300, 40);
           p2.add(b1);

           b2 = new JButton("Search Record");
           b2.setBackground(new Color(0, 0, 102));
           b2.setFont(new Font("Tahoma", Font.PLAIN, 20));
           b2.setForeground(Color.WHITE);
           b2.addActionListener(this);
           b2.setBounds(0, 130, 300, 40);
           p2.add(b2);

           b3 = new JButton("Edit Courses");
           b3.setBackground(new Color(0, 0, 102));
           b3.setFont(new Font("Tahoma", Font.PLAIN, 20));
           b3.setForeground(Color.WHITE);
           b3.addActionListener(this);
           b3.setBounds(0, 180, 300, 40);
           br = new LineBorder(color);
           p2.add(b3);

           b4 = new JButton("Courses List");
           b4.setBackground(new Color(0, 0, 102));
           b4.setFont(new Font("Tahoma", Font.PLAIN, 20));
           b4.setForeground(Color.WHITE);
           b4.addActionListener(this);
           b4.setBounds(0, 230, 300, 40);
           p2.add(b4);

           b5 = new JButton("View All Recourd");
           b5.setBackground(new Color(0, 0, 102));
           b5.setFont(new Font("Tahoma", Font.PLAIN, 20));
           b5.setForeground(Color.WHITE);
           b5.addActionListener(this);
           b5.setBounds(0, 280, 300, 40);
           p2.add(b5);

           b6 = new JButton("Back");
           b6.setBackground(new Color(0, 0, 102));
           b6.setFont(new Font("Tahoma", Font.PLAIN, 20));
           b6.setForeground(Color.WHITE);
           b6.addActionListener(this);
           b6.setBounds(0, 330, 300, 40);
           p2.add(b6);

           Print = new JButton("Print");
           Print.setBackground(new Color(0, 0, 102));
           Print.setFont(new Font("Tahoma", Font.PLAIN, 20));
           Print.setForeground(Color.WHITE);
           Print.addActionListener(this);
           Print.setBounds(0, 380, 300, 40);
           p2.add(Print);

           b7 = new JButton("Logout");
           b7.setBackground(new Color(0, 0, 102));
           b7.setFont(new Font("Tahoma", Font.PLAIN, 20));
           b7.setForeground(Color.WHITE);
           b7.addActionListener(this);
           b7.setBounds(0, 420, 300, 40);
           p2.add(b7);

           JLabel l1 = new JLabel();
           l1.setBounds(0, 0, 1950, 1000);
           add(l1);

           leftl = new JPanel();
           leftl.setBounds(200, 0, 1100, 750);
           leftl.add(backlabel);
           add(leftl);

           setVisible(true);
           setBounds(0,0,1790,750);
       }

void searchRecord(){
           String name=searcht.getText();
    Connection c;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        c= DriverManager.getConnection("jdbc:mysql://localhost/final_project_bca","root","");
        PreparedStatement p=c.prepareStatement("Select * from feess where Student_Name='"+name+"'");
        ResultSet r=p.executeQuery();
        while (r.next()){
            String reciptN=r.getString("reciptN");
            String data=r.getString("date");
            String paymentmod=r.getString("paymentmod");
            String Fee_Types=r.getString("Fee_Types");
            String Student_Name=r.getString("Student_Name");
            String roll=r.getString("roll");
            String year01=r.getString("year01");
            String year02=r.getString("year02");
            String Castes=r.getString("Castes");
            String MobileNo=r.getString("MobileNo");
            String courname=r.getString("courname");

            m.addRow(new Object[]{reciptN,data,paymentmod,Fee_Types,Student_Name,roll,year01,year02,Castes,MobileNo,courname});
        }
        JScrollPane j=new JScrollPane(t);
        j.setBounds(300,80,1230,650);
        add(j);
    }
    catch (Exception e){
        System.out.println(e);
    }
}
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==search){
            searchRecord();
        }
        if (e.getSource()==b1){
            this.setVisible(false);
            new Dashabord("");
        }  if (e.getSource()==b2){
            this.setVisible(false);
            new SearchRecourd();
        }
        if (e.getSource()==b3){
            this.setVisible(false);
            new editCource();
        } if (e.getSource()==b4){
            this.setVisible(false);
            new editCource();
        }
        if (e.getSource()==b5){
            this.setVisible(false);
            new view_All_re();
        }
        if (e.getSource()==Print){
            this.setVisible(false);
            new Printreciept();
        }
        if (e.getSource()==b7){
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new SearchRecourd();
    }

}



