package Presentation;

import Logic.Kunde;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class LaaneaftaleSkaerm extends GridPane {

    Kunde kunde;

    public LaaneaftaleSkaerm (Kunde kunde) {

        this.kunde = kunde;

        this.setAlignment(Pos.TOP_LEFT);
        this.setHgap(30);
        this.setVgap(30);
        this.setPadding(new Insets(5, 10, 5, 35));
        this.getRowConstraints().add(new RowConstraints(75));
        this.getColumnConstraints().add(new ColumnConstraints(150));
        this.getColumnConstraints().add(new ColumnConstraints(150));
        this.getColumnConstraints().add(new ColumnConstraints(260));

        Text topLabel = new Text("Rente Aftale - " + kunde.getNavn());
        topLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 25));
        this.add(topLabel, 0, 0,2,2);
        topLabel.setFill(Color.DARKRED);


        // model
        Label model = new Label("Model:");
        this.add(model, 0, 1);
        model.setAlignment(Pos.BASELINE_CENTER);
        model.setTextFill(Color.web("#8B0000"));
        model.setFont(Font.font("Tahoma", FontWeight.BOLD, 13));



        Label modelValgt = new Label(kunde.getModel());
        this.add(modelValgt, 1, 1);
        modelValgt.setAlignment(Pos.BASELINE_CENTER);
        modelValgt.setTextFill(Color.web("#8B0000"));
        modelValgt.setFont(Font.font("Tahoma", FontWeight.BOLD, 13));



        // totalpris
        Label totalpris = new Label("Total Pris:");
        this.add(totalpris, 0, 2);
        totalpris.setAlignment(Pos.BASELINE_CENTER);
        totalpris.setTextFill(Color.web("#8B0000"));
        totalpris.setFont(Font.font("Tahoma", FontWeight.BOLD, 13));


        TextField prisField = new TextField();
        this.add(prisField,1,2);
        prisField.setAlignment(Pos.BASELINE_CENTER);
        prisField.setDisable(true);

        //udbetalingsprocent
        Label udbetalingsprocent = new Label("Udbetalingsprocent:");
        this.add(udbetalingsprocent, 0, 3);
        udbetalingsprocent.setAlignment(Pos.BASELINE_CENTER);
        udbetalingsprocent.setTextFill(Color.web("#8B0000"));
        udbetalingsprocent.setFont(Font.font("Tahoma", FontWeight.BOLD, 13));



        TextField ubField = new TextField();
        this.add(ubField,1,3);
        ubField.setAlignment(Pos.BASELINE_CENTER);
        ubField.setDisable(false);


        //løbetid
        Label loebetid = new Label("Løbetid:");
        this.add(loebetid, 0, 4);
        loebetid.setAlignment(Pos.BASELINE_CENTER);
        loebetid.setTextFill(Color.web("#8B0000"));
        loebetid.setFont(Font.font("Tahoma", FontWeight.BOLD, 13));



        TextField loebetidField = new TextField();
        this.add(loebetidField,1,4);
        loebetidField.setAlignment(Pos.BASELINE_CENTER);
        loebetidField.setDisable(false);


        //rentesats
        Label rentesats = new Label("Rentesats");
        this.add(rentesats, 0, 5);
        rentesats.setAlignment(Pos.BASELINE_CENTER);
        rentesats.setTextFill(Color.web("#8B0000"));
        rentesats.setFont(Font.font("Tahoma", FontWeight.BOLD, 13));



        TextField renteField = new TextField();
        this.add(renteField,1,5);
        renteField.setAlignment(Pos.BASELINE_CENTER);
        renteField.setDisable(true);


        //månedlig udbetaling
        Label maanedligudbetaling = new Label("Månedligudbetaling");
        this.add(maanedligudbetaling, 0, 6);
        maanedligudbetaling.setAlignment(Pos.BASELINE_CENTER);
        maanedligudbetaling.setTextFill(Color.web("#8B0000"));
        maanedligudbetaling.setFont(Font.font("Tahoma", FontWeight.BOLD, 13));



        TextField mdrUdbetalingField = new TextField();
        this.add(mdrUdbetalingField,1,6);
        mdrUdbetalingField.setAlignment(Pos.BASELINE_CENTER);
        mdrUdbetalingField.setDisable(true);



        Button nextButton = new Button("Videre");
        Font NBSize = new Font(15);
        nextButton.setFont(NBSize);
        this.add(nextButton, 3, 7);
        nextButton.setAlignment(Pos.BASELINE_RIGHT);



    }
}
