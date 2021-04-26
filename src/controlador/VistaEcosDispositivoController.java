/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author EQUIPO
 */
public class VistaEcosDispositivoController implements Initializable {

    @FXML
    private PasswordField txtContraseña;
    @FXML
    private AnchorPane txtusuario;
    @FXML
    private Label txtIngreseNom;
    @FXML
    private Label txtIngreseContraseña;
    @FXML
    private Button botonIngresar;
    @FXML
    private TextField txtUsuario;
    
   /* 
    @FXML
    private void eventKey(KeyEvent event){
        Object evt = event.getSource();
        
        if(evt.equals(txtUsuario)){
            
            
          // if(event.getCharacter().equal("")){
               event.consume();
         //  }
            
       }else if(evt.equals(txtContraseña)){
            
        }
     */   
   // }
    
    //@FXML
   // private void eventAction(ActionEvent event ){
        
  //  }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   /* 
void handleButtonAction(ActionEvent event){
        try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SegundaPantalla.fxml"));
        Parent rootl = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        
        stage.setTitle("MENU PRINCIPAL");
        stage.setScene(new Scene(rootl));
        stage.show();
        }catch(Exception e)
        {
            System.out.println("bienenidos");
        }
        
    }
*/
    @FXML
    private void click(ActionEvent event) {
    try{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/SegundaPantalla.fxml"));
        //Parent root = (Parent) fxmlLoader.load();
        Parent root = loader.load();
        Stage stage = new Stage();
        
        
        SegundaPantallaController controlador = loader.getController();
                
        stage.setTitle("MENU PRINCIPAL");
        stage.setScene(new Scene(root));
        stage.show();
        
        stage.setOnCloseRequest(e -> controlador.closeWindows());
       
        
        Stage myStage = (Stage) this.botonIngresar.getScene().getWindow();
        myStage.close();
        
     }catch(Exception e)
        {
            System.out.println("bienvenidos");
        }
           
           
    }

   // private static class controlador {
//
       // private static void closeWindows() {
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       // }

        //public controlador() {
        //}
    //}
    
    
}
