package poker;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    List<Card> list ;

    public Person(String name, int max) {
        this.name = name;
        list = new ArrayList<>(max);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //接牌
    public void addCard(Card card){
        this.list.add(card);
    }

    @Override
    public String toString() {
        return name + ":" + list ;
    }
}
