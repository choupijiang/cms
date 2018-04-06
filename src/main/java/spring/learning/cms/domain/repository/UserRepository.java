package spring.learning.cms.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.learning.cms.domain.models.User;

public interface UserRepository extends JpaRepository<User, String> {
}
