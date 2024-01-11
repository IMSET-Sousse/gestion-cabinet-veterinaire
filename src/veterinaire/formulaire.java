package veterinaire;


	import javax.swing.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class formulaire {

		 public static void main(String[] args) {
		        SwingUtilities.invokeLater(() -> {
		            JFrame frame = new JFrame("Formulaire Vétérinaire");
		            frame.setSize(400, 250);
		            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		            JPanel panel = new JPanel();
		            frame.add(panel);
		            placeComponents(panel);

		            frame.setVisible(true);
		        });
		    }

		    private static void placeComponents(JPanel panel) {
		        panel.setLayout(null);

		        JLabel nameLabel = new JLabel("Nom de l'Animal:");
		        nameLabel.setBounds(10, 20, 150, 25);
		        panel.add(nameLabel);

		        JTextField nameTextField = new JTextField(20);
		        nameTextField.setBounds(160, 20, 200, 25);
		        panel.add(nameTextField);

		        JLabel breedLabel = new JLabel("Race:");
		        breedLabel.setBounds(10, 50, 150, 25);
		        panel.add(breedLabel);

		        JTextField breedTextField = new JTextField(20);
		        breedTextField.setBounds(160, 50, 200, 25);
		        panel.add(breedTextField);

		        JLabel ageLabel = new JLabel("Âge:");
		        ageLabel.setBounds(10, 80, 150, 25);
		        panel.add(ageLabel);

		        JTextField ageTextField = new JTextField(20);
		        ageTextField.setBounds(160, 80, 200, 25);
		        panel.add(ageTextField);

		        JLabel weightLabel = new JLabel("Poids:");
		        weightLabel.setBounds(10, 110, 150, 25);
		        panel.add(weightLabel);

		        JTextField weightTextField = new JTextField(20);
		        weightTextField.setBounds(160, 110, 200, 25);
		        panel.add(weightTextField);

		        JLabel vaccinationLabel = new JLabel("Vaccination:");
		        vaccinationLabel.setBounds(10, 140, 150, 25);
		        panel.add(vaccinationLabel);

		        JTextField vaccinationTextField = new JTextField(20);
		        vaccinationTextField.setBounds(160, 140, 200, 25);
		        panel.add(vaccinationTextField);

		        JButton submitButton = new JButton("envoyer");
		        submitButton.setBounds(10, 180, 150, 25);
		        panel.add(submitButton);

		        submitButton.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                String name = nameTextField.getText();
		                String breed = breedTextField.getText();
		                String age = ageTextField.getText();
		                String weight = weightTextField.getText();
		                String vaccination = vaccinationTextField.getText();

		                System.out.println("Nom de l'Animal: " + name);
		                System.out.println("Race: " + breed);
		                System.out.println("Âge: " + age);
		                System.out.println("Poids: " + weight);
		                System.out.println("Vaccination: " + vaccination);
		            }
		        });
		    }
		}