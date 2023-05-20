import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Datos {
    private JFrame mainFrame;
    private JTextField nameTextField;
    private JTextField ageTextField;
    private JCheckBox javaCheckBox;
    private JComboBox<String> cityComboBox;

    public Datos() {
        mainFrame = new JFrame("Ingreso de Datos");
        mainFrame.setSize(300, 200);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new GridLayout(5, 2));
        mainFrame.getContentPane().setBackground(new Color(102, 204, 255)); // Establecer color de fondo celeste

        JLabel nameLabel = new JLabel("Nombre:");
        nameTextField = new JTextField(10);
        JLabel ageLabel = new JLabel("Edad:");
        ageTextField = new JTextField(10);
        JLabel javaLabel = new JLabel("¿Sabes Java?");
        javaCheckBox = new JCheckBox();
        JLabel cityLabel = new JLabel("Municipio:");
        cityComboBox = new JComboBox<>(new String[]{"Livington", "Puerto Barrios", "El Estor"});

        JButton submitButton = new JButton("Enviar");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                int age = Integer.parseInt(ageTextField.getText());
                boolean knowsJava = javaCheckBox.isSelected();
                String city = cityComboBox.getSelectedItem().toString();

                showUserData(name, age, knowsJava, city);
            }
        });

        mainFrame.add(nameLabel);
        mainFrame.add(nameTextField);
        mainFrame.add(ageLabel);
        mainFrame.add(ageTextField);
        mainFrame.add(javaLabel);
        mainFrame.add(javaCheckBox);
        mainFrame.add(cityLabel);
        mainFrame.add(cityComboBox);
        mainFrame.add(new JLabel()); // Empty label for spacing
        mainFrame.add(submitButton);

        mainFrame.setVisible(true);
    }

    private void showUserData(String name, int age, boolean knowsJava, String city) {
        JFrame userDataFrame = new JFrame("Datos del Usuario");
        userDataFrame.setSize(300, 150);
        userDataFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        userDataFrame.setLayout(new GridLayout(4, 2));
        userDataFrame.getContentPane().setBackground(new Color(102, 204, 255)); // Establecer color de fondo celeste

        JLabel nameLabel = new JLabel("Nombre:");
        JLabel nameValueLabel = new JLabel(name);
        JLabel ageLabel = new JLabel("Edad:");
        JLabel ageValueLabel = new JLabel(Integer.toString(age));
        JLabel javaLabel = new JLabel("¿Sabes Java?");
        JLabel javaValueLabel = new JLabel(knowsJava ? "Sí" : "No");
        JLabel cityLabel = new JLabel("Ciudad:");
        JLabel cityValueLabel = new JLabel(city);

        userDataFrame.add(nameLabel);
        userDataFrame.add(nameValueLabel);
        userDataFrame.add(ageLabel);
        userDataFrame.add(ageValueLabel);
        userDataFrame.add(javaLabel);
        userDataFrame.add(javaValueLabel);
        userDataFrame.add(cityLabel);
        userDataFrame.add(cityValueLabel);

        userDataFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Datos();
            }
        });
    }
}

