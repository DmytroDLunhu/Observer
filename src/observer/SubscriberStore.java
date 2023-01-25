package observer;

import java.util.List;

public class SubscriberStore implements Observer {
    String name;

    public SubscriberStore(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> foods) {
        System.out.println("Dear " + name + ", we nave some new products : \n" + foods + "\n------\n");
    }
}
