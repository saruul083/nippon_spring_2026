package nippon.week12_day04_backend;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Integer> numbersArrayList = new ArrayList<Integer>();
        
        numbersArrayList.add(1);
        numbersArrayList.add(2);
        numbersArrayList.add(3);
        numbersArrayList.add(4);
        numbersArrayList.add(5);
        
        numbersArrayList.set(0, -100);
        
        numbersArrayList.add(2, 10);
        
        numbersArrayList.remove(numbersArrayList.size()-1);
        
        for (int i = 0; i < numbersArrayList.size(); i++) {
        	System.out.println(numbersArrayList.get(i));
		}
    }
    
}
