package collection_framework;  
import java.util.ArrayList;
import java.util.List;

public class arraylist {

  public static void main(String[] args) {
      ArrayList<Integer> rollnumber = new ArrayList<>();
    rollnumber.add(1);
    rollnumber.add(99);
    rollnumber.add(56);

// System.out.println(rollnumber);


// list is an interface
List<Integer> newlist= new ArrayList<>();
newlist.add(3);
newlist.add(6);
System.out.println(newlist);
// 10 will get add the end of the list
newlist.add(10);

newlist.add(3, 59);


List<Integer> list = new ArrayList<>();
list.add(76);
list.add(87);
// add to list i.e list and new list
newlist.addAll(list);
System.out.println(newlist);

  }

    
}
