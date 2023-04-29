package service;

import entity.Item;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import java.util.List;

public interface ItemService {

    Item saveItem(Item items);

    List<Item> fetchAllItem();

    Item getId(VarcharJdbcType id);

    Item updateId(VarcharJdbcType id, Item items);

    String deleteId(VarcharJdbcType id);

}
