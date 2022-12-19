package medical.repo;


import medical.entity.Patients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patients,Long> {
    Patients findByWhichSick(String patients);

    Patients findByName(String patients);


}
