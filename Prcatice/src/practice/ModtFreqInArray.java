package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ModtFreqInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr = {-20,5,6,5,9,7,9,0,7};
         HashMap<Integer,Integer> hsMap = new HashMap<>();
         
         for(int i=0;i<arr.length;i++)
         {
        	   if(hsMap.containsKey(arr[i]))
        		   hsMap.put(arr[i], hsMap.get(arr[i])+1);
        	   else
        		   hsMap.put(arr[i],1);
         }
         TreeMap<Integer,Integer> trMap = new TreeMap<>(hsMap);
         System.out.println(hsMap);
         System.out.println(trMap);
         System.out.println(trMap.lastEntry());
         int freq =0;
         int maxfrequentItem = 0;
         for(Entry<Integer, Integer> entry: hsMap.entrySet())
         {
        	   if(entry.getValue()>freq)
        	   {
        		   freq=entry.getValue();
        		   maxfrequentItem =entry.getKey();
        	   }
         }
         
         System.out.println(maxfrequentItem +"->"+ freq);
	}

}
