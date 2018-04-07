package spring.learning.cms.domain.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import spring.learning.cms.domain.models.News;

public interface NewsRepository extends ReactiveMongoRepository<News, String> {


}