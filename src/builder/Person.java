package builder;

public class Person {
    private String firstName;
    private String lastname;
    private String pesel;
    private String address;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    private Person(String pesel) {
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static final class PersonBuilder {
        private String firstName;
        private String lastname;
        private String pesel;
        private String address;

        private PersonBuilder(String pesel) {
            this.pesel = pesel;
        }

        public static PersonBuilder aPerson(String pesel) {
            return new PersonBuilder(pesel);
        }

        public PersonBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder withLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public PersonBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            Person person = new Person(pesel);
            person.setFirstName(firstName);
            person.setLastname(lastname);
            person.setAddress(address);
            return person;
        }
    }
}
