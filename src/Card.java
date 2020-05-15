import processing.core.PApplet;

public class Card {
    private Rank rank;
    private Suit suit;


    public Card(){
        //System.out.println("New Card");
    }

    public Card(String mySuit, String myRank){
        suit = new Suit(mySuit);
        rank = new Rank(myRank);
        System.out.println("Card: "+rank+" of "+suit);
    }

    public Card(String mySuit, int rankValue){
        suit = new Suit(mySuit);
        rank = new Rank(rankValue);
        System.out.println("Card: "+rank+" of "+suit);
    }

    //Accessor Method

    public Suit getSuit(){
        return suit;
    }
    public Rank getValue(){
        return rank;
    }


    //Mutator

    public void setSuit(Suit newSuit){
        suit = newSuit;
    }
    public void setValue(Rank newValue){
        rank = newValue;
    }

    public String toString(){
        return "Suit: " + suit + "Rank:" + rank;
    }


    public static void drawCard(PApplet screen, int x, int y, String suit, int value){
        final int WIDTH = 62;
        final int LENGTH = 88;

        screen.fill(255);
        screen.rect(x,y,WIDTH,LENGTH);

        screen.fill(0);
        screen.text(suit, x+11, y+44 );
        screen.text(value, x+21, y+64 );
    }
}
