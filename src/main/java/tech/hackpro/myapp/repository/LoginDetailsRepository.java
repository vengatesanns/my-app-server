package tech.hackpro.myapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.hackpro.myapp.entity.LoginDetails;

@Repository
public interface LoginDetailsRepository extends JpaRepository<LoginDetails, Long>{

	List<LoginDetails> findByUsernameAndPassword(String username,String password);

}
