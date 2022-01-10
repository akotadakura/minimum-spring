package info.akotadakura.sample.repositories;

import info.akotadakura.sample.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
