package pack.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pack.main.entity.Remind;

public interface RemindRepository extends JpaRepository<Remind, Long> {
}

