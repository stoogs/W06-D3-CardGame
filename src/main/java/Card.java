public class Card {
    private SuitType suit;    // mostly private
    private NumberType number;

    public Card (SuitType suit,NumberType number){
    this.suit = suit;
    this.number = number;
    }
    public SuitType getSuit(){
        return this.suit;
    }
    public NumberType getNumber(){
        return this.number;
    }
} //class
