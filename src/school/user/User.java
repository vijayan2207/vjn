package user;

import enums.UserType;

public abstract class User {

    public abstract UserType getUserType();

    private String id;
    private String name;
    private long contact;
    private String address;
    private int age;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public long getContact() {
        return contact;
    }
    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }


}
