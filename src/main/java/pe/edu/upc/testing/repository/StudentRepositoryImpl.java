package pe.edu.upc.testing.repository;

import pe.edu.upc.testing.entity.Student;

public class StudentRepositoryImpl implements StudentRepository{
    @Override
    public Student findById(int id) {
        return new Student(id, "Paterno", "Nombre");
    }
}
