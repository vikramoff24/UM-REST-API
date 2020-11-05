package net.vikram.umrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.vikram.umrest.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}