package org.example.netflix;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OverLappingIntervals {
    public static void main(String[] args) {
        List<List<Integer>> test = new ArrayList<>();
        test.add(List.of(1, 3));
        test.add(List.of(5, 7));
        test.add(List.of(2, 4));
        test.add(List.of(6, 8));
        List<List<Integer>> finalList = new ArrayList<>();
        Set<Integer> tempSet = null;
        for (int i = 0; i < test.size(); i++) {
            for (int j = i + 1; j < test.size(); j++) {
                int finalJ = j;
                int finalI = i;
                tempSet = test.stream().filter(x -> test.get(finalI).getFirst() < test.get(finalI).getLast() &&
                                test.get(finalI).getLast() > test.get(finalJ).getFirst() &&
                                test.get(finalJ).getFirst() < test.get(finalJ).getLast())
                        .map(x -> List.of(test.get(finalI).getFirst(), test.get(finalJ).getLast()))
                        .flatMap(Collection::stream).collect(Collectors.toSet());
                if(!tempSet.isEmpty()){
                    finalList.add(new ArrayList<>(tempSet));
                }
            }

        }
        System.out.println(finalList);
    }
}
