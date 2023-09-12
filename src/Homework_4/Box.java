package Homework_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruct> {
    private ArrayList<T> fructs;

    public Box(T... fructs) {
        this.fructs = new ArrayList<T>(Arrays.asList(fructs));
    }

    public void addFruct(T... fructs) {
        this.fructs.addAll(Arrays.asList(fructs));
    }

    public void clearBox() {
        fructs.clear();
    }

    public float getWeight() {
        if (fructs.isEmpty()) return 0;
        float weight = 0;
        for (T item: fructs) weight += item.getWeight();
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void transfer(Box<? super T> box) {
        box.fructs.addAll(this.fructs);
        clearBox();
    }
}
