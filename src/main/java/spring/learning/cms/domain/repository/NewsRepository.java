package spring.learning.cms.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.learning.cms.domain.models.News;

public interface NewsRepository extends JpaRepository<News, String> {


}