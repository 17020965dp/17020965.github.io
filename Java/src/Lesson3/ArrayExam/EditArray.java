package Lesson3.ArrayExam;

public class EditArray {

    /**
     * Sửa phần tử tại 1 vị trí của mảng
     *
     * @param arr - mảng nguồn
     * @param position - vị trí cần thay đổi
     * @param value - giá trị thay đổi
     * @return
     */

    public int[] edit(int[]arr , int position , int value){

        for(int i = 0;i<arr.length;i++){

            if( i  == position -1  ){
                arr[i] = value;
            }
        }

        return arr;
    }
}
