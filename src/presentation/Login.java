package presentation;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Login extends Application {

    public TextField userTxt;
    public PasswordField passField;


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10));

        Text welcomeTxt = new Text("Velkommen till FFL");
        welcomeTxt.setFont(Font.font("Tahoma", FontWeight.BOLD, 25));
        welcomeTxt.setStroke(Color.RED);
        welcomeTxt.setFill(Color.DARKRED);


        grid.add(welcomeTxt, 0, 0);

        Label lblUser = new Label("Brugernavn:");
        grid.add(lblUser, 0, 1);
        lblUser.setFont(new Font("Tahoma", 15));
        lblUser.setTextFill(Color.web("#880808"));



        userTxt = new TextField();
        userTxt.setPromptText("brugernavn");
        grid.add(userTxt, 1, 1);

        Label lblPassword = new Label("Adgangskode:");
        grid.add(lblPassword, 0, 2);
        lblPassword.setFont(new Font("Tahoma", 15));
        lblPassword.setTextFill(Color.web("#880808"));



        passField = new PasswordField();
        passField.setPromptText("adgangskode");
        grid.add(passField, 1, 2);

        Button loginBtn = new Button("Login");
        grid.add(loginBtn, 1, 3);

        grid.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: Red;");

//        ImageView imageView = new ImageView("https://etimg.etb2bimg.com/photo/82184646.cms");
//        grid.getChildren().add(imageView);


        Scene scene = new Scene(grid);
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setScene(scene);
        stage.show();

    }
}