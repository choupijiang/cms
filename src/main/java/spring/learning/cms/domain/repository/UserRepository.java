package spring.learning.cms.domain.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import spring.learning.cms.domain.models.User;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
