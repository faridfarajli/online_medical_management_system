package medical.service;

import lombok.RequiredArgsConstructor;
import medical.entity.Patients;
import medical.repo.PatientRepo;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepo patientRepo;



    public Patients createPatient(Patients patients){
        return patientRepo.save(patients);
    }
    public Patients findPatientBySick(String patients){
        return patientRepo.findByWhichSick(patients);
    }
    public Patients findPatientByName(String patients){
        return patientRepo.findByName(patients);
    }
    public Patients yourFavoriteDoctor(Long id, Patients patients){
        Patients patients1 = patientRepo.findById(id).get();
        patients1.setName(patients.getName());
        patients1.setSurname(patients.getSurname());
        patients1.setAge(patients.getAge());
        patients1.setGender(patients.getGender());
        patients1.setAbout(patients.getAbout());
        patients1.setWhichSick(patients.getWhichSick());
        patients1.setFavoriteDoctor(patients.getFavoriteDoctor());
        patients1.setYourProblem(patients.getYourProblem());
        return  patientRepo.save(patients);

    }



}
