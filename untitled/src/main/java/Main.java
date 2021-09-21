import org.json.simple.parser.JSONParser;

public class Main {

    public static void main(String[] args) {

        //JsonSimpleParser parser = new JsonSimpleParser();

        GsonParser parser = new GsonParser();
        Root root = parser.parse();

        //System.out.println("Root" + root.toString());
       System.out.println("Root" + root.toString());




    }
}
