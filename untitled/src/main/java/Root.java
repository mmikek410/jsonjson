import java.util.List;

public class Root {
    private String  name;
    private List<Cards> cards;

public Root(String name, List<Cards> cards) {
    this.name =name;
    this.cards = cards;

}

    public String getName() {
        return name;
    }

    public List<Cards> getCards() {
        return cards;
    }

    public void setName(String name) {

    this.name = name;
    }

    public void setCards(List<Cards> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", cards=" + cards +
                '}';
    }
}
