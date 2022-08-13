package com.example.demo.arrayLists;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class ListInitializationTests {
    
    @Test
    public void givenAnonymousInnerClass_thenInitializeList(){

        ArrayList<String> arrayList = new ArrayList<String>(){
            {
                add("apple");
                add("orange");
            }
        }; 

        assertNotNull(arrayList);
        assertEquals(arrayList.get(0), "apple");

    }
}
