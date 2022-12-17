package entity;

import control.EntityViewer;

public class ItemDecorator extends Item {
    Item item;

    public ItemDecorator(Item umItem) {
       item = umItem;
    }
}
