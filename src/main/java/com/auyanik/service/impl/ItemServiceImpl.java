package com.auyanik.service.impl;

import com.auyanik.data.ItemRepository;
import com.auyanik.exception.ItemNotFound;
import com.auyanik.model.Item;
import com.auyanik.service.ItemService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    private ItemRepository itemRepository;

    @Override
    public Item create(Item item) {
        return itemRepository.save(item);
    }

    @Override
    @Transactional(rollbackFor = ItemNotFound.class)
    public Item delete(int id) throws ItemNotFound {
        Item deletedItem = itemRepository.findOne(id);
        if(deletedItem==null)
            throw new ItemNotFound();
        itemRepository.delete(deletedItem);
        return deletedItem;
    }

    @Override
    public List findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Item update(Item item) {
        return null;
    }

    @Override
    public Item findById(int id) {
        return null;
    }
}
