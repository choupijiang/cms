package spring.learning.cms.domain.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import spring.learning.cms.domain.models.Category;

public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {}