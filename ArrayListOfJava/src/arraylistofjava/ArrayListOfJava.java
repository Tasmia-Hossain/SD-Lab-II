
package arraylistofjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListOfJava {

    public static void main(String[] args) {
        
        List<Integer> list=new ArrayList<>();
        System.out.println("Size before creating the array list: "+list.size());
        
        list.add(50);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);
        list.add(60);
        list.add(40);
        list.add(80);
        
        list.add(2,90);
        //list.add(0,new Integer(100));
        System.out.println("After creating the array list: "+list);
        
        System.out.println("The value of index 3: "+list.get(3));
        System.out.println("Size after creating the array list: "+list.size());
        
        list.remove(2);
        list.remove(new Integer(50));
        System.out.println("List after removing a value of a index: "+list);
        
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum=sum+list.get(i);
        }
        System.out.println("Sum: "+sum);
        
        System.out.println("");
        for(Integer i:list){
            System.out.println(i);
        }
        
        Collections.sort(list);
        System.out.println("Ascending order sort:"+list);
        
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending order sort: "+list);
        
        list.clear();
        System.out.println("Size after clearing the array list: "+list.size());
        System.out.println("After clearing the array list: "+list);
        
    }
    
}
