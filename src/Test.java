import java.util.Scanner;
public class Test {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        //deck.printCards();

        System.out.println("\tWELCOME TO PYRAMID SOLITAIRE\t");

            System.out.println("(s)tart game \n" +  
                                "(q)uit" );
        
            System.out.println();
            

            switch(in.next().toLowerCase()){
                case("q"):
                
                return;
                case("s"):
                    try{
                        Deck deck = new Deck();
                        PyramidSolitaire p = new PyramidSolitaire(deck, 7);
                        p.setGame();

                        while(true){
                        
                        System.out.println("\tWhich cards would you like to match?\t");
                        System.out.println("(k)ing, (1)for one card in pyramid and one in Draw Pile (2)for cards int pyramid");

                        switch(in.next().toLowerCase()){
                            case("k"):
                            System.out.println("Please give index in brackets");
                                p.matchKing(in.nextInt());
                                System.out.println(p.printPyramid());
                            break;

                            case("1"):
                            System.out.println("Please give index(s) in brackets");
                                p.matchFromDraw(in.nextInt(), in.nextInt());
                                System.out.println(p.printPyramid());
                            break;

                            case("2"):
                            System.out.println("Please give index(s) in brackets");
                                p.matchCard(in.nextInt(), in.nextInt());
                                System.out.println(p.printPyramid());
                            break;
                            
                            case("q"):
                            System.exit(1);
                        }
                        }
                    }catch(Exception e){
                        System.err.println(e.getMessage());
                        break;
                    }
                
                default:
                    break;
        }
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
