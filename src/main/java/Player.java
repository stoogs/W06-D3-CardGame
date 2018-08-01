import java.util.ArrayList;

public class Player { // initializer
    private String name;
    private ArrayList<Card> hand;

public Player(String name){
    this.name = name;
    this.hand = new ArrayList<Card>();
}
 public void playerGetsCards(){
    //get card from dealer
 }
    public String getName(){
        return this.name;
    }

} //class
