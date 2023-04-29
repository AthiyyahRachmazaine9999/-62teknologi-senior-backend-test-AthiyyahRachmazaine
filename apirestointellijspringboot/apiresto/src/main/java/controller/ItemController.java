package controller;

import entity.Item;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ItemService;

import java.util.List;

public class ItemController {


    @Autowired
    private ItemService itemsService;

    @PostMapping("/items")
    public Item saveItem(@RequestBody Item items) {
        return itemsService.saveItem(items);
    }

    @GetMapping("/items")
    public List<Item> getAllItem() {
        return itemsService.fetchAllItem();
    }

    @GetMapping("/items/{id}")
    public Item getId(@PathVariable("id") VarcharJdbcType id) {
        return itemsService.getId(id);
    }

    @PutMapping("/items/{id}")
    public Item updateItem(@PathVariable("id") VarcharJdbcType id, @RequestBody Item items) {
        return itemsService.updateId(id, items);
    }

    @DeleteMapping("/items/{id}")
    public String deleteItem(@PathVariable("id") VarcharJdbcType id) {
        return itemsService.deleteId(id);
    }


}
