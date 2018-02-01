import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
//        tigger.eat("meat");
//        tigger.eat("kibble");
        Bear pooh = new Bear("Pooh");
//        pooh.eat("fish");
//        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
//        rarity.eat("marshmallows");
//        rarity.eat("kibble");
        Bee stinger = new Bee("Stinger");
//        stinger.eat("fish");
//        stinger.eat("pollen");
        Giraffe gemma = new Giraffe("Gemma");
//        gemma.eat("leaves");
//        gemma.eat("meat");

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(tigger);
        animals.add(pooh);
        animals.add(gemma);
        animals.add(stinger);
        animals.add(rarity);

        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals,"meat");
    }
}
