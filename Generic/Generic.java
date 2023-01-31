package JavaAssignment4.Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic <T> {
    ArrayList<T> arr;

    public Generic(ArrayList<T> arr) {
        this.arr = arr;
    }
    
    public final void display() {
        Iterator<T> it = arr.iterator();
        while(it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        
        System.out.println("\n\n");
    }
    
}