package hogwarts.school.repository;

import hogwarts.school.model.Faculty;
import hogwarts.school.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Collection<Student> findByAgeBetween(int min, int max);

    Collection<Student> findByFaculty(Faculty faculty);
}