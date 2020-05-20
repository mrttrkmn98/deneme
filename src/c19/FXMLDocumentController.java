/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c19;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author dell
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private AnchorPane anchorm;
    @FXML
    private Button buttona;
    @FXML
    private Label labela;
    @FXML
    private Label labelb;
    @FXML
    private Button buttonm1;
    @FXML
    private ImageView im;
    @FXML
    private Button cik;
    @FXML
    private Button buttongg;
    
    
    @FXML
    private void go(ActionEvent event) {
        loadwindow("/papapax/papapa.fxml","Add new");
        

    }

    @FXML
    private void çık(ActionEvent event) {
     Stage stage = (Stage)anchorm.getScene().getWindow();
     stage.close();
    }


    @FXML
    private void götür(ActionEvent event) {
           
          loadwindow("/birinci/pagea.fxml","Add new");

    } 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    void loadwindow(String loc,String title){
        try {
            Parent root=FXMLLoader.load(getClass().getResource(loc));
              Stage stage=new Stage(StageStyle.DECORATED);
              stage.setTitle(title);
              stage.setScene(new Scene(root));
              stage.show();
              
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
   
     
    
}

    @FXML
    private void gör(ActionEvent event) {
       labelb.setText("GÖSTERİLİYORRRR");
    }

 
  

        
    
    
}
