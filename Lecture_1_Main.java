import java.util.Scanner;

public class Lecture_1_Main {
    public static void main (String [] args){
        System.out.println("Hello, I am jun hao");
        System.out.print("Input module code :");
        Scanner sc=new Scanner(System.in);
        String mod= sc.nextLine();

        switch (mod){
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;
            case "CSC1007":
                System.out.println("Operating Systems");
                break;
            case "CSC1008":
                System.out.println("Data Structures and algorithms");
                break;
            case "CSC1009":
                System.out.println("Objected Oriented Programming");
                break;
            case "CSC1010":
                System.out.println("Computer Networks");
                break;
        }

        for (int i=102;i>=66;i--){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}
