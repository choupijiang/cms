package spring.learning.cms.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.learning.cms.domain.exceptions.CategoryNotFoundException;
import spring.learning.cms.domain.models.Category;
import spring.learning.cms.domain.repository.CategoryRepository;
import spring.learning.cms.domain.vo.CategoryRequest;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional(readOnly = true)
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Transactional
    public Category update(Category category) {
        return this.categoryRepository.save(category);
    }

    @Transactional
    public Category create(CategoryRequest request) {
        Category category = new Category();
        category.setId(UUID.randomUUID().toString());
        category.setName(request.getName());
        return this.categoryRepository.save(category);
    }

    @Transactional
    public void delete(String id) {
        final Optional<Category> category = this.categoryRepository.findById(id);
        category.ifPresent(this.categoryRepository::delete);
    }

    public List<Category> findAll() {
        return this.categoryRepository.findAll();
    }
 

    public Category findOne(String id) {
        final Optional<Category> category = this.categoryRepository.findById(id);
        if (category.isPresent()) {
            return category.get();
        } else {
            throw new CategoryNotFoundException(id);
        }
    }

}
