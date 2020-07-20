package dev.simon;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("this programs handles on 3 types of suits with 2 ranks card");

        Scanner scanner=new Scanner(System.in);
        deckOfCards card=new deckOfCards(); //creates an object of class deckOfCards
        System.out.println("enter number of suits");
        //set the number of suit
        card.setSuits(scanner.nextInt());
        System.out.println("enter number of ranks");
        //set the number of ranks to 2
        card.setRank(scanner.nextInt());
        //print total number of cards
        System.out.println("total number of cards=" + (card.getSuits()*card.getRank()));
        //this stores all the cards using to string method
        String[] cards = new String[(card.getSuits()*card.getRank())];
        int index=0;
        for(int s=0;s<card.getSuits();s++){
            for(int r=0;r<card.getRank();r++){
                cards[index]=card.toString(s,r);
                index++;
            }
        }
        //printing all the cards
        for (int x=0;x<(card.getSuits()*card.getRank());x++){
            System.out.println(cards[x]);
        }

        int z=1;
        Random random = new Random();
        int [] cardC=new int[(card.getSuits()*card.getRank())];

        do{
            System.out.println("enter: 1 to shuffle, 2 to deal one hand 2 cards, 3 to shuffle and deal 100000 hands,4 to exit");
            z=scanner.nextInt();


            if(z==1) {
                int temp;
                temp = random.nextInt(index); //gets a random card
                System.out.println("after shuflle, top  card is " + cards[temp]);
            }
            else if(z==2) {
                System.out.println("how many cards");
                int m=scanner.nextInt();
                int []temp2=new int[m];
                for (int n=0;n<m;n++){
                    temp2[n]=random.nextInt(index);
                }
                //printing all the cards
                for (int x=0;x<m;x++){
                    System.out.println(cards[x]+"\t");

                }
            }
            else if(z==3) {
                //generating random 100000 cards and storing them to variables
                int hist;
                for (int n = 0; n < 100000; n++) {
                    hist = random.nextInt(index);
                        cardC[hist]++;
                }
                //prints all the cards after 100,000 shuffles
                //printing all the cards
                for (int x=0;x<cardC.length;x++){
                    System.out.println("cards " + cards[x] + "=" + cardC[x]);
                }

            }

        }
        while (z!=4);
    }
}
