package Presentation;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class KvitteringSkaerm extends GridPane {

    public KvitteringSkaerm() {

        //Tilføj Textfields, som ikke kan redigeres i og lav dem transparante, men udkommenteret først -
        //så man kan se positionen inden vi har værdier.

        this.setAlignment(Pos.TOP_LEFT);
        this.setHgap(20);
        this.setVgap(20);
        this.setPadding(new Insets(5, 10, 5, 35));
        this.getRowConstraints().add(new RowConstraints(75));
        this.getColumnConstraints().add(new ColumnConstraints(150));
        this.getColumnConstraints().add(new ColumnConstraints(150));
        this.getColumnConstraints().add(new ColumnConstraints(260));


        Text topLabel = new Text("Kvittering");
        topLabel.setFill(Color.DARKRED);
        topLabel.setFont(Font.font("Tahoma", FontWeight.BOLD, 25));
        topLabel.setTextAlignment(TextAlignment.CENTER);
        this.add(topLabel, 0, 0, 2, 2);



        Label name = new Label("Navn: ");
        this.add(name, 0, 1);
        name.setAlignment(Pos.BASELINE_CENTER);


        Label adresse = new Label("Adresse: ");
        this.add(adresse, 0, 2);
        adresse.setAlignment(Pos.BASELINE_CENTER);

        Label telefon = new Label("Telefon: ");
        this.add(telefon, 0, 3);
        telefon.setAlignment(Pos.BASELINE_CENTER);

        Label model = new Label("Model: ");
        this.add(model, 0, 4);
        model.setAlignment(Pos.BASELINE_CENTER);

        Label cpr = new Label("CPR Nr: ");
        this.add(cpr, 0, 5);
        cpr.setAlignment(Pos.BASELINE_CENTER);

        Label leveringsadresse = new Label("Leveringsadresse: ");
        this.add(leveringsadresse, 0, 6);
        leveringsadresse.setAlignment(Pos.BASELINE_CENTER);

        Label udbetalingsprocent = new Label("Udbetalingsprocent: ");
        this.add(udbetalingsprocent, 0, 7);
        udbetalingsprocent.setAlignment(Pos.BASELINE_CENTER);

        Label kreditværdighed = new Label("Kreditværdighed: ");
        this.add(kreditværdighed, 0 , 8);
        kreditværdighed.setAlignment(Pos.BASELINE_CENTER);

        Label rentesats = new Label("Rentesats: ");
        this.add(rentesats, 0, 9);
        rentesats.setAlignment(Pos.BASELINE_CENTER);

        Label totalPris = new Label("Total Pris: ");
        this.add(totalPris, 0 , 10);
        totalPris.setAlignment(Pos.BASELINE_CENTER);


    }
}
