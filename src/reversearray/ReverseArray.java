/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversearray;

/**
 *
 * @author AhmedTawfik
 */
public class ReverseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] numbers = {4, 8, 9, 7, 3, 2, 1};

        int[] reversedArray = reverse(numbers);

        for (int item : reversedArray) {
            System.out.print("\t" + item);
        }
    }

    public static int[] reverse(int[] numbers) {
        int temp;

        for (int i = 0; i < numbers.length / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        return numbers;
    }

}
