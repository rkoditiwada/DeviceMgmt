package com.team3.deviceMgmt.reopository;

/**
 * Created by admin on 7/13/2019.
 */
import com.team3.deviceMgmt.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}