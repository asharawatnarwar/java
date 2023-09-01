import java.awt.event.*;
import javax.swing.*;
// import javax.swing.combobox;
// import java.awt.*;
import java.sql.*;
public class teacheradd
{
    teacheradd(){
    JFrame frame = new JFrame();
   
    frame.setTitle("Teacher Infomettion");
    frame.setSize(1000, 700);
   frame.setBounds(100,100,1000,600);
   frame.setTitle("Teacher information");
   frame.setLayout(null);
    //  JTextField t1,t2,t3;
 JTextField t1=new JTextField(); 
  t1.setBounds(320,50, 200,30);
  JLabel l1 = new JLabel(" Name :"); 
  l1.setBounds(155, 50, 200, 30);
 JTextField t2=new JTextField(); 
  t2.setBounds(320,100, 200,30);
  JLabel l2 = new JLabel("Age :"); 
  l2.setBounds(155, 100, 200, 30);  
 JTextField t3=new JTextField(); 
  t3.setBounds(320,150, 200,30);
  JLabel l3 = new JLabel("Subject:"); 
  l3.setBounds(155, 150, 200, 30); 
    // JComboBox cb=new JComboBox(Class); 
  // JComboBox cb = new JComboBox(Class);
  // JFormattedTextField t5 = new JFormattedTextField();
  JTextField t5 = new JTextField();
  t5.setBounds(320,200, 200,30);
  JLabel l5 = new JLabel("Phone :"); 
  l5.setBounds(150, 200, 200, 30);   
  t5.setBounds(320,200, 200,30);

  JTextField t6=new JTextField(); 
  t6.setBounds(320,250, 200,30);
  JLabel l6 = new JLabel("Email:"); 
  l6.setBounds(155, 250, 200, 30); 

  JTextField t7=new JTextField(); 
  t7.setBounds(320,300, 200,30);
  JLabel l7 = new JLabel("Adderss:"); 
  l7.setBounds(150, 300, 210, 50); 

  JButton Bt1 = new JButton("Cancel"); 
  Bt1.setBounds(320, 400, 100, 30); 
   JButton Bt2 = new JButton("Save"); 
  Bt2.setBounds(450, 400, 100, 30);
  frame.add(t1);
  frame.add(t2);
  frame.add(t3);
  frame.add(t5);
  frame.add(t6);
  frame.add(t7);

  frame.add(l1); 
  frame.add(l2); 
  frame.add(l3); 
  frame.add(l5);
  frame.add(l6);
  frame.add(l7);

  frame.add(Bt1);
  frame.add(Bt2);
  frame.setLayout(null); 
  frame.setVisible(true);  
  Bt2.addActionListener(new ActionListener() {
     @Override
    public void actionPerformed(ActionEvent e) {
     String url = "jdbc:mysql://localhost:3306/asha";
     //http://localhost/phpmyadmin/index.php?route=/database/structure&db=asha
        String username = "root";
        String password = "";
        try { 
         // Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);

        String sql = "INSERT INTO `asha`.`teacher` (`Name`, `Age`, `Subject`, `Phone`, `Email`, `Address`)"
        + " VALUES ('" + t1.getText() + "', '" + t2.getText() + "', '" + t3.getText() + "', '" + t5.getText() + "', '" + t6.getText() + "', '" + t7.getText() + "')";

          Statement statement = connection.createStatement();
          int rowsinsert = statement.executeUpdate(sql);//"' ,F_Name='"+fname_t.getText()
           if (rowsinsert > 0) {
           System.out.println("All fields were insert successfully!");
            JOptionPane.showMessageDialog(frame,"Insert Teacher successful");
           frame.dispose();

         }
         else{
          //System.out.println("All fields were insert successfully!");
            JOptionPane.showMessageDialog(frame,t1);

         }
      } catch (Exception Student) {
       System.out.print(Student);
            JOptionPane.showMessageDialog(frame,t1);

  }
 }
}); 
   
Bt1.addActionListener(event->{
 frame.dispose();
});
  }
}