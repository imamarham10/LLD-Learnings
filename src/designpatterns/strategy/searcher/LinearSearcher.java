package designpatterns.strategy.searcher;

import java.util.List;
import java.util.Objects;

public class LinearSearcher implements Searcher{
    @Override
    public Integer search(Integer key, List<Integer> numbers) {
        for(int i=0; i<numbers.size(); i++) {
            if(Objects.equals(numbers.get(i), key)){
                return i;
            }
        }
        return -1;
    }
}
