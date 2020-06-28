package com.A103_SpringBoot.Repository;

import com.A103_SpringBoot.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
