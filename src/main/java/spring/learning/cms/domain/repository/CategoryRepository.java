package spring.learning.cms.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import spring.learning.cms.domain.models.Category;

public interface CategoryRepository extends MongoRepository<Category, String>{}