package designpatterns.strategy.store;

import designpatterns.strategy.inserter.Inserter;
import designpatterns.strategy.searcher.Searcher;

import java.util.ArrayList;
import java.util.List;

public class NumberStore {
    private final Searcher searcher;
    private final Inserter inserter;
    private final List<Integer> numbers;
    public NumberStore(Inserter inserter,Searcher searcher) {
        this.searcher = searcher;
        this.inserter = inserter;
        numbers = new ArrayList<>();
    }
    public Integer search(Integer key){
        return this.searcher.search(key, numbers);
    }
    public void insert(Integer value){
        this.inserter.insert(value, numbers);
    }
}
