package com.auyanik.service;

import com.auyanik.exception.ItemNotFound;
import com.auyanik.model.Item;

import java.util.List;

public interface ItemService {
    public Item create(Item item);
    public Item delete(int id) throws ItemNotFound;
    public List findAll();
    public Item update(Item item);
    public Item findById(int id);
}
