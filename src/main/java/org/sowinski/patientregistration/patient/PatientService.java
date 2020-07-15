package org.sowinski.patientregistration.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired // pozwala wstrzyknąć zależności
    private PatientRepository patientRepository;


    public List<Patient>  getPatients(){

        return patientRepository.findAll();

    }
}
