import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phuong Thao
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    //Hàm tính khoảng cách nhỏ nhất giữa 2 phần tử trong mảng
    static void distanceMin(int[] array){
        int size = array.length;
        int min = array[1] - array[0];
        for(int i=0; i<size; i++){
            for (int j = i+1; j < size; j++) {
                int k = array[j] - array[i];
                if(min > k && k >= 0)
                    min = k;
            }
        }
        System.out.print("The minimum distance between 2 elements in an array: " + min + "\n");
        for(int i=0; i<size; i++){
            for (int j = i+1; j < size; j++) {
                int k = array[j] - array[i];
                if(k == min)
                    System.out.print("["+ array[i] + "," + array[j] + "]");
            }
        }
        
    }
    
    //Hàm sắp xếp các phần tử trong mảng theo thuật toán sắp xếp nổi bọt
    static void bubbleSort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j < size; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    
    //Hàm hiển thị các phần tử trong mảng
    static void display(int[] array) {
        int size = array.length;
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            if (i != size-1)
                System.out.print(array[i] + ", ");
            else System.out.print(array[i]);
        }
        System.out.println("]");   
    }
    
    public static void main(String[] args) {
        Validation check = new Validation();
        Scanner scanner = new Scanner(System.in);
        int size = check.inputInt("Enter number of array: ", 1, 10000);
        int[] arr = new int[size];
        System.out.println("Input number: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Unsorted array: ");
        display(arr);
        bubbleSort(arr);
        System.out.print("Sorted array: ");
        display(arr);
        distanceMin(arr);
        System.out.println("\n");
    }
    
}
