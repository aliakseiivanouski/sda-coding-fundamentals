package com.sda.codingfundamentals.datastructure;

import java.util.LinkedList;
import java.util.List;

public class WorkWithLinkedList extends DataStructure {

    public List<String> createAndFillList() {

        List<String> linkedList = new LinkedList<>();

        linkedList.add("six");
        linkedList.add("seven");
        linkedList.add("eight");
        linkedList.add("nine");
        linkedList.add("ten");

        return linkedList;
    }

}
