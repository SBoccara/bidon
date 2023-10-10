package sio.perso1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController
{
    @javafx.fxml.FXML
    private Button btnExempleN1;
    @javafx.fxml.FXML
    private Button btnExempleN2;
    @javafx.fxml.FXML
    private Label lblContacts;
    @javafx.fxml.FXML
    private Button btnAjouter;
    @javafx.fxml.FXML
    private Button btnModifier;
    @javafx.fxml.FXML
    private Button btnSupprimer;
    @javafx.fxml.FXML
    private TableColumn tcNom;
    @javafx.fxml.FXML
    private TableColumn tcPrenom;
    @javafx.fxml.FXML
    private TableColumn tcAge;
    @javafx.fxml.FXML
    private Label lblTP1;
    @javafx.fxml.FXML
    private TableView tvContacts;
    @javafx.fxml.FXML
    private Button btnExempleN21;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void btnExempleN1Clicked(Event event) {
    }

    @Deprecated
    public void btnExempleN2Clicked(Event event) {
    }

    @Deprecated
    public void btnExempleN3Clicked(Event event) {
    }

    @Deprecated
    public void lblContactsClicked(Event event) {
    }

    @Deprecated
    public void btnAjouterClicked(Event event) {
    }

    @Deprecated
    public void btnModifierClicked(Event event) {
    }

    @Deprecated
    public void btnSupprimerClicked(Event event) {

    }

    { ObservableList<Contacts> lesContacts;

        lesContacts = FXCollections.observableArrayList();
        lesContacts.add(new Contacts("Fortin", "François", 50));
        lesContacts.add(new Contacts("Annonier", "Eric", 49));
        lesContacts.add(new Contacts("Cousinot", "Sebastien", 51));

        tcNom. setCellValueFactory (new PropertyValueFactory<Contacts, String> ( "nom")) ;
        tcPrenom.setCellValueFactory(new PropertyValueFactory<Contacts, String> ( "prenom"));
        tcAge.setCellValueFactory(new PropertyValueFactory<Contacts, String>( "age")) ;

        tvContacts.setItems(lesContacts);

    }


    @Deprecated
    public void lblTP1Clicked(Event event) {
    }

    @Deprecated
    public void tvContactsClicked(Event event) {
    }
}

