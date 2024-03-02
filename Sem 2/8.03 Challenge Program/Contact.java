// Gavin Perry, 2024-3-2, This program is designed to create a class that stores contact information.
public class Contact {
    private String name;
    private String phone;
    private String email;
    private String relation;
    private String birthday;

    public Contact(String name, String phoneNumber, String email, String relation, String birthday) {
        this.name = name;
        this.phone = phoneNumber;
        this.email = email;
        this.relation = relation;
        this.birthday = birthday;
    }

    public String toString() {
        return String.format("%-20s\t%10s\t%-30s\t%-20s\t%-20s", name, phone, email, relation, birthday);
    }

    // long string of getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
