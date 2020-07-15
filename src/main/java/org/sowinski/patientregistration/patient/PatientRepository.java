package org.sowinski.patientregistration.patient;

import org.springframework.data.jpa.repository.JpaRepository;
// pozwala na używanie podstawowych metod
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
