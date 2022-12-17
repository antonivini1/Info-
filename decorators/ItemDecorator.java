package entity;

import control.EntityViewer;

public class ItemDecorator extends Item {
    Item item;

    public ItemDecorator(Item umItem) {
       item = umItem;
    }

    @Override
    public String getLocation(String location){
        return item.getLocation(location) + " " + state;
    }

    @Override
    public String getStatus(boolean hidden){
        return !hidden ? item.getStatus() : "hiddenStatus";
    }
}
