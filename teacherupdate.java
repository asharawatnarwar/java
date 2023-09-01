import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.text.DateFormat;

public class teacherupdate {
    teacherupdate() {
        JFrame TeacherUpdate = new JFrame("Update Students");
        TeacherUpdate.setBounds(300, 200, 700, 450);

        JLabel massageLabel, teacherId, nameLabel, ageLabel, subjectLabel, phoneLabel, emailLabel, addressLabel ,showmassge;

        JTextField id, nameField, ageField, subjectField, phoneField, emailField, addressField;
        int phone,age;
        String name, subject, email, address ;
       // JFormattedTextField DOBField;

        teacherId = new JLabel("Teacher Id : ");
        teacherId.setBounds(50, 50, 150, 30);
        
        JButton search = new JButton("Search");
        search.setBounds(430, 50, 100, 40);
        
        nameLabel = new JLabel(" Name : ");
        nameLabel.setBounds(50, 100, 150, 30);
        
        ageLabel = new JLabel("Age  : ");
        ageLabel.setBounds(335, 100, 150, 30);
        
        subjectLabel = new JLabel("Subject : ");
        subjectLabel.setBounds(50, 150, 150, 30);
        
        phoneLabel = new JLabel("Phone No. : ");
        phoneLabel.setBounds(335, 150, 150, 30);
        
        emailLabel = new JLabel("Email : ");
        emailLabel.setBounds(50, 200, 150, 30);
        
        addressLabel = new JLabel("Address : ");
        addressLabel.setBounds(335, 200, 150, 30);
        
        
        
        showmassge = new JLabel();
        
        id = new JTextField("");
        id.setBounds(140, 50, 150, 30);
        
        nameField = new JTextField("");
        nameField.setBounds(140, 100, 150, 30);
        
        ageField = new JTextField("");
        ageField.setBounds(430, 100, 150, 30);
        
        subjectField = new JTextField("");
        subjectField.setBounds(140, 150, 150, 30);
        
        phoneField = new JTextField("");
        phoneField.setBounds(430, 150, 150, 30);
        
        emailField = new JTextField("");
        emailField.setBounds(140, 200, 150, 30);
        
        addressField = new JTextField("");
        addressField.setBounds(430, 200, 150, 30);
        
        
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(300, 330, 100, 40);
        
        JButton update = new JButton("Update");
        update.setBounds(430, 330, 100, 40);

        TeacherUpdate.add(teacherId);
        TeacherUpdate.add(search);
        TeacherUpdate.add(nameLabel);
        TeacherUpdate.add(ageLabel);
        TeacherUpdate.add(subjectLabel);
        TeacherUpdate.add(phoneLabel);
        TeacherUpdate.add(emailLabel);
        TeacherUpdate.add(addressLabel);
        TeacherUpdate.add(showmassge);

        TeacherUpdate.add(id);
        TeacherUpdate.add(nameField);
        TeacherUpdate.add(ageField);
        TeacherUpdate.add(subjectField);
        TeacherUpdate.add(phoneField);
        TeacherUpdate.add(emailField);
        TeacherUpdate.add(addressField);
        TeacherUpdate.add(cancel);
        TeacherUpdate.add(update);
        TeacherUpdate.setLayout(null);
        TeacherUpdate.setVisible(true);

        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "jdbc:mysql://localhost:3306/asha";
                String username = "root";
                String password = "";
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection(url, username, password);
                    String query = "UPDATE teacher SET Name=?, Age=?, Subject=?, Phone=?,Email=?,Address=? WHERE Id=?";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setString(1, nameField.getText());
                    preparedStatement.setString(2, ageField.getText());
                    preparedStatement.setString(3, subjectField.getText());
                    preparedStatement.setString(4, phoneField.getText());
                    preparedStatement.setString(5, emailField.getText());
                    preparedStatement.setString(6, addressField.getText());
                    preparedStatement.setString(7, id.getText()); // Corrected parameter index
                    
                    int rowsUpdated = preparedStatement.executeUpdate();
                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(TeacherUpdate, "Teacher updated successfully.");
                    } else {
                        JOptionPane.showMessageDialog(TeacherUpdate, "Error: Unable to update the teacher.");
                    }

                    preparedStatement.close();
                    connection.close();
                } catch (ClassNotFoundException | SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(TeacherUpdate, "Error: Unable to update the teacher.");
                }
            }
        });

        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "jdbc:mysql://localhost:3306/asha";
                String username = "root";
                String password = "";
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection(url, username, password);
                    String query = "SELECT * FROM teacher WHERE Id=?";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setString(1, id.getText());
                    ResultSet resultSet = preparedStatement.executeQuery();
                    
                    if (resultSet.next()) {
                        nameField.setText(resultSet.getString("Name"));
                        ageField.setText(resultSet.getString("Age"));
                        subjectField.setText(resultSet.getString("Subject"));
                        phoneField.setText(resultSet.getString("Phone"));
                        emailField.setText(resultSet.getString("Email"));
                        addressField.setText(resultSet.getString("Address"));
                    }
                     else {
                        JOptionPane.showMessageDialog(TeacherUpdate, "Teacher not found.");
                    }

                    resultSet.close();
                    preparedStatement.close();
                    connection.close();
                } catch (ClassNotFoundException | SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(TeacherUpdate, "Error: Unable to search for the student.");
                }
            }
        });
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new teacherupdate());
    }
}
