package compostion;

public class Student {

    private String name;
    private int age;
    private Address address; // added an Address field called address

    public Student(String streetAddress, int zipCode, String state, String phone, String name, int age) {
        this.address = new Address(streetAddress, zipCode, state, phone); // create a new address using the parameters passed in from the Student constructor
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress()
    {
        return address;
    }
    public void setAddress(Address address)
    {
        this.address = address;
    }

    public String getState(){
        return this.address.getState();
    }

}
