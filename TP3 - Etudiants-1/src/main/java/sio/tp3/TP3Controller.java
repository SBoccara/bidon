package sio.tp3;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.scene.control.Alert;



public class TP3Controller implements Initializable {

    int nbOrdi;
    int nbCoups;


    @FXML
    private Label lblTitre;
    @FXML
    private Button cmdExo1;
    @FXML
    private Button cmdExo2;
    @FXML
    private Button cmdExo3;
    @FXML
    private Button cmdExo4;
    @FXML
    private Button cmdExo5;
    @FXML
    private Button cmdExo6;
    @FXML
    private AnchorPane apExo1;
    @FXML
    private AnchorPane apExo2;
    @FXML
    private AnchorPane apExo3;
    @FXML
    private AnchorPane apExo4;
    @FXML
    private AnchorPane apExo5;
    @FXML
    private AnchorPane apExo6;
    @FXML
    private TextField txtNbKm;
    @FXML
    private Button cmdCalculerFraisKm;
    @FXML
    private TextField txtFraisKm;
    @FXML
    private Button cmdCalculerFacture;
    @FXML
    private TextField txtAncienReleve;
    @FXML
    private TextField txtNouveauReleve;
    @FXML
    private TextField txtConsommation;
    @FXML
    private TextField txtFacture;

    private DecimalFormat df;
    @FXML
    private TextField txtNbExo3;
    @FXML
    private TextField txtSomme;
    @FXML
    private TextField txtFactorielle;
    @FXML
    private Button cmdSomme;
    @FXML
    private Button cmdFactorielle;
    @FXML
    private TextField txtNbEtoilesLigne;
    @FXML
    private TextField txtNbEtoilesColonne;
    @FXML
    private Button cmdDessinerLigne;
    @FXML
    private Button cmdDessinerRectangle;
    @FXML
    private TextArea txtRectangle;
    @FXML
    private Slider sldDu;
    @FXML
    private Slider sldJusqua;
    @FXML
    private Button cmdTableDeMultiplication;
    @FXML
    private TextArea txtTableDeMultiplication;

    private int nbRechercher;
    private int nbPropositions;
    @FXML
    private TextField txtProposition;
    @FXML
    private CheckBox chkTriche;
    @FXML
    private Button cmdJeu;
    @FXML
    private Button cmdReset;
    @FXML
    private TextArea txtJeu;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblTitre.setText("TP3 / Exercice n°1");
        apExo1.toFront();
        df = new DecimalFormat("#.##");

    }
    @FXML
    public void cmdExo1Clicked(Event event) {
        lblTitre.setText("TP3 / Exercice n°1");
        apExo1.toFront();
    }

    @FXML
    public void cmdExo2Clicked(Event event) {
        lblTitre.setText("TP3 / Exercice n°2");
        apExo2.toFront();
    }

    @FXML
    public void cmdExo3Clicked(Event event) {
        lblTitre.setText("TP3 / Exercice n°3");
        apExo3.toFront();
    }

    @FXML
    public void cmdExo4Clicked(Event event) {
        lblTitre.setText("TP3 / Exercice n°4");
        apExo4.toFront();
    }

    @FXML
    public void cmdExo5Clicked(Event event) {
        lblTitre.setText("TP3 / Exercice n°5");
        apExo5.toFront();
    }


    @FXML
    public void cmdExo6Clicked(Event event) {
        lblTitre.setText("TP3 / Exercice n°6");
        apExo6.toFront();

        Random r = new Random();
         nbOrdi = 1 + r.nextInt(100);
         nbCoups = 0;
    }

    @FXML
    public void cmdCalculerFrais(Event event) {
        double frais = 0; // dans cette ligne on déclare une variable vide
        if(txtNbKm.getText().compareTo("")==0)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur de saisie");
            alert.setContentText("Veuillez saisir vos Km");
            alert.setHeaderText("");
            alert.showAndWait();
        }
        else if (Double.parseDouble(txtNbKm.getText()) < 25000)
        {
            // ici on prend le contenu du txtNbKm et on le transforme en Integer et on voit si c supp ou infé a 250K
            frais = Double.parseDouble(txtNbKm.getText()) * 0.32;
            txtFraisKm.setText(String.valueOf(frais));
            //Cette ligne affiche le résultat dans le textField
        }
        else
        {
            // Le nombre de KM est >= à 25000
            frais = Double.parseDouble(txtNbKm.getText()) * 0.22;
            txtFraisKm.setText(String.valueOf(frais));
            //Cette ligne affiche le résultat dans le textField
        }
    }


    @FXML
    public void cmdCalculerFactureClicked(Event event) {
        String ancienReleveText = txtAncienReleve.getText();
        String nouveauReleveText = txtNouveauReleve.getText();

        if (ancienReleveText == null || ancienReleveText.trim().isEmpty()) {
            showErrorAlert("Erreur de saisie", "Veuillez saisir votre ancien relevé");
            return;
        }

        if (nouveauReleveText == null || nouveauReleveText.trim().isEmpty()) {
            showErrorAlert("Erreur de saisie", "Veuillez saisir votre nouveau relevé");
            return;
        }

        try {
            double ancienReleve = Double.parseDouble(ancienReleveText);
            double nouveauReleve = Double.parseDouble(nouveauReleveText);

            if (nouveauReleve < ancienReleve) {
                showErrorAlert("Erreur de saisie", "Le nouveau relevé ne peut être inférieur à l'ancien");
                return;
            }

            double consommation = nouveauReleve - ancienReleve;
            double montantFacture = 0;

            if (consommation <= 100) {
                montantFacture = consommation * 0.083;
            } else if (consommation <= 200) {
                montantFacture = 100 * 0.083 + (consommation - 100) * 0.076;
            } else {
                montantFacture = 100 * 0.083 + 100 * 0.076 + (consommation - 200) * 0.06;
            }

            txtConsommation.setText(String.format("%.2f kW", consommation));
            txtFacture.setText(String.format("%.2f euros", montantFacture));

        } catch (NumberFormatException e) {
            showErrorAlert("Erreur de saisie", "Les relevés doivent être des nombres valides");
        }
    }

    private void showErrorAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.setHeaderText("");
        alert.showAndWait();
    }
    
