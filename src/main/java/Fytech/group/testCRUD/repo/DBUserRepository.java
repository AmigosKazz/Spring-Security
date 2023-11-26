package Fytech.group.testCRUD.repo;

import Fytech.group.testCRUD.model.DBUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DBUserRepository extends JpaRepository <DBUser, Long> {

    public DBUser findByUsername(String username);
}
