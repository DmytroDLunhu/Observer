package observer;

import java.util.ArrayList;
import java.util.List;

public class FoodBank implements Observed {
    List<String> foods = new ArrayList<>();
    List<Observer> subscribesStores = new ArrayList<>();

    public void addFood(String food) {
        this.foods.add(food);
        notifyObservers();

    }

    public void removeFood(String food) {
        this.foods.remove(food);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribesStores.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribesStores.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribesStores) {
            observer.handleEvent(this.foods);
        }
    }
}
