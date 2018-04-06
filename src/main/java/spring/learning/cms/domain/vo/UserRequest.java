package spring.learning.cms.domain.vo;

import lombok.Data;
import spring.learning.cms.domain.models.Role;

@Data
public class UserRequest {
    String identity;
    String name;
    Role role;
}
