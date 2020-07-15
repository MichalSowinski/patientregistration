package org.sowinski.patientregistration.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InItData implements CommandLineRunner {
    @Autowired
   private PatientRepository patientRepository;

    @Override
    public void run(String... args) throws Exception {
        Patient patient = new Patient("Jan","Kowalski","Opis",25,false);
        patientRepository.save(patient);



    }
}
