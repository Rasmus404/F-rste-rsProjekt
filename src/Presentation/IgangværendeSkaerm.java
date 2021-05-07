package Presentation;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class IgangværendeSkaerm extends GridPane {

    public IgangværendeSkaerm() {


        this.setAlignment(Pos.CENTER);
        this.setHgap(20);
        this.setVgap(3);
        this.setPadding(new Insets(3, 3, 3, 3));
        this.getColumnConstraints().add(new ColumnConstraints(200));
        this.getColumnConstraints().add(new ColumnConstraints(160));
        this.getColumnConstraints().add(new ColumnConstraints(200));

        Text topLabel = new Text("Igangværende køb");
        topLabel.setFont(Font.font("Tahoma", FontWeight.BOLD, 25));
        topLabel.setFill(Color.DARKRED);
        this.add(topLabel, 1, 0, 1, 1);
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


        TableView<String> Kundelist = new TableView<String>();
        TableColumn Navn = new TableColumn("Navn");
        TableColumn Tlf = new TableColumn("Telefon nr");
        TableColumn By = new TableColumn("By");
        Kundelist.getColumns().add(Navn);
        Kundelist.getColumns().add(Tlf);
        Kundelist.getColumns().add(By);
        Kundelist.setPrefSize(560, 450);
        this.add(Kundelist, 0, 2, 3, 1);

        Button nextButton = new Button("Videre");
        Font NBSize = new Font(15);
        nextButton.setFont(NBSize);
        this.add(nextButton, 1, 2);
        nextButton.setOnAction(e -> StartSkaerm.instance().setFocus(new KundeInfoSkaerm()));
    }
}
