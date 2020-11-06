/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phuong Thao
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    //Hàm tổ chức lại mảng 3n
    static void ReorganizeArr(int[]  array1, int[] array2, int[] array3) {
        int size = array1.length;
        int n = 3*size;
        for(int i=0; i<n; i++){
            System.out.print("[");
            for(int x=0; x<size; x++){
                for(int y=0; y<size; y++){
                    for(int z=0; z<size; z++){
                        if(x == y && x == z && y == z){
                            if(z<size-1)
                                System.out.print(array1[x]+ ", " + array2[y]+ ", " + array3[z] + ", ");
                            else
                                System.out.print(array1[x]+ ", " + array2[y]+ ", " + array3[z]);
                                
                        }else{
                            continue;
                        }
                      }
                  }
            }
            System.out.print("]");
            break;
        }
    }
    
    //Hàm hiển thị các phần tử của mảng 
    static void display(int[]  array1, int[] array2, int[] array3) {
        int size = array1.length;
        System.out.print("[");
        for (int x = 0; x < size; x++) {
            System.out.print(array1[x] + ", ");
        }
        for (int y = 0; y < size; y++) {
            System.out.print(array2[y] + ", ");
        }
        for (int z = 0; z < size; z++) {
            if (z != size-1)
                System.out.print(array3[z] + ", ");
            else System.out.print(array3[z]);
        }
        System.out.println("]");   
    }
    public static void main(String[] args) {
        Validation check = new Validation();
        int size = check.inputInt("Enter number of array: ", 1, Integer.MAX_VALUE);
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int[] arr3 = new int[size];
        for(int x = 0; x < size; x++){
            arr1[x] = check.inputInt("Input number x"+x+": ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        for(int y = 0; y < size; y++){
            arr2[y] = check.inputInt("Input number y"+y+": ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        for(int z = 0; z < size; z++){
            arr3[z] = check.inputInt("Input number z"+z+": ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        System.out.print("The initial array [x1, x2, ..., xn, y1, y2, ..., yn, z1, z2, ..., zn]: ");
        display(arr1, arr2, arr3);
        System.out.print("Reorganized array [x1, y1, z1, x2, y2, z2, ..., xn, yn, zn]: ");
        ReorganizeArr(arr1, arr2, arr3);
        System.out.print("\n");
    }
    
}
