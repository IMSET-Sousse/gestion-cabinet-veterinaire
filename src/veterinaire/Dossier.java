package veterinaire;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Dossier extends JFrame {

    private JTextField numField, dateField, nomField, raceField, ageField, poidsField, vaccinationField, medicamentField;
    private JButton modifierButton, enregistrerButton;
    private List<Client> clients; 

    public Dossier() {
        setTitle("Fiche Client Vétérinaire");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        clients = new ArrayList<>();

        numField = new JTextField(10);
        dateField = new JTextField(10);
        nomField = new JTextField(10);
        raceField = new JTextField(10);
        ageField = new JTextField(10);
        poidsField = new JTextField(10);
        vaccinationField = new JTextField(10);
        medicamentField = new JTextField(10);

        modifierButton = new JButton("Modifier");
        modifierButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modifierFiche();
            }
        });

        enregistrerButton = new JButton("Enregistrer"); 
        enregistrerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enregistrerFiche();
            }
        });

        JPanel panel = new JPanel(new GridLayout(9, 2));
        panel.add(new JLabel("Numéro:"));
        panel.add(numField);
        panel.add(new JLabel("Date:"));
        panel.add(dateField);
        panel.add(new JLabel("Nom:"));
        panel.add(nomField);
        panel.add(new JLabel("Race:"));
        panel.add(raceField);
        panel.add(new JLabel("Âge:"));
        panel.add(ageField);
        panel.add(new JLabel("Poids:"));
        panel.add(poidsField);
        panel.add(new JLabel("Vaccination:"));
        panel.add(vaccinationField);
        panel.add(new JLabel("Médicament:"));
        panel.add(medicamentField);

        panel.add(modifierButton);
        panel.add(enregistrerButton); 

   
        add(panel);

        
        setVisible(true);
    }

    private void modifierFiche() {
        int num = Integer.parseInt(numField.getText());
      
            String date = dateField.getText();
            String nom = nomField.getText();
            String race = raceField.getText();
            int age = Integer.parseInt(ageField.getText());
            double poids = Double.parseDouble(poidsField.getText());
            String vaccination = vaccinationField.getText();
            String medicament = medicamentField.getText();

            Client client = trouverClient(num);
            if (client != null) {
                client.setDate(date);
                client.setNom(nom);
                client.setRace(race);
                client.setAge(age);
                client.setPoids(poids);
                client.setVaccination(vaccination);
                client.setMedicament(medicament);

                JOptionPane.showMessageDialog(this, "Fiche client modifiée avec succès!");
            } else {
                JOptionPane.showMessageDialog(this, "Client non trouvé!");
            }
        

    }

    private void enregistrerFiche() {
        int nouveauNum = Integer.parseInt(numField.getText());
        String nouvelleDate = dateField.getText();
        String nouveauNom = nomField.getText();
        String nouvelleRace = raceField.getText();
        int nouvelAge = Integer.parseInt(ageField.getText());
        double nouveauPoids = Double.parseDouble(poidsField.getText());
        String nouvelleVaccination = vaccinationField.getText();
        String nouveauMedicament = medicamentField.getText();

        Client nouveauClient = new Client();
        nouveauClient.setNum(nouveauNum);
        nouveauClient.setDate(nouvelleDate);
        nouveauClient.setNom(nouveauNom);
        nouveauClient.setRace(nouvelleRace);
        nouveauClient.setAge(nouvelAge);
        nouveauClient.setPoids(nouveauPoids);
        nouveauClient.setVaccination(nouvelleVaccination);
        nouveauClient.setMedicament(nouveauMedicament);

        clients.add(nouveauClient);

        JOptionPane.showMessageDialog(this, "Fiche client enregistrée avec succès!");
    }

    private Client trouverClient(int numero) {
        for (Client client : clients) {
            if (client.getNum() == numero) {
                return client;
            }
        }
        return null;
    }

    private static class Client {
        private int num;
        private String date;
        private String nom;
        private String race;
        private int age;
        private double poids;
        private String vaccination;
        private String medicament;

        public void setNum(int num) {
            this.num = num;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public void setRace(String race) {
            this.race = race;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setPoids(double poids) {
            this.poids = poids;
        }

        public void setVaccination(String vaccination) {
            this.vaccination = vaccination;
        }

        public void setMedicament(String medicament) {
            this.medicament = medicament;
        }

        public int getNum() {
            return num;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Dossier();
            }
        });
    }
}



