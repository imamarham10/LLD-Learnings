package designpatterns.strategy;

import designpatterns.strategy.inserter.OrderedInserter;
import designpatterns.strategy.searcher.BinarySearcher;
import designpatterns.strategy.store.NumberStore;

public class Tester {
    public static void main(String[] args) {
        NumberStore numberStore = new NumberStore(new OrderedInserter(), new BinarySearcher());
        numberStore.insert(2);
        numberStore.insert(5);
        numberStore.insert(1);
        numberStore.insert(10);

        System.out.println(numberStore.search(5));
    }
}
