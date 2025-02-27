package designpatterns.strategy.searcher;

import java.util.List;

public interface Searcher {
    Integer search(Integer key, List<Integer> numbers);
}
