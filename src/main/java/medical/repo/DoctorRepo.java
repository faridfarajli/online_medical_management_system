package medical.repo;

import medical.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<Doctor,Long> {
     Doctor findByWhatExpert(String doctor);
     Doctor findByName(String doctor);


}
