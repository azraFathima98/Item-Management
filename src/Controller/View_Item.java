package Controller;

import DB_Connection.DbConnection;
import Model.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class View_Item {

    public TableView tlbItem;
    public TableColumn tlbID;
    public TableColumn tlbName;
    public TableColumn tlbQty;
    public TableColumn tlbPrice;
    public TableColumn tlbDescription;

    public void btnASctionReload(ActionEvent actionEvent) {
        ObservableList<Item> ItemObservableList = FXCollections.observableArrayList();
        tlbID.setCellValueFactory(new PropertyValueFactory<>("id"));
        tlbName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tlbQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        tlbPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        tlbDescription.setCellValueFactory(new PropertyValueFactory<>("description"));

        DbConnection.getInstance().getConnection().forEach(obj->{
            ItemObservableList.add(obj);
        });

        tlbItem.setItems(ItemObservableList);
    }
}
