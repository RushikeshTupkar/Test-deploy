package com.example.Deploy.service;

import com.example.Deploy.model.Users;
import com.example.Deploy.repository.IUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
@Autowired
private IUsersRepository iUsersRepository;
    public Users addUser(Users user) {
        return iUsersRepository.save(user);
    }

    public List<Users> getAll() {
        return iUsersRepository.findAll();
    }
}
