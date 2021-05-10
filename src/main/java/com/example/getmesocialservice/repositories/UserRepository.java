package com.example.getmesocialservice.repositories;

import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUsers() {
        User user1 = new User("Adam","New York",22,"https://picsum.photos/id/237/200/300");
        return user1;
    }
}
