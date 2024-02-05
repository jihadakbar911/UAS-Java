/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmanagement;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author OJeSs
 */
public class dashboardController implements Initializable {
    
    @FXML
    private Button data;

    @FXML
    private Button edit;

    @FXML
    private Button home;

    @FXML
    private Button record;

    @FXML
    private Button student;

    @FXML
    private Label user;
    
    
    public void account (){
        
        user.setText(User.username);
    }
    
    public void navButton(){
        
        home.setOnMouseClicked((MouseEvent event) ->{
            
            home.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.6), rgba(255, 106, 239, 0.6));"
                    + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5"
                    + "-fx-border-width:0px 0px 0px 5px");
            
            student.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            record.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            data.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
        });
        
        student.setOnMouseClicked((MouseEvent event) ->{
            
            home.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            student.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.6), rgba(255, 106, 239, 0.6));"
                    + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5"
                    + "-fx-border-width:0px 0px 0px 5px");
            
            record.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            data.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
        });
        
        record.setOnMouseClicked((MouseEvent event) ->{
            
            home.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            student.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            record.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.6), rgba(255, 106, 239, 0.6));"
                    + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5"
                    + "-fx-border-width:0px 0px 0px 5px");
            
            data.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
        });
        
        data.setOnMouseClicked((MouseEvent event) ->{
            
            home.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            student.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            record.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            data.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.6), rgba(255, 106, 239, 0.6));"
                    + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5"
                    + "-fx-border-width:0px 0px 0px 5px");
        });
    }
    
    public void navButtonHover(){
        
        home.setOnMouseEntered((MouseEvent event) ->{
            
            home.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.6), rgba(255, 106, 239, 0.6));"
                    + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5"
                    + "-fx-border-width:0px 0px 0px 5px");
            
            student.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            record.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            data.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
        });
        
        student.setOnMouseEntered((MouseEvent event) ->{
            
            home.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            student.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.6), rgba(255, 106, 239, 0.6));"
                    + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5"
                    + "-fx-border-width:0px 0px 0px 5px");
            
            record.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            data.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
        });
        
        record.setOnMouseEntered((MouseEvent event) ->{
            
            home.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            student.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            record.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.6), rgba(255, 106, 239, 0.6));"
                    + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5"
                    + "-fx-border-width:0px 0px 0px 5px");
            
            data.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
        });
        
        data.setOnMouseEntered((MouseEvent event) ->{
            
            home.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            student.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            record.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            data.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.6), rgba(255, 106, 239, 0.6));"
                    + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5"
                    + "-fx-border-width:0px 0px 0px 5px");
        });
        
        home.setOnMouseExited((MouseEvent event) ->{
            
            home.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            student.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            record.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            data.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
        });
        
        student.setOnMouseExited((MouseEvent event) ->{
            
            home.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            student.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            record.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            data.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
        });
        
        record.setOnMouseExited((MouseEvent event) ->{
            
            home.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            student.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            record.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            data.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
        });
        
        data.setOnMouseExited((MouseEvent event) ->{
            
            home.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            student.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            record.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
            
            data.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.3), rgba(255, 106, 239, 0.3));");
        });
    }
    
    @Override
    public void initialize(URL url, ResourceBundle resource){
        
        account();
        
        navButton();
        navButtonHover();
        
    }
    
}
