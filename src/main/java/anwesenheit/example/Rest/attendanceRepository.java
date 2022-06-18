package anwesenheit.example.Rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface attendanceRepository extends JpaRepository<attendanceEntity, Integer> {
    List<attendanceEntity> findByUserid(int user_id);
}