package dev.simon;

public class deckOfCards {
    public int Rank,Suits;

    public deckOfCards(){

    }

    public deckOfCards(int rank, int suit) {

    }


    public int getRank() {
        return Rank;
    }

    public void setRank(int rank) {
        this.Rank = Math.abs(rank);
    }

    public int getSuits() {
        return Suits;
    }

    public void setSuits(int suits) {
        this.Suits = Math.abs(suits);
    }
    //creates a mehod to get name of card
    String[] suits = {"s1","s2","s3","s4","s5","s6","s7","s8","s9","s10","s11","s12"};
    String[] ranks = {"r1","r2","r3","r4","r5","r6","r7","r8","r9","r10"};
    public String toString(int x, int y) {
        String s =  suits[x]+""+ranks[y];
        return s;
    }

    public void cards(){

    }

    public boolean equals(deckOfCards that) {
        return this.Rank == that.getRank()
                && this.Suits == that.getSuits();
    }
    public int compareTo(deckOfCards that) {
        if (this.Suits < that.getSuits()) {
            return -1;
        }
        if (this.Suits > that.getSuits()) {
            return 1;
        }
        if (this.Rank < that.getRank()) {
            return -1;
        }
        if (this.Rank > that.getRank()) {
            return 1;
        }
        return 0;
    }

}
