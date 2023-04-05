package pe.edu.upc.testing.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import pe.edu.upc.testing.entity.Student;

@ExtendWith(MockitoExtension.class)
public class StudentRepositoryTest {

    @InjectMocks
    private StudentRepositoryImpl studentRepository;

    @Test
    public void testFindById(){
        //Preparar. probar a cambiar los parametros para comprobar que detecta desigualdad
        Student espero = new Student(12, "Paterno", "Nombre");
        //Actuar
        Student recibo = studentRepository.findById(12);
        //Afirmar
        Assertions.assertEquals(espero.getId(), recibo.getId());
        Assertions.assertEquals(espero.getLastName(), recibo.getLastName());
        Assertions.assertEquals(espero.getFirstName(), recibo.getFirstName());
    }
}
