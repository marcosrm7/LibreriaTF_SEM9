package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.User;

@Repository
public interface IUserRepository extends JpaRepository <User, Integer> {

}
