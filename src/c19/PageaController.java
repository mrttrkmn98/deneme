/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c19;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dell
 */
public class PageaController implements Initializable {

    @FXML
    private AnchorPane panett;
    @FXML
    private Button s;
    @FXML
    private TableView<?> table1;
    @FXML
    private TableColumn<?, ?> country;
    @FXML
    private TableColumn<?, ?> totalc;
    @FXML
    private TableColumn<?, ?> newc;
    @FXML
    private TableColumn<?, ?> totald;
    @FXML
    private TableColumn<?, ?> newd;
    @FXML
    private TableColumn<?, ?> population;
    @FXML
    private TableColumn<?, ?> mortality;
    @FXML
    private TableColumn<?, ?> rate;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void kapat(ActionEvent event) {
         Node source= (Node) event.getSource();
        Stage stage = (Stage)source.getScene().getWindow();
        stage.close();
    }
    
}
