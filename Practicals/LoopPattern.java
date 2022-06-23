//print the following pattern using a for loop 
//1  5
//2  4
//3  3
//4  2
//5  1

public class LoopPattern 
{
    public static void main(String[] args) {
        for (int i = 1, j = 5; i < 10 && j > 0; i++, j--) {
            System.out.println( i +  "  " + j );
        }
    }
}