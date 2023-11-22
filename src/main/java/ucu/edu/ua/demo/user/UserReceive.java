package ucu.edu.ua.demo.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UserReceive implements Interface{
    private User theUser;

    @Override
    public void update(String information) {
        System.out.println("Email - " + theUser.getUserEmail() + "Message - " + information);
    }
}