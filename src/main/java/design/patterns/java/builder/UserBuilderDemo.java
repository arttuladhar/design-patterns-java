package design.patterns.java.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Demo Class
 */
class UserBuilderDemo {

    public static final Logger logger = LoggerFactory.getLogger(UserBuilderDemo.class.getName());

    public static void main(String[] args) {
        User johnDoe = new UserBuilder("John", "Doe").build();
        User robertNoyce = new UserBuilder("Robert", "Noyce")
                .email("robert.noyce@gmail.com")
                .address("Burlington, IA").build();
        logger.info("{}", johnDoe);
        logger.info("{}", robertNoyce);
    }
}
