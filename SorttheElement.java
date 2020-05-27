package HackerRank;

import java.util.*;

public class SorttheElement
{
    public static void main(String[] args) {
        int array[]={2,3,2,2,3,8,11,12,11,12};
        solution(array);
    }

    private static void solution(int[] array) {

                Arrays.sort(array);

        Map<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<array.length;i++)
        {
            map.put(array[i],map.getOrDefault(array[i],0)+1);

        }
        map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer> comparingByValue().reversed())
                .forEach(record ->{

                    int value=record.getValue();

                    for(int i=0;i<value;i++)
                    {
                        System.out.println(record.getKey().shortValue());
                    }
                });





    }
}
