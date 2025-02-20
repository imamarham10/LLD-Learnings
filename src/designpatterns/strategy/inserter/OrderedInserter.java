package designpatterns.strategy.inserter;

import java.util.Collections;
import java.util.List;

public class OrderedInserter implements Inserter{

    @Override
    public void insert(Integer num, List<Integer> numberedList) {
        numberedList.add(num);
        int k = numberedList.size()-1;
        while(k>0 && numberedList.get(k) < numberedList.get(k-1)){
            Collections.swap(numberedList,k-1,k);
            k--;
        }
    }
}