//boucles= 1) pour--> for (on connait le nombre exact de boucles / 2) tant que --> while (le nombre de fois n'est pas connu à l'avance).

    @FXML
    public void cmdSommeClicked(Event event) {
    if(txtNbExo3.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur de saisie");
            alert.setContentText("Veuillez saisir votre nombre");
            alert.setHeaderText("");
            alert.showAndWait();
        }
        else{
            int somme = 0;
            int nbUser = Integer.parseInt(txtNbExo3.getText());
            for (int i = 1; i <= nbUser; i++) {
                somme = somme + i;
            }
            txtSomme.setText(String.valueOf(somme));
            }

    }


    @FXML
    public void cmdFactorielleClicked(Event event) {
        if(txtNbExo3.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur de saisie");
            alert.setContentText("Veuillez saisir votre nombre");
            alert.setHeaderText("");
            alert.showAndWait();
        }
        else{
            int factorielle = 1;
            int nbUser = Integer.parseInt(txtNbExo3.getText());
            for (int i = 1; i <= nbUser; i++) {
                factorielle *=i;
            }
            txtFactorielle.setText(String.valueOf(factorielle));
        }

    }


    @FXML
    public void cmdDessinerLigneClicked(Event event) {
        if (txtNbEtoilesLigne.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur de saisie");
            alert.setContentText("Veuillez saisir le nombre d'étoile en ligne");
            alert.setHeaderText("");
            alert.showAndWait();
        } else if (txtNbEtoilesColonne.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur de saisie");
            alert.setContentText("Veuillez saisir le nombre d'étoile en colonne ");
            alert.setHeaderText("");
            alert.showAndWait();
        } else {
            String ligne = "";
            for (int i = 1; i <= Integer.parseInt(txtNbEtoilesLigne.getText()); i++) {
                ligne = ligne + " * ";
            }
            txtRectangle.setText(ligne);
        }
    }

    @FXML
    public void cmdDessinerRectangleClicked(Event event) {
        if (txtNbEtoilesLigne.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur de saisie");
            alert.setContentText("Veuillez saisir le nombre d'étoile en ligne");
            alert.setHeaderText("");
            alert.showAndWait();
        }
        else if (txtNbEtoilesColonne.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur de saisie");
            alert.setContentText("Veuillez saisir le nombre d'étoile en colonne ");
            alert.setHeaderText("");
            alert.showAndWait();
        }
        else
        {
            txtRectangle.setText("");

            for (int i = 1; (i <= Integer.parseInt(txtNbEtoilesLigne.getText())); i++)
            {
                for( int j = 1 ; (j<= Integer.parseInt(txtNbEtoilesColonne.getText())); j++ ){
                    txtRectangle.setText(txtRectangle.getText() + " * ");
                }
                txtRectangle.setText(txtRectangle.getText() + "\n");


            }
        }

    }

    @FXML
    public void cmdTableDeMultiplicationClicked(Event event) {
        int demo = ((int) sldDu.getValue());
        for (int i = 1; (i <= sldDu.getValue()); i++)
        {
            int calcul = i*((int) sldDu.getValue());
            txtTableDeMultiplication.setText(txtTableDeMultiplication.getText() + i+"*"+sldDu.getValue()+"=" + calcul +"\n");
        }
    }


    @FXML
    public void chkTricheClicked(Event event) {
        if (chkTriche.isSelected())
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Jeu");
            alert.setContentText("");
            alert.setHeaderText("Nombre choisi par l'ordinateur : "+ nbOrdi);
            alert.showAndWait();
        }
    }

    @FXML
    public void cmdJeuClicked(Event event) {
        nbCoups = nbCoups + 1;

        if (txtProposition.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur de saisie");
            alert.setContentText("Veuillez saisir votre proposition");
            alert.setHeaderText("");
            alert.showAndWait();
        }
        if(nbCoups<=5){

            if (Integer.parseInt(txtProposition.getText()) < nbOrdi) {
                txtJeu.setText(txtJeu.getText() + txtProposition.getText() + " = trop petit" + "\n");

            } else if (Integer.parseInt(txtProposition.getText()) > nbOrdi) {
                txtJeu.setText(txtJeu.getText() + txtProposition.getText() + " = trop grand" + "\n");

            } else if (Integer.parseInt(txtProposition.getText()) == nbOrdi) {
                txtJeu.setText(txtJeu.getText() + txtProposition.getText() + " Bravo ! vous avez trouvé en " + nbCoups  + " essais");}
            } else {
                txtJeu.setText(txtJeu.getText() + " Perdu ! Il fallait trouver : " + nbOrdi);}
        }


    @FXML
    public void cmdResetClicked(Event event) {
        nbCoups = 0;
        txtJeu.setText("");
        txtProposition.setText("");
        Random r = new Random();
        nbOrdi = 1 + r.nextInt(100);
    }


}