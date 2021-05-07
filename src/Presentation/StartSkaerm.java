package Presentation;

import Logic.LoginChecker;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Label;



public class StartSkaerm extends BorderPane{


    private VBox leftBorder;
    private Button opret, kunde, igangværende;

    private static StartSkaerm inst=null;

    public static StartSkaerm instance() {
        if (inst == null)
            inst = new StartSkaerm();

        return inst;
    }
    private StartSkaerm() {


        leftBorder = new VBox();
        leftBorder.setPrefWidth(750/ 4);
        leftBorder.setStyle("-fx-background-color: #FF0000;");
        leftBorder.setAlignment(Pos.TOP_CENTER);
        leftBorder.setPadding(new Insets(5, 5, 5, 5));
        leftBorder.setSpacing(35);


        opret = new Button("Opret");
        opret.setOnAction(e -> setFocus(new OpretKoebSkaerm()));

        kunde = new Button("Kunde");
        kunde.setOnAction(e -> setFocus(new KundeSkaerm()));

        igangværende = new Button("Igangværende");
        opret.setPrefWidth(leftBorder.getPrefWidth() / 1.1);
        kunde.setPrefWidth(opret.getPrefWidth());
        igangværende.setPrefWidth(opret.getPrefWidth());

        Label usernameLabel = new Label("\n\n\nDu er logget ind som\n " + LoginChecker.username);
        usernameLabel.setFont(Font.font("Tahoma", FontWeight.BOLD, 14));
        usernameLabel.setAlignment(Pos.BOTTOM_CENTER);
        usernameLabel.setTextFill(Color.web("#FFFFFF"));

        Image img2 = new Image("file:Laferrariedit.png");
        ImageView logo2 = new ImageView(img2);
        logo2.setImage(img2);
        logo2.fitWidthProperty().bind(this.widthProperty());
        logo2.fitHeightProperty().bind(this.heightProperty());
        this.setCenter(logo2);

        Image img = new Image("file:logo.png");
        ImageView logo = new ImageView(img);
        logo.setImage(img);
        leftBorder.getChildren().addAll(logo, opret, kunde, igangværende, usernameLabel);
        logo.setPickOnBounds(true);
        logo.setOnMouseClicked(e -> setFocus(logo2));

        this.setLeft(leftBorder);

//        Image img2 = new Image("file:laferrari.jpg", 750, 750, false, false);


    }
    public void setFocus(Node focus) {
        this.setCenter(focus);
    }

}
