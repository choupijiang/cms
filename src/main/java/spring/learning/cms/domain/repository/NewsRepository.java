package spring.learning.cms.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import spring.learning.cms.domain.models.News;

public interface NewsRepository extends MongoRepository<News, String> {


}