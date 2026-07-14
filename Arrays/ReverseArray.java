package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] num = {677,352,123,543,632};
        int[] res = new int[num.length];
        for (int i=0;i< num.length;i++)
        {
            res [i]=num[(num.length-i)-1];
        }
        for(int x:res)
        {
            System.out.print(x+" ");
        }
    }
}