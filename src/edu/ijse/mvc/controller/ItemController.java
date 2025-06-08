package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.ItemDto;
import edu.ijse.mvc.model.ItemModel;


public class ItemController {
    private ItemModel itemModel = new ItemModel();
    
    public String saveItem(ItemDto itemDto) throws Exception{
        return itemModel.saveItem(itemDto);
    }
}
