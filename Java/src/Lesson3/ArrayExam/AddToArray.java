package Lesson3.ArrayExam;

public class AddToArray {
    /**
     *  Chèn phần tử vào cuối mảng
     *
     * @param arr - mảng nguồn
     * @param value - giá trị thêm vào
     * @return
     */
    public int[] add(int [] arr, int value){
        int [] arr2 = new int[arr.length+1];
        for(int i=0;i<arr.length ;i++){
            arr2[i] = arr[i];
        }
        arr2[arr.length] = value;
        return arr2;
    }
}
