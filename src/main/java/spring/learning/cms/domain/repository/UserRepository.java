package spring.learning.cms.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import spring.learning.cms.domain.models.User;

public interface UserRepository extends MongoRepository<User, String> {
}
