package medical.controller;


import lombok.RequiredArgsConstructor;
import medical.entity.Patients;
import medical.service.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/p")
@RestController
@RequiredArgsConstructor
public class PatientController {

    private final PatientService patientService;



    @PostMapping("/save")
    public Patients createPatient(@RequestBody Patients patients){
        return patientService.createPatient(patients);
    }
    @GetMapping("/find/{patient}")
    public Patients findPatientBySick(@PathVariable("patient") String patients){
        return patientService.findPatientBySick(patients);

    }
    @GetMapping("/find/name/{name}")
    public Patients findPatientByName(@PathVariable("name") String name){
        return patientService.findPatientByName(name);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Patients> yourFavoriteDoctor(@PathVariable("id") Long id,
                                                         @RequestBody Patients patients){
         patients = patientService.yourFavoriteDoctor(id,patients);
        return ResponseEntity.ok(patients);
    }



}
