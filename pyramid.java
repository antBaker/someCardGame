public class pyramid{
    public static void main(String[] args){
        int[] deck = new int[52];
        for(int i=0; i < 8; i++){
            for(int j = 7; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++){
                System.out.print(deck[k] + " ");
            }
            System.out.println();
        }
    }
}