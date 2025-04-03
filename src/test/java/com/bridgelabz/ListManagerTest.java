package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {

    private ListManager listManager;
    private List<Integer> list;
@BeforeEach
    void setup(){
        listManager=new ListManager();
        list=new ArrayList<>();
    }



    @Test
    public void shouldAddElementToTheList(){
       listManager.addElement(list,5);
        //Assertions.assertEquals(1,list.size());
        Assertions.assertTrue(list.contains(5));
    }

    @Test
    public void shouldRemoveElementFromTheList(){
        listManager.addElement(list, 10); //0
        listManager.addElement(list, 12); //1
        listManager.addElement(list, 13); //1
        boolean a= listManager.removeElement(list,10);
        Assertions.assertEquals(true, a, "List size should be 3.");
    }


    @Test
    public void shouldGiveSizeOfTheList(){
        listManager.addElement(list, 1);
        listManager.addElement(list, 2);
        listManager.addElement(list, 3);
        int size = listManager.getSize(list);
        Assertions.assertEquals(3, size, "List size should be 3.");
    }

}
