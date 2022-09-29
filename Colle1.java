import java.util.ArrayList;
import java.util.List; 
import java.util.Iterator;
public class Colle1 {

    public static void main(String[] args) {
    
    List<Float> list = new ArrayList<>();
    
    list.add((float) 1.1);
    list.add((float) 1.2);
    list.add((float) 1.3);
    list.add((float) 1.4);
    list.add((float) 1.5);
    float sum = 0;
    Iterator<Float> it = list.iterator();
    while (it.hasNext()) {
    sum = sum + it.next();
    }
    System.out.println(sum);
    }
    }
