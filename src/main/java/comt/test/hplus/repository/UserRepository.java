package comt.test.hplus.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import comt.test.hplus.beans.User_;

@Repository
public interface UserRepository extends CrudRepository<User_, Integer>{
	
	@Query("select u from User_ as u where u.username = :name")
	public User_ searchByName(@Param("name") String username);

}
