package OOPS;

import java.util.Scanner;

public class Lib {
    private String fio;
    private int id;
    private String faculty;
    private String dateBirth;
    private String phoneNumber;

    public Lib() {

    }

    public Lib(String fio, int id, String faculty, String dateBirth, String phoneNumber) {
        this.fio = fio;
        this.id = id;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = id;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int number) {
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        System.out.printf("%s took %d books", fio, number);
    }

    public void takeBook(String... books) {
        System.out.printf(fio + " took books: ");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public void takeBook(Livre... books) {
        for (Livre book : books) {
            System.out.println(fio+"took"+book.getAuthor()+" "+book.getBookName());
        }
    }
}
