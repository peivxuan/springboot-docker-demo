package com.docker.repository;

import com.docker.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Description：enter your comment
 * Created by Peivxuan on 2017/4/15.
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
