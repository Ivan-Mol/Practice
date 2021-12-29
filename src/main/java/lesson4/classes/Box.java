package lesson4.classes;

import java.util.ArrayList;

public class Box<A extends Fruit> {
   private Double boxWeight;
   private ArrayList<Fruit> fruitList;

   public Box(){
       boxWeight = 0.0;
       fruitList = new ArrayList<>();
   }

    public void addFruit(Fruit fruit){
        if (fruitList.isEmpty()){
            fruitList.add(fruit);
            boxWeight = boxWeight + fruit.getWeight();
        }
        else {
            if (fruitList.get(0).getClass()!=fruit.getClass()){
                System.out.println("Это ящик с другими фруктами");
            }
            if (fruitList.get(0).getClass()==fruit.getClass()){
                fruitList.add(fruit);
                boxWeight = boxWeight + fruit.getWeight();
            }
        }
    }

    public Double getWeight() {
        return boxWeight;
    }

    public boolean compare(Box box){
        if (this.boxWeight==box.getWeight()){
            return true;
        }
        else return false;
    }

    public void putToAnotherBox(Box box){
       if (this.fruitList.isEmpty()){
           System.out.println("Из пустой сыплешь?");
       }
       else {
           if (box.fruitList.isEmpty() || this.fruitList.get(0).getClass()==box.fruitList.get(0).getClass()){
               box.fruitList.addAll(fruitList);
               box.boxWeight = box.boxWeight+this.boxWeight;
               fruitList.clear();
               this.boxWeight = 0.0;
           }
           else{
               System.out.println("Это коробки с разными фруктами");
           }
       }
    }

    @Override
    public String toString() {
        if (fruitList.isEmpty()){
            return "Эта коробка пуста";
        }
        else {
            return "Коробка с " + (fruitList.size()) +" фруктами ("
                    +fruitList.get(0).toString() + ") и весом "+ boxWeight+" кг";
        }

    }
}
