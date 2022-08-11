package com.example.demo.arrayLists;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArrayToListTests {

    @Test
    public void givenAnStringArray_whenConvertedToList_thenListIsReturned(){

        String[] stringArray = {"mahendra" , "maruti" , "hundai" };

        List<String> stringList = Arrays.asList(stringArray);

        assertNotNull(stringList);
        assertEquals(stringList.size(),3);
        assertEquals(stringList.get(0),"mahendra");
        assertEquals(stringList.get(1),"maruti");
        assertEquals(stringList.get(2),"hundai");

    }
    
}
