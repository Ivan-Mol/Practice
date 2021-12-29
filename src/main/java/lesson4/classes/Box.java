package lesson4.classes;

import java.util.ArrayList;

public class Box<A extends Fruit> {
    private double boxWeight;
    private ArrayList<A> fruitList;

    public Box() {
        boxWeight = 0.0;
        fruitList = new ArrayList<>();
    }

    public void addFruit(A fruit) {
        fruitList.add(fruit);
        boxWeight = boxWeight + fruit.getWeight();
    }

    public Double getWeight() {
        return boxWeight;
    }

    public boolean compare(Box<?> box) {
        return this.boxWeight == box.getWeight();
    }

    public void putToAnotherBox(Box<A> box) {
        if (this.fruitList.isEmpty()) {
            System.out.println("Из пустой сыплешь?");
        } else {
            box.fruitList.addAll(fruitList);
            box.boxWeight = box.boxWeight + this.boxWeight;
            fruitList.clear();
            this.boxWeight = 0.0;
        }
    }

    @Override
    public String toString() {
        if (fruitList.isEmpty()) {
            return "Эта коробка пуста";
        } else {
            return "Коробка с " + (fruitList.size()) + " фруктами ("
                    + fruitList.get(0).toString() + ") и весом " + boxWeight + " кг";
        }

    }
}
