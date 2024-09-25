import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class editCource extends JFrame implements ActionListener {
    JTable t1;
    JButton insert,delete,update;
    JLabel titlel1,titlel2,titlel3,titlel4;
    JLabel id_l,name_l,price_l;
    JTextField id_f,name_f,price_f;
    DefaultTableModel d=new DefaultTableModel();
    JTable t=new JTable(d);



    JPanel p3;
    Color color,fcolor;
    ImageIcon i1,i2,i3,i4,i5,i6,i7,i8,c1,c2,c3,c4,ic;
    JLabel backlabel;
    JButton Print,Back,Back_All_Recourd,Courses_List,Edit_Courses,Search_Record,Home;

    editCource(){
        d.addColumn("id");
        d.addColumn("Name");
        d.addColumn("Price");
        try{
            Conne c1  = new Conne();
            String s1 = "select * from corsee";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("C_name");
                String cost=rs.getString("cost");

                d.addRow(new Object[]{id,name,cost});
            }
            JScrollPane j=new JScrollPane(t);
            j.setBounds(770,120,500,500);
            add(j);
        }catch(Exception e){
            e.printStackTrace();
        }

        ic=new ImageIcon("images\\appicon.png");
        setIconImage(ic.getImage());
        setTitle("Edit Course");
        setLayout(null);
        p3=new JPanel();
        p3.setLayout(null);
        p3.setBounds(0,0,1300,90);
        color=new Color(0X000047);
        p3.setBackground(color);

        c4=new ImageIcon("icon\\c4.jpg");
        c1=new ImageIcon("icon\\c1.png");
        c2=new ImageIcon("icon\\c3.png");
        i1=new ImageIcon("icon\\icons8-home-50.png");
        i2=new ImageIcon("icon\\icons8-search-client-50.png");
        i3=new ImageIcon("icon\\icons8-edit-64 (2).png");
        i4=new ImageIcon("icon\\icons8-report-64.png");
        i5=new ImageIcon("icon\\back4.jpg");
        color=new Color(0X000047);
        fcolor=new Color(0Xfffff);
        c4=new ImageIcon("images\\l2-removebg-preview.png");
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

        titlel3=new JLabel("AND ADMINISTRATION Gangapur Road Nashik");
        titlel3.setBounds(580,30,550,40);
        titlel3.setFont(new Font("arial",Font.BOLD,13));
        titlel3.setForeground(Color.WHITE);
        add(titlel3);

        titlel4=new JLabel("Contact(02427-244521/02427-244947/000000/Email:moonjeinstiute@gmail.com");
        titlel4.setBounds(500,45,550,40);
        titlel4.setFont(new Font("arial",Font.BOLD,13));
        titlel4.setForeground(Color.WHITE);
        add(titlel4);

        id_f=new JTextField();
        id_f.setBounds(450,200,250,30);
        add(id_f);
        id_l=new JLabel("Course id");
        id_l.setBounds(310,200,250,30);
        add(id_l);

        name_f=new JTextField();
        name_f.setBounds(450,250,250,30);
        add(name_f);
        name_l=new JLabel("Course Name");
        name_l.setBounds(310,250,250,30);
        add(name_l);

        price_f=new JTextField();
        price_f.setBounds(450,300,250,30);
        add(price_f);
        price_l=new JLabel("Course Price");
        price_l.setBounds(310,300,250,30);
        add(price_l);
// insert,delete,update;
        insert=new JButton("Insert");
        insert.setBounds(310,400,100,30);
        insert.setBackground(Color.GREEN);
        insert.setForeground(Color.black);
        insert.addActionListener(this);
        add(insert);

        delete=new JButton("Delete");
        delete.setBounds(600,400,100,30);
        delete.setBackground(Color.RED);
        delete.addActionListener(this);
        add(delete);

        update=new JButton("Update");
        update.setBounds(450,400,100,30);
        update.setBackground(Color.BLUE);
        update.addActionListener(this);
        update.setForeground(Color.WHITE);
        add(update);

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

        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,65,300,1000);
        color=new Color(0X000047);
        p2.setBackground(color);
        add(p2);
        add(p3);
        Home=new JButton("Home");
        Home.setBackground(new Color(0,0,102));
        Home.setFont(new Font("Tahoma",Font.PLAIN,20));
        Home.setForeground(Color.WHITE);
        Home.addActionListener(this);
        Home.setBounds(0,80,300,40);
        p2.add(Home);

        Search_Record=new JButton("Search Record");
        Search_Record.setBackground(new Color(0,0,102));
        Search_Record.setFont(new Font("Tahoma",Font.PLAIN,20));
        Search_Record.setForeground(Color.WHITE);
        Search_Record.addActionListener(this);
        Search_Record.setBounds(0,130,300,40);
        p2.add(Search_Record);

        Edit_Courses=new JButton("Edit Courses");
        Edit_Courses.setBackground(new Color(0,0,102));
        Edit_Courses.setFont(new Font("Tahoma",Font.PLAIN,20));
        Edit_Courses.setForeground(Color.WHITE);
        Edit_Courses.addActionListener(this);
        Edit_Courses.setBounds(0,180,300,40);
        p2.add(Edit_Courses);

        Courses_List=new JButton("Courses List");
        Courses_List.setBackground(new Color(0,0,102));
        Courses_List.setFont(new Font("Tahoma",Font.PLAIN,20));
        Courses_List.setForeground(Color.WHITE);
        Courses_List.addActionListener(this);
        Courses_List.setBounds(0,230,300,40);
        p2.add(Courses_List);

        Back_All_Recourd=new JButton("View All Recourd");
        Back_All_Recourd.setBackground(new Color(0,0,102));
        Back_All_Recourd.setFont(new Font("Tahoma",Font.PLAIN,20));
        Back_All_Recourd.setForeground(Color.WHITE);
        Back_All_Recourd.addActionListener(this);
        Back_All_Recourd.setBounds(0,280,300,40);
        p2.add(Back_All_Recourd);

        Print=new JButton("Print");
        Print.setBackground(new Color(0,0,102));
        Print.setFont(new Font("Tahoma",Font.PLAIN,20));
        Print.setForeground(Color.WHITE);
        Print.addActionListener(this);
        Print.setBounds(0,330,300,40);
        p2.add(Print);

        Back=new JButton("Logout");
        Back.setBackground(new Color(0,0,102));
        Back.setFont(new Font("Tahoma",Font.PLAIN,20));
        Back.setForeground(Color.WHITE);
        Back.addActionListener(this);
        Back.setBounds(0,380,300,40);
        p2.add(Back);


        setVisible(true);
        setBounds(140,30,1300,750);
    }
    public void insertdata(){
        Connection c;
        Statement s;
        String id=id_f.getText();
        String name=name_f.getText();
        String price=price_f.getText();
        String inpu="insert into corsee values(0,'"+name+"','"+price+"')";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/mca","root","");
            s =c.createStatement();
            s.execute(inpu);
            System.out.println("step 5");
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void deletedata(){
        Connection c;
        Statement s;
        String id=id_f.getText();
        String name=name_f.getText();
        String price=price_f.getText();
        String delete="delete  from corsee where id='"+id+"')";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql://localhost/mca","root","");
            s =c.createStatement();
            PreparedStatement pr=c.prepareStatement("delete from corsee where id=?");
            pr.setString(1,id);

            if (pr.execute()==false){

                JOptionPane.showMessageDialog(this,"Recourd Deleted into database!");
            }
            else{
                JOptionPane.showMessageDialog(this,"Recourd not a Deleted into database!");
            }

//            s.execute(delete);

        }
        catch (Exception e){
    e.printStackTrace();
        }
    }
    public  void updatedata(){
        Connection c;
        Statement s;
        int id=Integer.parseInt(id_f.getText());
        String name=name_f.getText();
        String price=price_f.getText();

        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/mca","root","");
            PreparedStatement pr=c.prepareStatement("update corsee set C_name=? ,cost=? where id=?");
            pr.setString(1,name);
            pr.setString(2,price);
            pr.setInt(3,id);
            pr.executeUpdate();
            JOptionPane.showMessageDialog(this,"updated");



        }catch(Exception e){
            System.out.println(e);
        }
    }
public  void actionPerformed(ActionEvent e){
        if (e.getSource()==insert){
            insertdata();
            JOptionPane.showMessageDialog(this,"Details Inserted into database!");
        }
    if (e.getSource()==delete){
        deletedata();
    }

    if (e.getSource()==update){
        updatedata();
    }

    if (e.getSource()==Home){
        this.setVisible(false);
        new Dashabord("");
    }
    if (e.getSource()==Search_Record){
        this.setVisible(false);
        new SearchRecourd();
    }
    if (e.getSource()==Edit_Courses){
        this.setVisible(false);
        new editCource();
    }
    if (e.getSource()==Back_All_Recourd){
        this.setVisible(false);
        new view_All_re();
    }
    if (e.getSource()==Print){
        this.setVisible(false);
        new Printreciept();
    }
    if (e.getSource()==Back){
       System.exit(0);
    }
}

    public static void main(String[] args) {
        new editCource();
    }

}
