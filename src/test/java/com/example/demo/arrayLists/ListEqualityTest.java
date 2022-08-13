package com.example.demo.arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import org.junit.jupiter.api.Test;




public class ListEqualityTest {

    List<String> list1 = new ArrayList<>(Arrays.asList("a","b","c","d"));
    List<String> list2 = new ArrayList<>(Arrays.asList("a","b","c","d"));
    List<String> list3 = new ArrayList<>(Arrays.asList("a","d","b","c"));

    @Test
    public void givenThreeArrayList_equalityDepentsOnOrderOfElementsAlso(){
        assertEquals(list1,list2);
        assertNotSame(list1, list2);
        assertNotEquals(list1, list3);
    }
 
    
}
