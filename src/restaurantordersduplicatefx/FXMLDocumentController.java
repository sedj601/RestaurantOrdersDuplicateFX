/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantordersduplicatefx;

import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 *
 * @author blj0011
 */
public class FXMLDocumentController implements Initializable
{

    @FXML
    TableView<TableInfo> tvDisplay;
    @FXML
    TableColumn<TableInfo, String> tcPre, tcOne, tcTwo, tcThree, tcFour, tcFive;
    @FXML
    Button btnOverview, btnOrders, btnCustomers, btnMenus, btnPackages, btnSettings, btnSignOut;
    @FXML
    TextField tfSearchBar;
    @FXML
    Label lblDigitOne, lblDigitTwo, lblDigitThree, lblDigitFour;
    @FXML
    Label lblDescriptionOne, lblDescriptionTwo, lblDescriptionThree, lblDescriptionFour;
    @FXML
    ImageView ivDisplayImage;
    @FXML
    Label lblDisplayImageTitle;
    @FXML
    StackPane spChangeDisplay;

    ObservableList<TableInfo> tableData = FXCollections.observableArrayList();

    @FXML
    private void handleBtnOnActionOverview(ActionEvent event)
    {
        System.out.println("Load Overview FXML");
    }

    @FXML
    private void handleBtnOnActionOrders(ActionEvent event)
    {
        System.out.println("Load Orders FXML");
    }

    @FXML
    private void handleBtnOnActionCustomers(ActionEvent event)
    {
        System.out.println("Load Customers FXML");
    }

    @FXML
    private void handleBtnOnActionMenus(ActionEvent event)
    {
        System.out.println("Load Menus FXML");
    }

    @FXML
    private void handleBtnOnActionPackages(ActionEvent event)
    {
        System.out.println("Load Packages FXML");
    }

    @FXML
    private void handleBtnOnActionSettings(ActionEvent event)
    {
        System.out.println("Load Settings FXML");
    }

    @FXML
    private void handleBtnOnActionSignOut(ActionEvent event)
    {
        System.out.println("just Sign Out FXML");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        try {
            // TODO
            setupTableView();
            tableData.add(new TableInfo(getClass().getResource("/images/icons8_GPS_Antenna_64px_1.png").toURI().toString(), "KeepToo", "JFK", "10/11/2018", "$200", "active"));
        }
        catch (URISyntaxException ex) {
            ex.printStackTrace();
        }

    }

    public void setupTableView()
    {
        tcPre.prefWidthProperty().bind(tvDisplay.widthProperty().multiply(.16));
        tcOne.prefWidthProperty().bind(tvDisplay.widthProperty().multiply(0.16));
        tcTwo.prefWidthProperty().bind(tvDisplay.widthProperty().multiply(0.16));
        tcThree.prefWidthProperty().bind(tvDisplay.widthProperty().multiply(0.16));
        tcFour.prefWidthProperty().bind(tvDisplay.widthProperty().multiply(0.16));
        tcFive.prefWidthProperty().bind(tvDisplay.widthProperty().multiply(0.16));
        tcPre.setResizable(false);
        tcOne.setResizable(false);
        tcTwo.setResizable(false);
        tcThree.setResizable(false);
        tcFour.setResizable(false);
        tcFive.setResizable(false);

        tcOne.setCellValueFactory(new PropertyValueFactory("tcOne"));
        tcTwo.setCellValueFactory(new PropertyValueFactory("tcTwo"));
        tcThree.setCellValueFactory(new PropertyValueFactory("tcThree"));
        tcFour.setCellValueFactory(new PropertyValueFactory("tcFour"));
        tcFive.setCellValueFactory(new PropertyValueFactory("tcFive"));

        tcPre.setCellFactory((param) -> {
            ImageView imageView = new ImageView();

            return new TableCell<TableInfo, String>()
            {
                @Override
                protected void updateItem(String item, boolean empty)
                {
                    super.updateItem(item, empty);
                    if (item == null || empty) {
                        setText(null);
                        setGraphic(null);
                    }
                    else {
                        System.out.println("test");
                        System.out.println(item);
                        imageView.setImage(new Image(item));
                        setGraphic(imageView);
                    }
                }
            };
        });
//

        tvDisplay.setItems(tableData);

    }
}
