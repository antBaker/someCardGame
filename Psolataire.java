import java.util.Scanner;

public class Psolataire {
    
    public static void main(String[] args){

        Deck deck = new Deck();
        Scanner sc = new Scanner(System.in);
        int row, row2, col, col2;
        try{
            Pyramid pyramid = new Pyramid(deck);
            pyramid.printPyramid();
            //pyramid.match(7,7);
            while(true){
                System.out.println("Enter card(s) to match");
                System.out.println("Enter row");
                row = sc.nextInt();
                System.out.println("Enter coloumn");
                col = sc.nextInt();
                System.out.println("Enter row2");
                if(sc.hasNextInt()){
                    row2 = sc.nextInt();
                    System.out.println("Enter coloumn2");
                    col2 = sc.nextInt();
                    pyramid.match(row, col, row2, col2);
                }else{
                    pyramid.match(row, col);
                }
                sc.close();
                pyramid.printPyramid(); 
            }
            
            
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
