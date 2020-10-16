package Lesson3.ArrayExam;

public class DeleteArray {
    /**
     * Xóa phần tử cuối mảng
     * @param arr - mảng nguồn
     * @return
     */

    public int [] delete(int []arr){
        int[] arr2 = new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            arr2[i] = arr[i];
        }
        return arr2;
    }

    /**
     * Xóa phần tử vị trí chỉ định
     * @param arr - mảng nguồn
     * @param position - vị trí xóa
     * @return
     */

    int[] delete2(int[] arr, int position) {
        int[] arr2 = new int[arr.length-1];
        for(int i =0,j=0;i<arr.length-1;i++,j++){
            if(j== position){
                i--;
                continue;
            }
            arr2[i] = arr[j];
        }
        return arr2;
    }
}
