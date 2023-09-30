public class Card {
    
    private static final String[] SUITS = {"C", "S", "D", "H"};
    private static final String[] CARDFACES = {null,"ACE","2", "3", "4", "5" , "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};
    private int faceValue; // 1,2,3,4,5,6,7,8,9,10,11,12,13
    private int suit;      // 1,2,3,4 {"Clubs", "Spades", "Diamonds", "Hearts"}
    



    public Card(int faceValue, int suit){
        this.faceValue = faceValue + 1; // there is no face value of zero
        this.suit = suit;
        
    }

    public int getSuit(){
        return this.suit;
    }

    public int getFaceValue(){
        return this.faceValue;
    }

    

    public String toString(){
        return CARDFACES[this.faceValue] +  SUITS[this.suit];
    }
    
    public String toCardFace(int index){
        int i = index;
        String [] suites = {"A", "B", "C", "D"}; //these are hexadecimal values don't change
        String [] numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};// these are also hexadecimal DON'T CHANGE
        if(i >= 12 && i < 24 ){
            i = i + 1;
        }else if(i >= 24 && i < 36){
            i += 2;
        }else if(i >= 36 && i < 48){
            i += 3;
        }else if(i >= 48){
            i += 4;
        }
        String card = suites[i/14] + numbers[i%14];
        int c = Integer.parseInt("DC" + card, 16);
        String s = "\uD83C" + (char) c;
        return s;
    }
}
