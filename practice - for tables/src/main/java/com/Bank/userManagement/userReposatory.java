package com.Bank.userManagement;

import com.Bank.userManagement.Objects.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

// here we simply use interface as reposatory cause we have to extend it with jpaRepo
// and below we're just writing the <objectName, type of primaryKey we're using>

public interface userReposatory extends JpaRepository <User, Integer>{


}
