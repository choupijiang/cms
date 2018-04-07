package spring.learning.cms.domain.service;

import org.springframework.stereotype.Service;
import spring.learning.cms.domain.repository.NewsRepository;

@Service
public class NewsService {
    private final NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepository){
        this.newsRepository = newsRepository;
    }
}
