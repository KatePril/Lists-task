package app.utils;

import java.util.*;

import static java.util.Collections.list;
import static java.util.Collections.sort;

public final class ListOperator {
    public static String getList(List<String> list) {
        ListIterator<String> listIterator = list.listIterator();
        StringBuilder listOutput = new StringBuilder();
        while (listIterator.hasNext()) {
            listOutput.append(listIterator.nextIndex() + 1)
                    .append(") ").append(listIterator.next()).append("\n");
        }
        return listOutput.toString();
    }

    public static void sort(List<String> list) {
        Collections.sort(list);
    }

    public static List<String> sliceList(List<String> list, int startIndex, int endIndex ) {
        return list.subList(startIndex, endIndex);
    }

    public static void addFirstElement(LinkedList<String> list, String value) {
        list.addFirst(value);
    }

    public static void addLastElement(LinkedList<String> list, String value) {
        list.addLast(value);
    }
}
