package korman;

import java.util.ArrayList;
import java.util.List;

public class InsertSorting {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>(List.of(4, 2,5,6,1,3));
        System.out.println(sort(list));
    }

    public static List<Integer> sort(List<Integer> list){
        for (int i = 1; i < list.size(); i++) {
            int j=i;
            while (j>0 && list.get(j)<=list.get(j-1)){
                Integer temp = list.get(j);
                list.set(j, list.get(j-1));
                list.set(j-1, temp);
                j=j-1;
            }
        }
        return list;
    }
}
