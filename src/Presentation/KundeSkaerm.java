package Presentation;

import Logic.Kunde;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.geometry.Pos;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

///*

public class KundeSkaerm extends GridPane {

    public KundeSkaerm() {

        this.setAlignment(Pos.CENTER);
        this.setHgap(20);
        this.setVgap(3);
        this.setPadding(new Insets(3, 3, 3, 3));
        this.getColumnConstraints().add(new ColumnConstraints(200));
        this.getColumnConstraints().add(new ColumnConstraints(160));
        this.getColumnConstraints().add(new ColumnConstraints(200));

        Text topLabel = new Text("Kunde");
        topLabel.setFont(Font.font("Tahoma", FontWeight.BOLD, 25));
        topLabel.setFill(Color.DARKRED);
        this.add(topLabel, 1, 0,1,1);
        topLabel.setTextAlignment(TextAlignment.CENTER);

        Button Soeg = new Button("Søg");
        Font SoegSize = new Font(10);
        Soeg.setFont(SoegSize);
        this.add(Soeg, 1, 1);
        Soeg.setAlignment(Pos.TOP_RIGHT);

        TextField Soegefelt = new TextField();
        this.add(Soegefelt, 0, 1);
        Soegefelt.setAlignment(Pos.TOP_LEFT);
        Soegefelt.setPromptText("Søgefelt");

        // HBox soegBox = new HBox(Soegefelt, Soeg);
        //this.add(soegBox,0,1,2,1);


        TableView<String> Kundelist = new TableView<String>();
        TableColumn Navn = new TableColumn("Navn");
        TableColumn Tlf = new TableColumn("Telefon nr");
        TableColumn By = new TableColumn("By");
        Kundelist.getColumns().add(Navn);
        Kundelist.getColumns().add(Tlf);
        Kundelist.getColumns().add(By);
        Kundelist.setPrefSize(560, 450);
        this.add(Kundelist, 0, 2,3,1);

        Button nextButton = new Button("Videre");
        Font NBSize = new Font(15);
        nextButton.setFont(NBSize);
        this.add(nextButton, 1, 2);
        nextButton.setAlignment(Pos.TOP_RIGHT);
        nextButton.setOnAction(e -> StartSkaerm.instance().setFocus(new KundeInfoSkaerm()));



    }
}


        /* Button nextButton = new Button("Videre");
        Font NBSize = new Font(15);
        nextButton.setFont(NBSize);
        center.add(nextButton, 7, 9);
        nextButton.setAlignment(Pos.BASELINE_RIGHT);

        // model
        Label model = new Label();
        center.add(model, 5, 3);
        model.setAlignment(Pos.BASELINE_CENTER);
        model.setFocusTraversable(false);

        // totalpris
        Label totalpris = new Label();
        center.add(totalpris, 5, 4);
        totalpris.setAlignment(Pos.BASELINE_CENTER);
        totalpris.setFocusTraversable(false);

        //udbetalingsprocent
        Label udbetalingsprocent = new Label();
        center.add(udbetalingsprocent, 5, 5);
        udbetalingsprocent.setAlignment(Pos.BASELINE_CENTER);
        udbetalingsprocent.setFocusTraversable(false);

        //løbetid
        Label loebetid = new Label();
        center.add(loebetid, 5, 6);
        loebetid.setAlignment(Pos.BASELINE_CENTER);
        loebetid.setFocusTraversable(false);

        //rentesats
        Label rentesats = new Label("Rentesats");
        center.add(rentesats, 5, 7);
        rentesats.setAlignment(Pos.BASELINE_CENTER);
        rentesats.setFocusTraversable(false);

        //månedlig udbetaling
        Label maanedligudbetaling = new Label();
        center.add(maanedligudbetaling, 5, 8);
        maanedligudbetaling.setAlignment(Pos.BASELINE_CENTER);
        maanedligudbetaling.setFocusTraversable(false);

    }






    }
*/