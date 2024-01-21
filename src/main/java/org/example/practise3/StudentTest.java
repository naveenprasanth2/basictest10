package org.example.practise3;

import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("naveen", 22, 100, 15);
        Student s2 = new Student("praasnth", 23, 60, 25);
        Student s3 = new Student("summa", 24, 70, 16);
        Student s4 = new Student("test", 25, 56, 17);
        Student s5 = new Student("testing", 26, 40, 18);
        Student s6 = new Student("sizer", 27, 80, 19);

        List<Student> test = List.of(s1, s2, s3, s4, s5, s6);

        test.stream().filter(x -> x.marks() == test.stream().map(Student::marks).mapToInt(Integer::intValue).max().orElseThrow())
                .findFirst().ifPresent(System.out::println);
    }
}
