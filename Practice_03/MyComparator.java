package Practice_03;

import java.util.Comparator;

import javax.lang.model.util.ElementScanner14;

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1<o2){
            return 1;
        }    
        else if (o1>o2){
            return -1;
        }
        else{
            return 0;
        }

    }

}
