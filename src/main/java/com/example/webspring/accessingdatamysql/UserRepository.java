package com.example.webspring.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Sessions, Integer> {
}
