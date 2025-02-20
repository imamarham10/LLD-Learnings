package designpatterns.strategy.searcher;

import java.util.List;
import java.util.Objects;

public class BinarySearcher implements Searcher{
    @Override
    public Integer search(Integer key, List<Integer> numbers) {
        int i= 0, j = numbers.size()-1;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(Objects.equals(numbers.get(mid), key))
                return mid;
            else if(numbers.get(mid) < key)
                i = mid + 1;
            else
                j = mid - 1;
        }
        return -1;
    }
}
