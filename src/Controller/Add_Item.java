package Controller;

import DB_Connection.DbConnection;
import Model.Item;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Add_Item {

    public TextField txtId;
    public TextField txtName;
    public TextField txtQty;
    public TextField txtPrice;
    public TextField txtDescription;
    public Button btnAdd;
    public Button btnRemove;

    public void btnAction(ActionEvent actionEvent) {
        String id = txtId.getText();
        String name = txtName.getText();
        int qty = Integer.parseInt(txtQty.getText());
        Double price = Double.parseDouble(txtPrice.getText());
        String description = txtDescription.getText();

        System.out.println( new Item(id,name,qty,price,description));
        DbConnection.getInstance().getConnection().add(new Item(id,name,qty,price,description));

        txtId.clear();
        txtQty.clear();
        txtName.clear();
        txtPrice.clear();
        txtDescription.clear();
    }

    public void btnActionRemove(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/remove.fxml"))));
        stage.show();
    }
}
