package com.chainsys.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream {
public static void main(String[] args) {
	 
    Student student1 = new Student(
        "kayal",
        20,
        new Address("1234"),
        Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

    Student student2 = new Student(
        "vidhya",
        20,
        new Address("1235"),
        Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

    Student student3 = new Student(
        "angel",
        20,
        new Address("1236"),
        Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

    List<Student> students = Arrays.asList(student1, student2, student3);

//matching the name
    Optional<Student> stud = students.stream()
        .filter(student -> student.getName().equals("vidhya"))
        .findFirst();
    System.out.println(stud.isPresent() ? stud.get().getName() : "No student found");
    System.out.println("--------------------");
    
// matching the address
    Optional<Student> stud1 = students.stream()       		
            
            .filter(student -> student.getAddress().getZipcode().equals("1236"))
            .findFirst();
        System.out.println(stud1.isPresent() ? stud1.get().getName() : "No student found");
        System.out.println("--------------------");
        
        
//checking mobile no using anyMatch
        List<Student> stud2 = students.stream()
                .filter(student12 -> student12.getMobileNumbers().stream().anyMatch(x -> Objects.equals(x.getNumber(), "1233")))
                .collect(Collectors. toList());
     
              String result1 = stud2.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
              System.out.println(result1);
            System.out.println("--------------------");
  //allMatch
            List<Student> stud3 = students.stream()
                    .filter(student -> student.getMobileNumbers().stream().allMatch(x -> Objects.equals(x.getNumber(), "3333") || Objects.equals(x.getNumber(), "4444")))
                    .collect(Collectors.toList());
         
                String result4 = stud3.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
                System.out.println(result4);
                System.out.println("--------------------");
                
//noneMatch
                List<Student> stud4 = students.stream()
                        .filter(student -> student.getMobileNumbers().stream().noneMatch(x -> Objects.equals(x.getNumber(), "3333") || Objects.equals(x.getNumber(), "4444")))
                        .collect(Collectors.toList());
             
                    String result5 = stud4.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
                    System.out.println(result5);
                    System.out.println("--------------------");
                    
System.out.println(" ------------------------------------------------------------------------------------------------------------------------------                   \r\n"
		+ "");

TempStudent tmpStud1 = new TempStudent(
        "Dinesh",
        20,
        new Address("12341"),
        Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));

    TempStudent tmpStud2 = new TempStudent(
        "Ramya",
        21,
        new Address("12351"),
        Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));

    List<TempStudent> tmpStudents = Arrays.asList(tmpStud1, tmpStud2);
 //allDetails   
    List<Student> studentList = tmpStudents.stream()
        .map(tmpStud -> new Student(tmpStud.name, tmpStud.age, tmpStud.address, tmpStud.mobileNumbers))
        .collect(Collectors.toList());

    System.out.println(studentList);
    System.out.println("--------------------");
//StudentName
    List<String> studentsName = studentList.stream()
            .map(Student::getName)
            .collect(Collectors.toList());
 
        System.out.println(studentsName.stream().collect(Collectors.joining(",")));
        System.out.println(studentsName.stream().collect(Collectors.joining(",", "[", "]")));
        System.out.println("--------------------");
//mapping the name
        String name = students.stream()
                .map(Student::getName)
                .collect(Collectors.joining(",", "[", "]"));
            System.out.println(name);
            System.out.println("--------------------");
//listing the name
            List<String> nameList =
                    Arrays.asList("jayesh", "dany", "khyati", "hello", "mango");
         
                nameList.stream()
                    .map(String::toUpperCase)
                    .forEach(System.out::println);
                System.out.println("--------------------");
//sorted
                List<String> namesList =
                        Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");
             
                    namesList.stream()
                        .sorted()
                        .forEach(System.out::println);
                    System.out.println("--------------------");


}

}