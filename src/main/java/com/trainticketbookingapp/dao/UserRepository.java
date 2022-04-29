package com.trainticketbookingapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainticketbookingapp.model.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}
