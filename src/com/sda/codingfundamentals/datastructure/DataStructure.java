package com.sda.codingfundamentals.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataStructure {

    private List<String> createAndFillList(List<String> list) {

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");

        return list;
    }

    private void addInCenter(List<String> list){

        int centerIndex = list.size() / 2;
        list.add(centerIndex, "element");

    }

    public static void main(String[] args) {
        DataStructure dataStructure = new DataStructure();

        List<String> arrayList = dataStructure.createAndFillList(new ArrayList<>());
        dataStructure.addInCenter(arrayList);
        System.out.println("ArrayList: " + arrayList);


        List<String> linkedList = dataStructure.createAndFillList(new LinkedList<>());
        dataStructure.addInCenter(linkedList);
        System.out.println("LinkedList: " + linkedList);

        String s = linkedList.get(3);

    }
    
}
