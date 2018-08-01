public class Card {
    private SuitType suit;    // mostly private
    private NumberType number;

    /**
     *
     * @param suit HEART,DIAMOND,SPADE,CLUB
     * @param number 1-10,J,Q,K,A
     */
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
