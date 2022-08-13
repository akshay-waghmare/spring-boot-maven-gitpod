package com.example.demo.arrayLists;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ArrayToListTests {

    @Test
    public void givenAnStringArray_whenConvertedToList_thenListIsReturned() {

        String[] stringArray = { "mahendra", "maruti", "hundai" };
        List<String> stringList = Arrays.asList(stringArray);

        assertNotNull(stringList);
        assertEquals(stringList.size(), 3);
        assertEquals(stringList.get(0), "mahendra");
        assertEquals(stringList.get(1), "maruti");
        assertEquals(stringList.get(2), "hundai");

    }

    @Test
    public void givenAnIntArray_whenConvertedArrayToList_thenArrayWithOneElementIsCreated() {

        int[] intArray = { 1, 2, 3, 4, 5 };
        List<int[]> asList = Arrays.asList(intArray);

        assertNotNull(asList);
        assertEquals(asList.size(), 1);
        assertEquals(asList.get(0)[1], 2);

    }

    @Test
    public void givenAnStringArray_whenConvertedToListAndRemoveAnElement_thenThrowsError(){

        String[] fruitList = {"apple","banana","orange","banana"};
        List<String> asList = Arrays.asList(fruitList);

        assertNotNull(asList);
        assertEquals(asList.get(0),"apple");
        assertThrows(UnsupportedOperationException.class, () -> asList.remove("apple"));

    }

    @Test
    public void givenAnStringArray_whenConvertedToListAndAddAnElement_thenThrowsUnsopported(){

        String[] fruitList = {"apple","banana","orange","banana"};
        List<String> asList = Arrays.asList(fruitList);

        assertNotNull(asList);
        assertEquals(asList.get(0),"apple");
        assertThrows(UnsupportedOperationException.class, () -> asList.add("jackfruit"));

    }

    @Test
    public void givenAnStringArray_whenConvertedToListAndRemoveAnElement_thenThrowsUnsopported(){

        String[] fruitList = {"apple","banana","orange","banana"};
        List<String> asList = Arrays.asList(fruitList);

        assertNotNull(asList);
        assertEquals(asList.get(0),"apple");
        assertThrows(UnsupportedOperationException.class, () -> asList.remove("apple"));

    }



}
