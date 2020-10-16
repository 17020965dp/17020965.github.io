package Lesson2;

public class BubbleSortExam {
    public static void BubbleSort(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String [] args){
        int [] a = {1,5,2,32,55,23,42};
        BubbleSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
