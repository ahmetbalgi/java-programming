package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int [] data ={32,532,1,22,123,543,999,321,3};
        for (int eachNum:data){
            System.out.print(eachNum+" ");
        }
        for (int i =0;i<data.length;i++){
            System.out.println(data[i]);
            ;
        }
        System.out.println(data[data.length-1]);
        for (int idx = data.length - 1;idx>=0;idx--){
            System.out.print(data[idx] +" ");

        }
    }
}
