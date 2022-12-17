package control.decorators;

import entity.Item;

public abstract class ItemDecorator extends Item {
    Item item;
    Boolean hidden;

    public ItemDecorator(Item umItem) {
        super(umItem);
        // item = umItem;
    }

    @Override
    public String getLocation() {
        return item.getLocation() + " " + location;
    }

    @Override
    public String getStatus() {
        return !hidden ? item.getStatus() : "hiddenStatus";
    }
}
