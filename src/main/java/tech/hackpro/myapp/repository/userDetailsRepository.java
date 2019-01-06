package tech.hackpro.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.hackpro.myapp.entity.UserDetails;

@Repository
public interface userDetailsRepository extends JpaRepository<UserDetails,Long> {

}
