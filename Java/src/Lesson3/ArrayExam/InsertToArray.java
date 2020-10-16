package Lesson3.ArrayExam;

public class InsertToArray {
    /**
     * Chèn phần tử vào mảng với vị trí xác định
     * @param arr - mảng nguồn
     * @param position - vị trí chèn
     * @param value - giá trị chèn
     * @return
     */
    public int [] insert(int[] arr, int position,int value){
        int[] arr2 = new int[arr.length+1];
        for(int i=0,j=0;i<arr.length;i++,j++){
            if(j==position){
                arr2[j] = value;
                i--;
                continue;
            }
            arr2[j] = arr[i];
        }
        return arr2;
    }
}
