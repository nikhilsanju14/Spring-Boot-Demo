package com.example.store;

import com.example.store.entities.Address;
import com.example.store.entities.Profile;
import com.example.store.entities.Tag;
import com.example.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var user = User.builder()
                .name("John")
                .password("password")
                .email("john@code.com")
                .build();

//        var address = Address.builder()
//                .street("street")
//                .city("city")
//                .state("state")
//                .zip("zip")
//                .build();
//
//        user.addAddress(address);

//        user.addTag("tag1");
        var profile = Profile.builder()
                        .bio("bio")
                        .build();
        user.setProfile(profile);
        profile.setUser(user);
        System.out.println(user);
    }
}
