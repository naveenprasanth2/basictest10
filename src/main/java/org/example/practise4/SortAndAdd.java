package org.example.practise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SortAndAdd {

    int a = 5;
    int b = 5;

    @Override
    public int hashCode() {
        return Objects.hash(this.a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SortAndAdd that = (SortAndAdd) o;
        return a == that.a;
    }

    public static void main(String[] args) {
        List<Integer> listOne = new ArrayList<>(List.of(1, 3, 5, 6, 7));
        List<Integer> listTwo = new ArrayList<>(List.of(2, 4, 6, 7, 9));
        List<Integer> listThree = new ArrayList<>();

        while (!listTwo.isEmpty() && !listOne.isEmpty()) {
            if (listOne.getFirst() <= listTwo.getFirst()) {
                listThree.add(listOne.removeFirst());
            } else if (listOne.getFirst() > listTwo.getFirst()) {
                listThree.add(listTwo.removeFirst());
            }
        }

        if (!listOne.isEmpty()) {
            listThree.addAll(listOne);
        }
        if (!listTwo.isEmpty()) {
            listThree.addAll(listTwo);
        }


        System.out.println(listThree);
    }
}
