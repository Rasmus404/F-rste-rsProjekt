package Presentation;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class KundeInfoSkaerm extends GridPane {
    public KundeInfoSkaerm() {

        this.setAlignment(Pos.CENTER);
        this.setHgap(20);
        this.setVgap(20);
        this.setPadding(new Insets(3, 20, 10, 35));
        this.getColumnConstraints().add(new ColumnConstraints(90));
        this.getColumnConstraints().add(new ColumnConstraints(160));
        this.getColumnConstraints().add(new ColumnConstraints(200));

        TextField kundeNavn = new TextField();
        this.add(kundeNavn, 1, 0);
        kundeNavn.setAlignment(Pos.TOP_RIGHT);
        kundeNavn.setDisable(true);

        Label navnLabel = new Label("Navn:");
        navnLabel.setFont(Font.font("Tahoma", FontWeight.BOLD, 15));
        this.add(navnLabel, 0, 0);
        navnLabel.setAlignment(Pos.TOP_LEFT);

        TextField kundeTelefon = new TextField();
        this.add(kundeTelefon, 1, 1);
        kundeTelefon.setAlignment(Pos.TOP_RIGHT);
        kundeTelefon.setDisable(true);

        Label telefonLabel = new Label("Telefon:");
        telefonLabel.setFont(Font.font("Tahoma", FontWeight.BOLD, 15));
        this.add(telefonLabel, 0, 1);
        telefonLabel.setAlignment(Pos.TOP_LEFT);

        TextField kundeAdresse = new TextField();
        this.add(kundeAdresse, 1, 2);
        kundeAdresse.setAlignment(Pos.TOP_RIGHT);
        kundeAdresse.setDisable(true);

        Label adresseLabel = new Label("Adresse:");
        adresseLabel.setFont(Font.font("Tahoma", FontWeight.BOLD, 15));
        this.add(adresseLabel, 0, 2);
        adresseLabel.setAlignment(Pos.TOP_LEFT);

        TableView kundeHistorik = new TableView();
        TableColumn Model = new TableColumn("Model");
        TableColumn Kvittering = new TableColumn("Kvittering");
        kundeHistorik.getColumns().add(Model);
        kundeHistorik.getColumns().add(Kvittering);
        kundeHistorik.setPrefSize(560, 340);
        this.add(kundeHistorik, 0, 3, 3, 1);

        Button nextButton = new Button("Videre");
        Font NBSize = new Font(15);
        nextButton.setFont(NBSize);
        this.add(nextButton, 1, 2);
        nextButton.setAlignment(Pos.TOP_RIGHT);
        nextButton.setOnAction(e -> StartSkaerm.instance().setFocus(new KvitteringSkaerm()));
    }
}
