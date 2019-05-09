package design.patterns.java.builder;

public class UserBuilder {

    private User user;

    //Required
    private String firstName;
    private String lastName;

    //Defaults
    private String email = "";
    private String address = "";

    /**
     * UserBuilder with firstName and lastName as required Parameters
     *
     * @param firstName
     * @param lastName
     */
    public UserBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public User build() {
        user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setAddress(address);

        return user;
    }
}