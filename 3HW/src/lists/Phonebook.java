package lists;

public class Phonebook {
    String surname;
    int number;

    public Phonebook(String surname, int number) {
        this.surname = surname;
        this.number = number;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumber() {
        return number;
    }

}
