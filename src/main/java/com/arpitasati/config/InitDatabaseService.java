package com.arpitasati.config;

import com.arpitasati.entity.User;
import com.arpitasati.repo.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;

@Service
public class InitDatabaseService {
    @Resource
    private UserRepository userRepository;

    @Resource
    private PasswordEncoder passwordEncoder;

    //    Insert test data into db
    public void init() throws ParseException {
        if (userRepository.count() == 0) {
            User user = new User();
            user.setUsername("mahmud");
            user.setEmail("mhshafin220@gmail.com");
            user.setRole(User.Role.ADMIN);
            user.setPassword(passwordEncoder.encode("password"));
            userRepository.save(user);
        }
    }
}
