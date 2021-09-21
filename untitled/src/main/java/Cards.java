import java.security.PrivateKey;

public class Cards {
    private String name;
    private long card;


    public Cards(String name, long card) {
        this.name = name;
        this.card = card;

    }

    public String getName() {
        return name;
    }

    public long getAge() {
        return card;
    }



    @Override
    public String toString() {
        return "cards{" +
                "name='" + name + '\'' +
                ", age=" + card +
                '}';
    }
}
