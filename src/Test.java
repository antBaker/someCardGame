import java.util.Scanner;

import javax.swing.JOptionPane;
public class Test {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        //deck.printCards();

        System.out.println("\tWELCOME TO PYRAMID SOLITAIRE\t");

            System.out.println("(s)tart game \n" +  
                                "(q)uit" );
        
            System.out.println();
            

            switch(in.next().toLowerCase()){
                case("q"): in.close();return;
                case("s"):
                    
                        Deck deck = new Deck();
                        PyramidSolitaire p = new PyramidSolitaire(deck, 7);
                        p.setGame();

                        while(true){
                        try{
                        System.out.println(p.printPyramid());
                        System.out.println(p.printDrawPile());
                        System.out.println("SCORE : " + p.getScore()+ "\n");
                        if(p.gameOver()){
                            JOptionPane.showMessageDialog(null, "YOU WIN");
                        }
                        System.out.println("\tWhat type would you like to match?\t");
                        System.out.println("(k)ing, \n(1)for one card in pyramid and one in Draw Pile \n(2)for two cards both in pyramid\n(3)To draw card from the draw pile");

                        switch(in.next().toLowerCase()){
                            case("k"):
                            System.out.println("(d) for discard pile king and (n) for normal");
                            switch(in.next().toLowerCase()){
                                case("d"):
                                p.matchKingDiscard();
                                break;
                                case("n"):
                                System.out.println("Please give index in brackets and then give row");
                                p.matchKing(in.nextInt(), in.nextInt());
                                break;
                                //System.out.println(p.printPyramid());
                            }
                            break;

                            case("1"):
                            System.out.println("Please give index(s) in brackets and then give row (in that order)" );
                                p.matchFromDraw(in.nextInt(), in.nextInt());
                                //System.out.println(p.printPyramid());
                            break;

                            case("2"):
                            System.out.println("Please give index(s) then row (twice)");
                                p.matchCard(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
                                System.out.println();
                            break;
                            case("3"):
                                p.drawFromPile();
                                System.out.println();
                            break;
                            default:
                            System.out.println("Sorry unexpected input please input either (k), (1), (2), (3), (q) to quit");
                            break;
                            
                            case("q"):
                            System.exit(1);
                        }
                    }catch(Exception e){
                        System.err.println(e.getMessage());
                    }
                }

                default:
                    break;
        }
        in.close();
/*      p.setGame(deck, 0);
        p.setGame(deck, 1);
        p.setGame(deck,2);
        p.setGame(deck, 3);
        p.setGame(deck, 4);
        p.setGame(deck,5);
        p.setGame(deck, 6);
        p.setGame(deck,7);
        p.setGame(deck, 8);
        p.setGame(deck, 9);
*/
        //p.setGame(deck, 10);      //will fall off can't ask for more cards than in deck
    }
}
