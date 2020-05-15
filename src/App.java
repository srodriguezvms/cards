import processing.core.PApplet;

public class App extends PApplet
{
    public static void main(String[] args)
    {
        PApplet.main("App");

    }

    public void settings()
    {

        // 4 suits: Spades, Hearts, Diamonds, and Clubs
        // 13 values: Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King

        size(800,600);
        int var = 6;
        Card card0 = new Card("Spades", "Ace");
        Card card1 = new Card("Diamonds",7);

        /*card0.setName("Ace");
        card0.setSuit("Spades");
        card0.setValue(1);*/

        /*Deck deck0 = new Deck();
        deck0.addCard(card0);
        deck0.addCard(card1);

        Card dealCard = deck0.dealCard();

        System.out.println(dealCard.getSuit());
        System.out.println(dealCard.getValue());

        dealCard = deck0.dealCard();

        System.out.println(dealCard.getSuit());
        System.out.println(dealCard.getValue());

        dealCard = deck0.dealCard();

        System.out.println(dealCard.getSuit());
        System.out.println(dealCard.getValue());

        deck0.addCard(card0);
        deck0.addCard(card1);
        deck0.addCard(card0);
        deck0.addCard(card1);

        deck0.shuffleDeck();*/

        Deck deck = new Deck();








    }

    public void draw(){
        //Card card0 = new Card("Queen", "Diamonds");
        //Card card1 = new Card("Queen","Diamonds",6);
        //Card.drawCard(this,100,100, "Ace", "Spades", 0);
        //Card.drawCard(this,200,100, card0.getName(), card0.getSuit(),card0.getValue());
        //Card.drawCard(this,300,100, card1.getName(), card1.getSuit(),card1.getValue());

    }

}