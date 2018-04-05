package spring.learning.cms.vo;

import lombok.Data;
import spring.learning.cms.models.Role;

@Data
public class UserRequest {
    String identity;
    String name;
    Role role;
}
