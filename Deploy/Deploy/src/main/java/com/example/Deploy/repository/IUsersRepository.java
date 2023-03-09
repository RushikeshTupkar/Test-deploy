package com.example.Deploy.repository;

import com.example.Deploy.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsersRepository extends JpaRepository<Users,Integer> {
}
