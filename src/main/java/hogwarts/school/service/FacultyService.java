package hogwarts.school.service;

import hogwarts.school.model.Faculty;
import hogwarts.school.model.Student;

import java.util.Collection;

public interface FacultyService {
    Faculty addFaculty(Faculty faculty);

    Faculty findFaculty(Long id);

    Faculty editFaculty(Long id, Faculty faculty);

    void deleteFaculty(Long id);

    Collection<Faculty> findFacultiesByNameOrColor(String name, String color);

    Faculty getFacultyByStudent(Student student);

    Object getAllFacultyColor(String anyString);

    Object add(Faculty any);

    Object getFacultyByColor(String color);

    Object getFacultyByNameOrColor(String name, String color);
}