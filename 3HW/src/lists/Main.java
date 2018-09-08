package lists;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        String str = null;

        ArrayList<String> al = new ArrayList<>(Arrays.asList("Never", "Swim", "Alone", "Boys", "Noize", "Orbital", "Daft", "Punk", "Swim", "Boys", "Beastie", "Punk", "Alone", "Boys"));
        System.out.println(al);

        TreeSet<String> uniqElem = new TreeSet<>();
        uniqElem.addAll(al);
        System.out.println(uniqElem);

        ArrayList<String> unq = new ArrayList<>();
        unq.addAll(uniqElem);
        System.out.println(unq);


        HashMap<String, Integer> wordCount = new HashMap<>();

        for (int i = 0; i < unq.size(); i++) {
            for (int j = 0; j < al.size(); j++) {
                if (unq.get(i) == al.get(j)) {
                    count++;
                }
            }
            wordCount.put(unq.get(i), count++);
            count = 0;
        }

        System.out.println(wordCount);

        // task 2

        LinkedList<Phonebook> phonebook = new LinkedList<>();

        phonebook.add(new Phonebook("Egorova", 45682));
        phonebook.add(new Phonebook("Petrova", 846512));
        phonebook.add(new Phonebook("Nikolaeva", 8945612));
        phonebook.add(new Phonebook("Antonova", 91313584));
        phonebook.add(new Phonebook("Petrova", 3154987));

        searchNumber("Petrova", phonebook);
    }

    public static void searchNumber(String str, LinkedList<Phonebook> a) {
        for (int i = 0; i < a.size(); i++) {
            if (str == a.get(i).getSurname()) {
                System.out.println(a.get(i).getNumber());
            }
        }
    }


}
