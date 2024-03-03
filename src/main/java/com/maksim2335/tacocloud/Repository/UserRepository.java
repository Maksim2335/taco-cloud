package com.maksim2335.tacocloud.Repository;

import com.maksim2335.tacocloud.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
