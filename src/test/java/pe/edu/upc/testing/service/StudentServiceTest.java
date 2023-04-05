package pe.edu.upc.testing.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.listeners.MockitoListener;
import pe.edu.upc.testing.entity.Student;
import pe.edu.upc.testing.repository.StudentRepositoryImpl;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
    @InjectMocks
    private StudentServiceImpl studentService;

    @Mock
    private StudentRepositoryImpl studentRepository;

    @Test
    public void testBuscarPorId(){
        //Preparar: Tipo de dato esperado
        Student espero = new Student(2, "Paterno", "Nombre");
        //Mock: Simular
        Mockito.when(studentRepository.findById(Mockito.anyInt())) //Lo interno
                .thenReturn(new Student(1, "Paterno", "Nombre"));
        //Act
        Student recibo = studentService.buscarPorId(1);

        //Afirmar
        Assertions.assertEquals(espero.getId(), recibo.getId());
        Assertions.assertEquals(espero.getLastName(), recibo.getLastName());
        Assertions.assertEquals(espero.getFirstName(), recibo.getFirstName());
    }
}
