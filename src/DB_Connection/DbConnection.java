package DB_Connection;

import Model.Item;

import java.util.ArrayList;
import java.util.List;

public class DbConnection {
    private static DbConnection instance;

    private final List<Item> ItemList ;


    private DbConnection() {
        ItemList = new ArrayList<>();
    }

    public List<Item> getConnection(){
        return ItemList;
    }
    public static DbConnection getInstance(){
        return instance==null?instance=new DbConnection():instance;
    }
}
