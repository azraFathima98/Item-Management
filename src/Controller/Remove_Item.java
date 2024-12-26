package Controller;

import DB_Connection.DbConnection;
import Model.Item;
import javafx.collections.ObservableArray;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Remove_Item {
    public Item item;
    public TextField txtId;
    public TextField txtName;
    public TextField txtQty;
    public TextField txtPrice;
    public TextField txtDescription;

    public void btnActionRemove(ActionEvent actionEvent) {
        String id = txtId.getText();

        if (id == null || id.trim().isEmpty()) {
            return;
        }


//            txtName.setText(item.getName());
//            txtQty.setText(""+item.getQty());
//            txtPrice.setText(""+item.getPrice());
//            txtDescription.setText(item.getDescription());

        DbConnection dbConnection = DbConnection.getInstance();
        boolean itemRemoved = dbConnection.getConnection().removeIf(item ->
                item.getId().equals(id)
        );

        if (itemRemoved) {
            JOptionPane.showMessageDialog(null,"Deleted");
        } else {
            JOptionPane.showMessageDialog(null,"Not Deleted");
        }

        txtId.clear();
        txtName.clear();
        txtDescription.clear();
        txtQty.clear();
        txtPrice.clear();
    }

}
