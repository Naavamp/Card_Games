public class Card
{
    private String suit;
    private int rank;
    private boolean revealed;

    public Card(String suit, int rank)
    {
        this.suit = suit;
        this.rank = rank;
        this.revealed = false;
    }
    public  String getSuit() {
        return suit;
    }
    public int getRank() {
        return rank;
    }

    public void revealCard() {
        revealed = true;
    }

    public void hideCard() {
        revealed = false;
    }
    public String toString() {
        if (!revealed) {
            return "Hidden Card";
        }

        String rankName;

        switch (rank) {
            case 1:
                rankName = "Ace";
                break;
            case 11:
                rankName = "Jack";
                break;
            case 12:
                rankName = "Queen";
                break;
            case 13:
                rankName = "King";
                break;
            case 14:
                rankName = "Ace";
                break;
            default:
                rankName = String.valueOf(rank);
        }

        return rankName + " of " + suit;
    }
}
