package medical.controller;


import lombok.RequiredArgsConstructor;
import medical.entity.Doctor;
import medical.entity.Patients;
import medical.service.DoctorService;
import medical.service.PatientService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/d")
@RestController
@RequiredArgsConstructor
public class DoctorController {

    private final DoctorService doctorService;


    @PostMapping("/save")
    public Doctor createDoctor(@RequestBody Doctor doctor){
        return doctorService.createDoctor(doctor);
    }
    @GetMapping("/find/{doctor}")
    public Doctor findDoctorByEx(@PathVariable("doctor") String doctor){
        return doctorService.findDoctorByEx(doctor);
    }
    @GetMapping("/find/name/{name}")
    public Doctor findDoctorByName(@PathVariable("name") String name){
        return doctorService.findDoctorByName(name);
    }






}
