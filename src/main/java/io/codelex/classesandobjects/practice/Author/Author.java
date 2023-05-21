package io.codelex.classesandobjects.practice.Author;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Author {
    public static final int BOOKS_IN_THE_WORLD = 129864880;

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private List<String> books;
    public Author(String firstName, String lastName, LocalDate dateOfBirth){
            this.firstName = firstName;
            this.lastName = lastName;
            this.dateOfBirth = dateOfBirth;
            this.books = new ArrayList<>();

    }
    public void printAllInfo() {
        System.out.println("Author " + this.firstName + " " + this.lastName);
    }
    public void addBook(String book) {
        books.add(book);
    }

    public long getAge() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateOfBirth, currentDate);
        return period.getYears();
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public boolean hasWrittenBook(String title) {
        return books.contains(title);

    } public boolean printAuthorInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Author{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", dateOfBirth=").append(dateOfBirth);
        sb.append(", books=[");
        for (int i = 0; i < books.size(); i++) {
            sb.append(books.get(i));
            if (i != books.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        sb.append("}");
        System.out.println(sb.toString());
        return false;
    }

    public void howManyBooks() {
        System.out.println("He has written " + books.size() + " books");
    }
}
