/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantordersduplicatefx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 *
 * @author blj0011
 */
public class FXMLDocumentController implements Initializable
{

    @FXML
    Button btnOverview, btnOrders, btnCustomers, btnMenus, btnPackages, btnSettings, btnSignOut;
    @FXML
    ImageView ivDisplayImage;
    @FXML
    Label lblDisplayImageTitle;
    @FXML
    StackPane spSubScene;

    @FXML
    private void handleBtnOnActionOverview(ActionEvent event)
    {
        try {
            System.out.println("Loading Overview FXML");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLOverView.fxml"));
            loader.load();
            FXMLOverViewController fXMLOverViewController = loader.getController();
            spSubScene.getChildren().set(0, fXMLOverViewController.getVBoxRoot());
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void handleBtnOnActionOrders(ActionEvent event)
    {
        try {
            System.out.println("Loading Orders FXML");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLOrders.fxml"));
            loader.load();
            FXMLOrdersController fXMLOrdersController = loader.getController();
            spSubScene.getChildren().set(0, fXMLOrdersController.getVBoxRoot());
        }
        catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

    @FXML
    private void handleBtnOnActionCustomers(ActionEvent event)
    {
        try {
            System.out.println("Loading Customers FXML");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLCustomers.fxml"));
            loader.load();
            FXMLCustomersController fXMLCustomersController = loader.getController();
            spSubScene.getChildren().set(0, fXMLCustomersController.getVBoxRoot());
        }
        catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

    @FXML
    private void handleBtnOnActionMenus(ActionEvent event)
    {
        System.out.println("Load Menus FXML");
        System.out.println("You have to implement this!");
    }

    @FXML
    private void handleBtnOnActionPackages(ActionEvent event)
    {
        System.out.println("Load Packages FXML");
        System.out.println("You have to implement this!");
    }

    @FXML
    private void handleBtnOnActionSettings(ActionEvent event)
    {
        System.out.println("Load Settings FXML");
        System.out.println("You have to implement this!");
    }

    @FXML
    private void handleBtnOnActionSignOut(ActionEvent event)
    {
        System.out.println("just Sign Out FXML");
        System.out.println("You might want to use an Alert that ask if they are sure they want to sign out.");
        Platform.exit();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {

        // TODO
    }

    public void setSubSceneNode(Parent parent)
    {
        spSubScene.getChildren().add(parent);
    }
}
