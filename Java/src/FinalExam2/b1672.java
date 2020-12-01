package FinalExam2;

public class b1672 {
    static public void main(String [] args){
        int[][] arr = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(arr));
    }

    static public int maximumWealth(int[][] accounts) {
        int res = 0;
        for(int i =0;i<accounts.length;i++){
            int temp = 0;
            for(int j = 0;j<accounts[i].length;j++){
                temp+=accounts[i][j];
            }
            res = Math.max(res,temp);
        }
        return res;
    }
}
