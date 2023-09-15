import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMaxFromArray{

    public static void main(String[] args) {
        Integer[] temp = {200,201,506,405,2300, 4200, 102};
        int x = getMax(temp);
        System.out.println(x);
    }

    public static int getMax(Integer[] inp){
        ArrayList<Integer> newArray = new ArrayList<Integer>(Arrays.asList(inp));
        Integer maxInt = 0;
        for(Integer i : newArray){
            if(i>maxInt){
                maxInt = i;
            }
        }
        return maxInt;
    }

    


}