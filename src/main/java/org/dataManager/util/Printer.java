package org.dataManager.util;

import java.util.List;

public class Printer {
    public static void printRow(List<List<Object>> data){
        data.forEach((List<Object> list) -> {
            list.forEach(item -> System.out.print(STR."\{item},"));
            System.out.println();
        });
    }
}
