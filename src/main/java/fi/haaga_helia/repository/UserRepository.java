package fi.haaga_helia.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fi.haaga_helia.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
    User findByUsername(String username);

}
