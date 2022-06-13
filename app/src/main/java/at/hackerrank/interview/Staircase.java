package at.hackerrank.interview;

public class Staircase {
    public static String hashSymbol = "#";
    public static String space = " ";
    public static void staircase(int n){
        //Print stairs
        for(int i = 1; i <= n ; i++){
            printSpace(n-i);
            printHash(i);
            System.out.println();
        }
    }

    public static void printSpace(int n){
        for(int a = 0; a < n ; a++){
            System.out.print(space);
        }
    }
    public static void printHash(int n){
        for(int b = 0; b < n ; b++){
            System.out.print(hashSymbol);
        }
    }

    public static void main(String[] args) {
        staircase(6);
    }

}

