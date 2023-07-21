package com.example.demo.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;



public class CollectionsTest {

   private  ArrayList<String> stringToSearch;

   @BeforeEach
   public void setup() {
        ArrayList<String> collect = LongStream.range(0, 16).boxed().map(x -> Long.toHexString(x)).collect(Collectors.toCollection(ArrayList::new));
        stringToSearch = new ArrayList<>(collect);
        stringToSearch.addAll(collect);
   }

   @Test
    public void givenListIterator_whenReverseTraversal_thenRetrieveElementsInOppositeOrder() {
        List<Integer> list = IntStream.range(0, 10).boxed().collect(Collectors.toCollection(ArrayList::new));
        ListIterator<Integer> it = list.listIterator(list.size());
        List<Integer> result = new ArrayList<>(list.size());
        while (it.hasPrevious()) {
            result.add(it.previous());
        }

        Collections.reverse(list);
        assertIterableEquals(result, list);
    }
 
    
}
