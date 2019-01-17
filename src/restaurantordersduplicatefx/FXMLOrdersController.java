/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantordersduplicatefx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author blj0011
 */
public class FXMLOrdersController implements Initializable
{

    @FXML
    TableView<TableInfo> tvDisplay;
    @FXML
    TableColumn<TableInfo, String> tcPre, tcOne, tcTwo, tcThree, tcFour, tcFive;
    @FXML
    TextField tfSearchBar;
    @FXML
    Label lblDigitOne, lblDigitTwo, lblDigitThree, lblDigitFour;
    @FXML
    Label lblDescriptionOne, lblDescriptionTwo, lblDescriptionThree, lblDescriptionFour;
    @FXML
    VBox vbRoot;

    ObservableList<TableInfo> tableData = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
        setupTableView();

        for (int i = 0; i < 25; i++) {
            tableData.add(new TableInfo("images/icons8_GPS_Antenna_64px_1.png", "KeepToo", "JFK", "10/11/2018", "$200", "active"));
        }
    }

    public void setupTableView()
    {
        tcPre.prefWidthProperty().bind(tvDisplay.widthProperty().multiply(.04));
        tcOne.prefWidthProperty().bind(tvDisplay.widthProperty().multiply(0.19));
        tcTwo.prefWidthProperty().bind(tvDisplay.widthProperty().multiply(0.19));
        tcThree.prefWidthProperty().bind(tvDisplay.widthProperty().multiply(0.19));
        tcFour.prefWidthProperty().bind(tvDisplay.widthProperty().multiply(0.19));
        tcFive.prefWidthProperty().bind(tvDisplay.widthProperty().multiply(0.19));
        tcPre.setResizable(false);
        tcOne.setResizable(false);
        tcTwo.setResizable(false);
        tcThree.setResizable(false);
        tcFour.setResizable(false);
        tcFive.setResizable(false);

        tcPre.setCellValueFactory(new PropertyValueFactory("tcPre"));
        tcOne.setCellValueFactory(new PropertyValueFactory("tcOne"));
        tcTwo.setCellValueFactory(new PropertyValueFactory("tcTwo"));
        tcThree.setCellValueFactory(new PropertyValueFactory("tcThree"));
        tcFour.setCellValueFactory(new PropertyValueFactory("tcFour"));
        tcFive.setCellValueFactory(new PropertyValueFactory("tcFive"));

        tcPre.setCellFactory((param) -> {
            ImageView imageView = new ImageView();
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);

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

        tcFive.setCellFactory((param) -> {
            Button button = new Button("active");
            button.setId("btn-tableview-css");

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
                        button.setText(item);
                        setGraphic(button);

                        button.setOnAction((event) -> {
                            Button tempButton = (Button) event.getSource();
                            TableInfo tempTableInfo = (TableInfo) getTableRow().getItem();

                            if (tempButton.getText().equals("active")) {
                                tempTableInfo.setTcFive("inactive");
                            }
                            else {
                                tempTableInfo.setTcFive("active");
                            }
                        });
                    }
                }
            };
        });

        tvDisplay.setItems(tableData);
    }

    VBox getVBoxRoot()
    {
        return vbRoot;
    }
}
