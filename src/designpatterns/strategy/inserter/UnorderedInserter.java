package designpatterns.strategy.inserter;

import java.util.List;

public class UnorderedInserter implements Inserter{
    @Override
    public void insert(Integer num, List<Integer> numberedList) {
        numberedList.add(num);
    }
}
