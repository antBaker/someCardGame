public enum CardValue {
    
    Ace(1), Two(2), Three(3), Four(4), Five(5), Six(6),
    Seven(7), Eight(8), Nine(9), Ten(10), Jack(11), Queen(12), King(13);
    private final int value;
    
    CardValue(int value){
        this.value = value;
    }

    public int getCardValue(){
        return this.value;
    }

    public String toString() {
        if (this.value == 1) {
          return "A";
        }
        else if (this.value == 11) {
          return "J";
        }
        else if (this.value == 12) {
          return "Q";
        }
        else if (this.value == 13) {
          return "K";
        }
        else {
          return String.valueOf(this.value);
        }
    }
    
}
