/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantordersduplicatefx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author blj0011
 */
public class RestaurantOrdersDuplicateFX extends Application
{

    @Override
    public void start(Stage stage) throws Exception
    {
        FXMLLoader rootLoader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        rootLoader.load();
        FXMLDocumentController fXMLDocumentController = rootLoader.getController();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLOrders.fxml"));
        loader.load();
        FXMLOrdersController fXMLOrdersController = loader.getController();

        fXMLDocumentController.setSubSceneNode(fXMLOrdersController.getVBoxRoot());

        Scene scene = new Scene(rootLoader.getRoot());

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }

}
