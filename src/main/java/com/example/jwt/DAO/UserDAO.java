package com.example.jwt.DAO;

import com.example.jwt.model.DAOUser;
import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<DAOUser, Integer> {

  DAOUser findByUsername(String username);
}
