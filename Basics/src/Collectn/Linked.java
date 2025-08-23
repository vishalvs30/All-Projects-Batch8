package Collectn;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linked {
public static void main(String[] args) {
	List<Character> li=new LinkedList<Character>();
	li.add('S');
	li.add('W');
	li.add('Q');
	li.add('W');
	li.add(null);
	li.add('G');
	
	System.out.println(li);
	
	System.out.println(li.get(2)); 
	
    li.set(2, 'Z');
    
    System.out.println(li);
    li.add(3, 'A');
    li.remove(4);
    li.remove(Character.valueOf('W'));
    li.contains('S');
    li.indexOf('W');
    li.lastIndexOf('W');
    li.size();
    li.isEmpty();
    li.toArray();
    li.subList(1, 4);

    
    System.out.println("Final List: " + li);

  
    Iterator<Character> itr = li.iterator();
    System.out.print("Using Iterator: ");
    while (itr.hasNext()) {
        System.out.print(itr.next() + " ");
    }

    li.clear();
}
}
