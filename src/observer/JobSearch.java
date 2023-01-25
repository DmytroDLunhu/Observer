package observer;

public class JobSearch {
    public static void main(String[] args) {
        FoodBank foodBank = new FoodBank();

        foodBank.addFood("Milk");
        foodBank.addFood("Pasta");

        Observer firstSubscriber = new SubscriberStore("Walmart");
        Observer secondSubscriber = new SubscriberStore("Amazon");

        foodBank.addObserver(firstSubscriber);
        foodBank.addObserver(secondSubscriber);
//        foodBank.removeObserver(secondSubscriber);

        foodBank.addFood("Bread");
//        foodBank.removeFood("Bread");

    }
}
