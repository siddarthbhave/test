package com.example.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
// @Data
// @AllArgsConstructor
// @NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long docId;
    private String docName;
    private String specialization;
    private Long patientId;

    public Long getDocId() {
        return docId;
    }
    public void setDocId(Long docId) {
        this.docId = docId;
    }
    public String getDocName() {
        return docName;
    }
    public void setDocName(String docName) {
        this.docName = docName;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public Long getPatientId() {
        return patientId;
    }
    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

}
