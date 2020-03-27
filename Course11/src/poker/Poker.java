package poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Poker {
    static int max = 5;
    public static void main(String[] args) {
        //生成一副扑克牌,不带大小王，大小王如果需要单独处理就可以了
        List<Card> poker = getPoker();
        //加上大小王
//        poker.add(new Card("JQKER","small"));
//        poker.add(new Card("JQKER","big"));
        brush(poker);//洗牌
//        System.out.println(poker);
        //new 6个人出来
        List<Person> players = new ArrayList<>();
        players.add(new Person("燕钰凯",max));
        players.add(new Person("杨金杭",max));
        players.add(new Person("胡玉琛",max));
        players.add(new Person("陈东瑞",max));
        players.add(new Person("何一鸣",max));
        players.add(new Person("蔡自桂",max));

        //发牌，每人三张牌
        for (int i = 0; i < max ; i++) {
            for (int j = 0; j < players.size(); j++) {
                players.get(j).addCard(poker.remove(0));
            }
        }
        //看一看大家的手牌
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i));
        }
    }
    public static List<Card> getPoker(){
        List<Card> cards = new ArrayList<>();
        List<String> colors = new ArrayList<>();//四种花色
        colors.add("♥");
        colors.add("♠");
        colors.add("♣");
        colors.add("♦");
        for (int i = 0; i < colors.size(); i++) {//2-9
            for (int j = 2; j <= 10; j++) {
                Card card = new Card(j + "",colors.get(i));
                cards.add(card);
            }
            //JQKA单独处理
            cards.add(new Card("A",colors.get(i)));
            cards.add(new Card("J",colors.get(i)));
            cards.add(new Card("Q",colors.get(i)));
            cards.add(new Card("K",colors.get(i)));
        }
        return cards;
    }
    //洗牌的方法
    public static void brush(List<Card> list){
        for (int i = 0; i < 100; i++) {//洗一百次
            int j = (int) (Math.random() * (list.size()));
            int k = (int) (Math.random() * (list.size()));
            //要保证j和k不相等，不能自己和自己交换,虽然没有什么大碍，但是还是尽量不要
            if (k != j) {
                Card card = list.get(k);
                Card card1 = list.get(j);
                list.set(j,card);
                list.set(k,card1);
            }
        }
    }
}
