package Lesson3.ArrayExam;

public class Main {

    public static void main(String [] args){

        int [] arr = {1,3,4,5,6,7,8,10};

        AddToArray a = new AddToArray();
        EditArray e = new EditArray();
        DeleteArray d = new DeleteArray();
        InsertToArray c = new InsertToArray();

        int []arr2 =  a.add(arr,100);

        int []arr3 = d.delete2(arr,3);
        int []arr4 = c.insert(arr,3,100);

        e.edit(arr,1,100);

        for(int i: arr3){
            System.out.println(i);
        }
    }


}
