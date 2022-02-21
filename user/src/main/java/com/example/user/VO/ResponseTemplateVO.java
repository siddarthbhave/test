package com.example.user.VO;

import com.example.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private User doctor;
    private Visa patient;

    public User getDoctor() {
        return doctor;
    }
    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }
    public Visa getPatient() {
        return patient;
    }
    public void setPatient(Visa patient) {
        this.patient = patient;
    }
}