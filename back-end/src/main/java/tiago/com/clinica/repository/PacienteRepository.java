package tiago.com.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tiago.com.clinica.model.paciente.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
