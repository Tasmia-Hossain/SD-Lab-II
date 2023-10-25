
package araaylistpractice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AraayListPractice {

    public static void main(String[] args) {
        
        List<String> list=new ArrayList<>();
        list.add("Name: Tasmia Hossain Kashfia");
        list.add("ID: 20210204038");
        list.add("Department: CSE");
        list.add("Section: A");
        
        Iterator itr=list.iterator(); 
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}
