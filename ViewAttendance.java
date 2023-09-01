import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.sql.*;

public class ViewAttendance {
    private JFrame attendanceFrame;
    private JLabel dateLabel, freeLabel;
    private JTextField dateField;
    private JButton searchButton;
    
    public ViewAttendance() {
        attendanceFrame = new JFrame("Attendance");
        dateLabel = new JLabel("Date:");
        freeLabel = new JLabel("");
        dateField = new JTextField(20);
        searchButton = new JButton("Search");
        
        attendanceFrame.setLayout(null);
        
        dateLabel.setBounds(40, 20, 150, 30);
        dateField.setBounds(90, 20, 150, 30);
        searchButton.setBounds(250, 20, 100, 30);
        freeLabel.setBounds(40, 60, 300, 30);
        
        attendanceFrame.add(dateLabel);
        attendanceFrame.add(dateField);
        attendanceFrame.add(searchButton);
        attendanceFrame.add(freeLabel);
        
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "jdbc:mysql://localhost:3306/asha";
                String username = "root";
                String password = "";
                
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection(url, username, password);
                    
                    String query = "SELECT * FROM attendance WHERE Date=?";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setString(1, dateField.getText());
                    ResultSet resultSet = preparedStatement.executeQuery();
                    
                    DefaultTableModel tableModel = new DefaultTableModel();
                    tableModel.addColumn("Name");
                    tableModel.addColumn("Attendance");
                    
                    while (resultSet.next()) {
                        String firstName = resultSet.getString("Name");
                        String attendanceStatus = resultSet.getString("Attendance");
                        tableModel.addRow(new Object[]{firstName, attendanceStatus});
                    }
                    
                    JTable studentTable = new JTable(tableModel);
                    JScrollPane scrollPane = new JScrollPane(studentTable);
                    
                    attendanceFrame.getContentPane().removeAll();
                    attendanceFrame.getContentPane().add(scrollPane);
                    attendanceFrame.getContentPane().revalidate();
                    
                    resultSet.close();
                    preparedStatement.close();
                    connection.close();
                } catch (ClassNotFoundException | SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(attendanceFrame, "Error: Unable to retrieve Attendance information.");
                }
            }
        });
        
        attendanceFrame.setTitle("View Attendance");
        attendanceFrame.setBounds(400, 300, 500, 400);
        attendanceFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        attendanceFrame.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ViewAttendance());
    }
}
