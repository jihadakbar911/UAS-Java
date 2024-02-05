/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package schoolmanagement;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author OJeSs
 */
public class FXMLDocumentController implements Initializable {
    
  @FXML
    private Hyperlink create_acc;

    @FXML
    private Hyperlink login_acc;

    @FXML
    private Button login_btn;

    @FXML
    private AnchorPane login_form;

    @FXML
    private Label m;

    @FXML
    private Label m1;

    @FXML
    private PasswordField password;

    @FXML
    private Button signup_btn;

    @FXML
    private AnchorPane signup_form;

    @FXML
    private TextField su_email;

    @FXML
    private PasswordField su_password;

    @FXML
    private TextField su_username;

    @FXML
    private TextField username;
    
    // database
    private Connection connect;
    private Statement statement;
    private PreparedStatement prepare;
    private ResultSet result;
    
    
    public void exit(){
        
        System.exit(0);
    }
    
    public void textfieldDesign(){
        if(username.isFocused()) {
            
            
            username.setStyle("-fx-background-color:#fff;" + "-fx-border-width:2px");
            
            
            password.setStyle("-fx-background-color:transparent;" + "-fx-border-width:1px");
        
        } else if (password.isFocused()) {
            
            username.setStyle("-fx-background-color:#fff;" + "-fx-border-width:1px");
            
            
            password.setStyle("-fx-background-color:#fff;" + "-fx-border-width:2px");
        } 
    }
    
    public void textfieldDesign1() {
        
        if(su_username.isFocused()){
            
            su_username.setStyle("-fx-background-color:#fff;" + "-fx-border-width:2px");
            
            
            su_password.setStyle("-fx-background-color:transparent;" + "-fx-border-width:1px");
            
            su_email.setStyle("-fx-background-color:transparent;" + "-fx-border-width:1px");
        
        }else if(su_email.isFocused()){
            
            su_username.setStyle("-fx-background-color:transparent;" + "-fx-border-width:1px");
            
            
            su_password.setStyle("-fx-background-color:transparent;" + "-fx-border-width:1px");
            
     
            su_email.setStyle("-fx-background-color:#fff;" + "-fx-border-width:2px");
        
        }else if(su_password.isFocused()){
            
            su_username.setStyle("-fx-background-color:transparent;" + "-fx-border-width:1px");
            
            
            su_password.setStyle("-fx-background-color:#fff;" + "-fx-border-width:2px");
            
            su_email.setStyle("-fx-background-color:transparent;" + "-fx-border-width:1px");
            
        } 
    }
    
    public void dropShadowEffect(){
        
        DropShadow original = new DropShadow(20, Color.valueOf("#ae44a5"));
        
        original.setRadius(30);
        
        m.setEffect(original);
        
        m1.setEffect(original);
        
        m.setOnMouseEntered( (MouseEvent event) ->{
            
           DropShadow shadow = new DropShadow(60, Color.valueOf("#e03ed5"));
           
           m.setCursor(Cursor.HAND);
           m.setStyle("-fx-text-fill:#ff5df1");
           m.setEffect(original);
           
        });
        
        m.setOnMouseExited( (MouseEvent event) ->{
            
           
           m.setStyle("-fx-text-fill:#000");
           m.setEffect(original);
           
        });
        
        m1.setOnMouseEntered( (MouseEvent event) ->{
            
           DropShadow shadow = new DropShadow(60, Color.valueOf("#e03ed5"));
           
           m1.setCursor(Cursor.HAND);
           m1.setStyle("-fx-text-fill:#ff5df1");
           m1.setEffect(original);
           
        });
        
        m1.setOnMouseExited( (MouseEvent event) ->{
            
           
           m1.setStyle("-fx-text-fill:#000");
           m1.setEffect(original);
           
        });
      
    }
    
    public void changeForm(ActionEvent event){
        
        if(event.getSource()== create_acc){
            
            signup_form.setVisible(true);
            login_form.setVisible(false);
            
        } else if(event.getSource()== login_acc){
            
            login_form.setVisible(true);
            signup_form.setVisible(false);
        }
    }
    
    
    
    
    public void login(){
        
        connect = database.connectDb();
        
        String sql = "SELECT * FROM account WHERE username = ? and password = ?";
        
        try{
            
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, username.getText());
            prepare.setString(2, password.getText());
            
            result = prepare.executeQuery();
            
            if(result.next()) {
                
                User.username = result.getString("username");
                
                Alert alert = new Alert(AlertType.INFORMATION);
                
                alert.setTitle("Jihad Message");
                alert.setHeaderText(null);
                alert.setContentText("Succesfully Login!");
                alert.showAndWait();
                
                login_btn.getScene().getWindow().hide();
                
                Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
                
                Scene scene = new Scene(root);
                
                Stage stage = new Stage();
                
                stage.setScene(scene);
                stage.show();
                
            } else {
                
                Alert alert = new Alert(AlertType.ERROR);
                
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Wrong Username / Password! ");
                alert.showAndWait();
            }
            
        } catch(Exception e){}
            
    }
    
    public void signup(){
        
        connect = database.connectDb();
        
        String sql = "INSERT INTO account (username,password,email) VALUES (?,?,?)";
        
        try{
            
            if(su_username.getText().isEmpty() 
                    | su_password.getText().isEmpty()
                    | su_email.getText().isEmpty()){
                
                Alert alert = new Alert(AlertType.ERROR);
                
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Enter all field blanks!");
                alert.showAndWait();
                
            } else if(su_password.getText().length() < 8){
                
                Alert alert = new Alert(AlertType.ERROR);
                
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Invalid Password");
                alert.showAndWait();
                
            } else {
            
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, su_username.getText());
            prepare.setString(2, su_password.getText());
            prepare.setString(3, su_email.getText());
            
            prepare.execute();
            
            Alert alert = new Alert(AlertType.INFORMATION);
            
            alert.setTitle("Jihad Message");
            alert.setHeaderText(null);
            alert.setContentText("Succesfully create new account!");
            alert.showAndWait();
            
            }
            
        }catch(Exception e){e.printStackTrace();}
    
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        dropShadowEffect();
        
    }    
    
}
