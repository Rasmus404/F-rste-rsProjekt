package Presentation;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import Logic.Kunde;

public class OpretKoebSkaerm extends GridPane {

    public OpretKoebSkaerm() {



        this.setAlignment(Pos.TOP_LEFT);
        this.setHgap(30);
        this.setVgap(30);
        this.setPadding(new Insets(5, 10, 5, 35));
        this.getRowConstraints().add(new RowConstraints(75));
        this.getColumnConstraints().add(new ColumnConstraints(150));
        this.getColumnConstraints().add(new ColumnConstraints(150));
        this.getColumnConstraints().add(new ColumnConstraints(260));



        Text topLabel = new Text("Opret nyt køb");
        topLabel.setFill(Color.DARKRED);
        topLabel.setFont(Font.font("Tahoma", FontWeight.BOLD, 25));
        this.add(topLabel, 0, 0,2,2);



        // Fornavn
        TextField firstname = new TextField();
        this.add(firstname, 0, 2);
        firstname.setAlignment(Pos.BASELINE_CENTER);
        firstname.setFocusTraversable(false);
        firstname.setPromptText("Navn");
        //firstname.setOnAction(e-> kunde.setNavn(firstname.getText()));

        // cpr
        TextField cpr = new TextField();
        this.add(cpr, 0, 3);
        cpr.setAlignment(Pos.BASELINE_CENTER);
        cpr.setFocusTraversable(false);
        cpr.setPromptText("Cpr-nr");
        //cpr.setOnAction(e-> kunde.setCpr(cpr.getText()));

        //telefon
        TextField telefon = new TextField();
        this.add(telefon, 0, 4);
        telefon.setAlignment(Pos.BASELINE_CENTER);
        telefon.setFocusTraversable(false);
        telefon.setPromptText("Telefon");
        //telefon.setOnAction(e-> kunde.setTlf(telefon.getText()));

        //adresse
        TextField adresse = new TextField();
        this.add(adresse, 0, 5);
        adresse.setAlignment(Pos.BASELINE_CENTER);
        adresse.setFocusTraversable(false);
        adresse.setPromptText("Adresse");
        //adresse.setOnAction(e-> kunde.setAdresse(adresse.getText()));

        //model
        ObservableList<String> models = FXCollections.observableArrayList(
                "Ferrari 812 Superfast 6,5 DCT 2d",
                "Ferrari California T 3,8 F1 2d" ,
                "Ferrari GTC4Lusso T 3,9 DCT 2d",
                "Ferrari Portofino 3,9 DCT 2d",
                "Ferrari 488 Pista 3,9 DCT 2d",
                "Ferrari 488 Spider 3,9 DCT 2d");

        ComboBox model = new ComboBox(models);
        model.setMinWidth(150);
        model.setEditable(false);
        //model.setMaxWidth();
        this.add(model, 0, 6);
        model.setFocusTraversable(false);
        model.setPromptText("Model");
        //model.setOnAction(e-> kunde.setModel(model.getValue().toString()));

        //leveringsadresse
        TextField leveringsadresse = new TextField();
        this.add(leveringsadresse, 0, 7);
        leveringsadresse.setAlignment(Pos.BASELINE_CENTER);
        leveringsadresse.setFocusTraversable(false);
        leveringsadresse.setPromptText("Leveringsadresse");
        leveringsadresse.setDisable(true);
        //leveringsadresse.setOnAction(e-> kunde.setLeveringsadresse(leveringsadresse.getText()));

        CheckBox check = new CheckBox("Ønsket levering");
        //check
        this.add(check, 1, 7);
        check.setAlignment(Pos.BOTTOM_RIGHT);
        check.setOnAction(e-> {
            if (check.isSelected()) {
                leveringsadresse.setDisable(false);}
            else {
                leveringsadresse.clear();
                leveringsadresse.setDisable(true);
            }
        });
        Button nextButton = new Button("Videre");
        Font NBSize = new Font(15);
        nextButton.setFont(NBSize);
        this.add(nextButton, 2, 7);
        nextButton.setAlignment(Pos.BASELINE_RIGHT);
        nextButton.setOnAction(e ->{
                    Kunde kunde = new Kunde();
                    kunde.setNavn(firstname.getText());
                    kunde.setCpr(cpr.getText());
                    kunde.setTlf(telefon.getText());
                    kunde.setAdresse(adresse.getText());
                    kunde.setModel(model.getValue().toString());
                    kunde.setLeveringsadresse(leveringsadresse.getText());

                    if(kunde.isValid()) {
                        StartSkaerm.instance().setFocus(new LaaneaftaleSkaerm(kunde));
                    }
                }
        );
    }
}

