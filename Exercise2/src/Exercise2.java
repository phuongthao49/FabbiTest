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
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    
    //Hàm tính tổng lớn nhất của 2 phần tử trong mảng số nguyên
    //Author: LTPThAO
    static void maxSum(int[] array){
        int size = array.length;
        int sum = 0;
        int i;
        if(size < 2){
            sum = array[0];
        }else{
            for(i=size-1; i>=0; i--){
                sum = array[i] + array[i-1];
                break;
            }
        }
        System.out.println("The sum of the largest and second-largest number in the integer array is: "+ sum);
    }
    
    //Hàm sắp xếp mảng theo thuật toán sắp xếp nổi bọt (bubbleSort)
    //Author: LTPThao
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
    
    //Hàm hiển thị mảng
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
        int min = (int)- Math.pow(2, 30);
        int max = (int)Math.pow(2, 30) - 1;
        int size = check.inputInt("Enter number of array: ", 1, Integer.MAX_VALUE);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = check.inputInt("Input number i"+i+": ", min, max);
        }
        System.out.print("Unsorted array: ");
        display(arr);
        bubbleSort(arr);
        System.out.print("Sorted array: ");
        display(arr);
        maxSum(arr);
    }
    
}
