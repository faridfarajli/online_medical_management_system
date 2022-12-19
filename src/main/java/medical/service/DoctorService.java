package medical.service;

import lombok.RequiredArgsConstructor;
import medical.entity.Doctor;
import medical.repo.DoctorRepo;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorService {

    private final DoctorRepo doctorRepo;




    public Doctor createDoctor(Doctor doctor){
        return doctorRepo.save(doctor);
    }
    public Doctor findDoctorByEx(String doctor){
        return doctorRepo.findByWhatExpert(doctor);
    }
    public Doctor findDoctorByName(String doctor){
        return doctorRepo.findByName(doctor);
    }




}
