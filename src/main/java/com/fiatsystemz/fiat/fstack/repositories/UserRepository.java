package com.fiatsystemz.fiat.fstack.repositories;

import com.fiatsystemz.fiat.fstack.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
