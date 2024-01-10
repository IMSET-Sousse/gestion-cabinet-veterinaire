package veterinaire;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FenetreRDV extends JFrame {
    
	private static final long serialVersionUID = 1L;
	private JButton boutonAccepter;
    private JButton boutonModifier;

    public FenetreRDV() {
        // Initialisation de la fenêtre
        super("Gestion des RDV");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialisation des boutons
        boutonAccepter = new JButton("Accepter");
        boutonModifier = new JButton("Modifier");

        // Ajout des actions aux boutons (vous devrez implémenter ces actions)
        boutonAccepter.addActionListener(e -> {
            // Action à effectuer lorsqu'on clique sur le bouton "Accepter"
            // Exemple : appeler une méthode accepterRendezVous()
            // accepterRendezVous();
        });

        boutonModifier.addActionListener(e -> {
            // Action à effectuer lorsqu'on clique sur le bouton "Modifier"
            // Exemple : appeler une méthode modifierRendezVous()
            // modifierRendezVous();
        });

        // Création d'un panneau pour contenir les boutons
        JPanel panneauBoutons = new JPanel();
        panneauBoutons.add(boutonAccepter);
        panneauBoutons.add(boutonModifier);

        // Ajout du panneau à la fenêtre
        getContentPane().add(panneauBoutons);

        // Affichage de la fenêtre
        setVisible(true);
    }

    // Vous pouvez ajouter ici les méthodes accepterRendezVous() et modifierRendezVous()

    public static void main(String[] args) {
        // Création de l'instance de la fenêtre
        javax.swing.SwingUtilities.invokeLater(() -> {
            new FenetreRDV();
        });
    }
}

	
	



