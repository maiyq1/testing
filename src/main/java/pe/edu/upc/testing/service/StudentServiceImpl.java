package pe.edu.upc.testing.service;

import lombok.AllArgsConstructor;
import pe.edu.upc.testing.entity.Student;
import pe.edu.upc.testing.repository.StudentRepository;

@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    /*Inyeccion de dependencias: Sin Lombok
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    */
    @Override
    public Student buscarPorId(int id) {
        return studentRepository.findById(id);
    }
}
