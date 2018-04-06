package spring.learning.cms.domain.vo;

import lombok.Data;
import spring.learning.cms.domain.models.Category;
import spring.learning.cms.domain.models.Tag;


import java.util.Set;

@Data
public class NewsRequest {
    String title;

    String content;

    Set<Category> categories;

    Set<Tag> tags;
}
