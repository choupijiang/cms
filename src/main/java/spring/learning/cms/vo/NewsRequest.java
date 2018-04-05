package spring.learning.cms.vo;

import lombok.Data;
import spring.learning.cms.models.Category;
import spring.learning.cms.models.Tag;

import java.util.Set;

@Data
public class NewsRequest {
    String title;

    String content;

    Set<Category> categories;

    Set<Tag> tags;
}
