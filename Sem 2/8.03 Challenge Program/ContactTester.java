// Gavin Perry, 2024-3-1, The purpose of this program is to test contact class with various search and sorting algorithms
import java.util.ArrayList;

public class ContactTester {
    public static void main(String[] args) {
        Contact[] myContacts = {
            new Contact("Gavin Perry", "3133133113", "gavingavin@gavin.gavin", "self", "2007-9-20"),
            new Contact("John Doe", "1234567890", "Johnatoh23423@gmail.com", "friend", "2000-3-21"),
            new Contact("Jane Smith", "9876543210", "janesmith@gmail.com", "friend", "2009-7-15"),
            new Contact("Michael Johnson", "5555555555", "michaeljohnson@gmail.com", "colleague", "1998-10-10"),
            new Contact("Emily Davis", "1111111111", "emilydavis@gmail.com", "family", "1984-5-5"),
            new Contact("Danny Clark", "2222222222", "danielclark@gmail.com", "colleague", "2008-11-30"),
            new Contact("Sarah Thompson", "4444444444", "sarahthompson@gmail.com", "colleague", "2001-8-25"),
            new Contact("Jessica Anderson", "6666666666", "jessicaanderson@gmail.com", "family", "2001-2-15"),
            new Contact("Robert Martinez", "8888888888", "robertmartinez@gmail.com", "friend", "1998-10-10"),
            new Contact("Daniel Clark", "5555555555", "danielclark@gmail.com", "colleague", "2003-4-5")
        };

        System.out.println("Original List");
        printTable(myContacts);
        System.out.println();
        System.out.println("Name Searches:");
        selectionSortNames(myContacts);
        System.out.println(binarySearchName(myContacts, "Gavin Perry"));
        System.out.println(binarySearchName(myContacts, "BABA BOOEY"));
        System.out.println();
        System.out.println("Relation Searches:");
        selectionSortRelation(myContacts);
        binarySearchRelation(myContacts, "friend");
        System.out.println();
        System.out.println("Birthday Month Searches:");
        printTable(sequentialSearchBirthdayMonth(myContacts, "10").toArray(new Contact[0]));
        System.out.println();
        System.out.println("Phone Number Searches:");
        printTable(sequentialSearchPhoneNumber(myContacts, "5555555555").toArray(new Contact[0]));
        System.out.println();
        System.out.println("Email Searches:");
        printTable(sequentialSearchEmail(myContacts, "danielclark@gmail.com").toArray(new Contact[0]));


        
    }

    public static void printTable(Contact[] contacts) {
        System.out.printf("%-20s\t%10s\t%-30s\t%-20s\t%-20s\n", "name", "phone", "email", "relation", "birthday");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }

    public static void selectionSortNames(Contact[] contacts) {
        for (int i = 0; i < contacts.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < contacts.length; j++) {
                if (contacts[j].getName().compareTo(contacts[minIndex].getName()) < 0) {
                    minIndex = j;
                    // System.out.println(minIndex);
                }
            }
            Contact temp = contacts[minIndex];
            contacts[minIndex] = contacts[i];
            contacts[i] = temp;
        }
    }

    public static void selectionSortRelation(Contact[] contacts) {
        for (int i = 0; i < contacts.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < contacts.length; j++) {
                if (contacts[j].getRelation().compareTo(contacts[minIndex].getRelation()) < 0) {
                    minIndex = j;
                    // System.out.println(minIndex);
                }
            }
            Contact temp = contacts[minIndex];
            contacts[minIndex] = contacts[i];
            contacts[i] = temp;
        }
    }

    public static Contact binarySearchName(Contact[] contacts, String name) {
        int low = 0;
        int high = contacts.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (contacts[mid].getName().compareTo(name) < 0) {
                low = mid + 1;
            } else if (contacts[mid].getName().compareTo(name) > 0) {
                high = mid - 1;
            } else {
                return contacts[mid];
            }
        }
        return null;
    }

    public static void binarySearchRelation(Contact[] contacts, String relation) {
        int low = 0;
        int high = contacts.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (contacts[mid].getRelation().compareTo(relation) < 0) {
                low = mid + 1;
            } else if (contacts[mid].getRelation().compareTo(relation) > 0) {
                high = mid - 1;
            } else {
                lpRelation(contacts, mid, relation);
                return;
            }
        }
    }

    public static ArrayList<Contact> sequentialSearchBirthdayMonth(Contact[] contacts, String month) {
        ArrayList<Contact> result = new ArrayList<>();
        for (Contact c : contacts) {
            if (c.getBirthday().substring(5, 7).equals(month)) {
                result.add(c);
            }
        }
        return result;
    }

    public static ArrayList<Contact> sequentialSearchPhoneNumber(Contact[] contacts, String phoneNumber) {
        ArrayList<Contact> result = new ArrayList<>();
        for (Contact c : contacts) {
            if (c.getPhone().equals(phoneNumber)) {
                result.add(c);
            }
        }
        return result;
    }

    public static ArrayList<Contact> sequentialSearchEmail(Contact[] contacts, String email) {
        ArrayList<Contact> result = new ArrayList<>();
        for (Contact c : contacts) {
            if (c.getEmail().equals(email)) {
                result.add(c);
            }
        }
        return result;
    }

    public static void lpRelation(Contact[] contacts, int index, String relation) {
        int i = index;
        while (i >= 0 && contacts[i].getRelation().equals(relation)) {
            System.out.println(contacts[i]);
            i--;
        }
        i = index + 1;
        while (i < contacts.length && contacts[i].getRelation().equals(relation)) {
            System.out.println(contacts[i]);
            i++;
        }
    }
}
