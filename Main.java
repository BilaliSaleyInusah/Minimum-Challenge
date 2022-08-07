import java.util.Scanner;

public class Main{

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("How many number do you want to enter : ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] myArray = readInteger(count);
        int minNum = findMin(myArray);
        System.out.println("***************************"); 
        System.out.println("Your minimum number is : " + minNum);
        System.out.println("***************************"); 
        
    }
    public static int[] readInteger(int count){
        int [] myArray = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter #" + (i + 1) + " : ");
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }
    public static int findMin(int[] array){
        int minNum = array[0];

        for (int i = 0; i < array.length; i++) {
            if (minNum > array[i]) {
                minNum = array[i];
            }
        }
        return minNum;
    }


}