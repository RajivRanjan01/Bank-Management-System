import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField panTextField, aadharTextField;
    JRadioButton syes, sno, eyes, eno;
    JButton nextButton;
    JComboBox<String> religionBox, categoryBox, incomeBox, educationBox, occupationBox;
    String formno;

    public SignupTwo(String formno) {
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        setLayout(null);

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 40, 400, 30);
        add(additionalDetails);

        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 120, 100, 30);
        add(religion);

        String[] valReligion = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religionBox = new JComboBox<>(valReligion);
        religionBox.setBounds(300, 120, 400, 30);
        religionBox.setBackground(Color.WHITE);
        add(religionBox);

        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 170, 100, 30);
        add(category);

        String[] valCategory = {"General", "OBC", "SC", "ST", "Other"};
        categoryBox = new JComboBox<>(valCategory);
        categoryBox.setBounds(300, 170, 400, 30);
        categoryBox.setBackground(Color.WHITE);
        add(categoryBox);

        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 220, 100, 30);
        add(income);

        String[] incomeCategory = {"Null", "< 1,50,000", "< 2,50,000", "< 5,000,000", "Upto 10,000,000"};
        incomeBox = new JComboBox<>(incomeCategory);
        incomeBox.setBounds(300, 220, 400, 30);
        incomeBox.setBackground(Color.WHITE);
        add(incomeBox);

        JLabel education = new JLabel("Educational");
        education.setFont(new Font("Raleway", Font.BOLD, 20));
        education.setBounds(100, 270, 150, 30);
        add(education);

        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 290, 150, 30);
        add(qualification);

        String[] educationValues = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Other"};
        educationBox = new JComboBox<>(educationValues);
        educationBox.setBounds(300, 280, 400, 30);
        educationBox.setBackground(Color.WHITE);
        add(educationBox);

        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 340, 150, 30);
        add(occupation);

        String[] occupationalValues = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        occupationBox = new JComboBox<>(occupationalValues);
        occupationBox.setBounds(300, 340, 400, 30);
        occupationBox.setBackground(Color.WHITE);
        add(occupationBox);

        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 390, 150, 30);
        add(pan);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 390, 400, 30);
        add(panTextField);

        JLabel aadhar = new JLabel("Aadhaar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 440, 180, 30);
        add(aadhar);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 440, 400, 30);
        add(aadharTextField);

        JLabel seniorCitizen = new JLabel("Senior Citizen:");
        seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorCitizen.setBounds(100, 490, 150, 30);
        add(seniorCitizen);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 490, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 490, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup seniorgroup = new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);

        JLabel existingAccount = new JLabel("Existing Account:");
        existingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAccount.setBounds(100, 540, 180, 30);
        add(existingAccount);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 540, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 540, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup existinggroup = new ButtonGroup();
        existinggroup.add(eyes);
        existinggroup.add(eno);

        nextButton = new JButton("Next");
        nextButton.setBackground(Color.BLACK);
        nextButton.setForeground(Color.WHITE);
        nextButton.setFont(new Font("Raleway", Font.BOLD, 14));
        nextButton.setBounds(620, 660, 80, 30);
        nextButton.addActionListener(this);
        add(nextButton);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        String religion = (String) religionBox.getSelectedItem();
        String category = (String) categoryBox.getSelectedItem();
        String income = (String) incomeBox.getSelectedItem();
        String education = (String) educationBox.getSelectedItem();
        String occupation = (String) occupationBox.getSelectedItem();

        String seniorCitizen = null;
        if (syes.isSelected()) {
            seniorCitizen = "Yes";
        } else if (sno.isSelected()) {
            seniorCitizen = "No";
        }

        String existingAccount = null;
        if (eyes.isSelected()) {
            existingAccount = "Yes";
        } else if (eno.isSelected()) {
            existingAccount = "No";
        }

        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();

        try {
            Conn c = new Conn();
            String query = "insert into signuptwo values('" + formno + "', '" + religion + "', '" + category + "', '" + income + "', '" + education + "', '" + occupation + "', '" + pan + "', '" + aadhar + "', '" + seniorCitizen + "', '" + existingAccount + "')";
            c.s.executeUpdate(query);

            c.s.executeUpdate(query);

            setVisible(false);
            new SignupThree(formno).setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}