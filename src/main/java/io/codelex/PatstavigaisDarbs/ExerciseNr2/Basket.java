package io.codelex.PatstavigaisDarbs.ExerciseNr2;

public class Basket<T> {
    private static final int MAX_ITEMS = 10;
    private int currentItems;
    private T item;

    public Basket() {
        this.currentItems = 0;
    }

    public void addToBasket(T item) {
        if (currentItems == MAX_ITEMS) {
            throw new BasketFullException("Basket is full. Cannot add more items.");
        }
        this.item = item;
        currentItems++;
    }

    public void removeFromBasket() {
        if (currentItems == 0) {
            throw new BasketEmptyException("Basket is empty. Cannot remove any items.");
        }
        this.item = null;
        currentItems--;
    }

    public int getCurrentItems() {
        return currentItems;
    }

    public T getItem() {
        return item;
    }


}
