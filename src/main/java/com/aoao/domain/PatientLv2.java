package com.aoao.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class PatientLv2 implements Serializable {

    private int patient_number_lv2;
    private String checkbox_binary;
    private String remark;
    private String represent;

    @Override
    public boolean equals(Object o) {
        PatientLv2 patientLv2 = (PatientLv2) o;
        return patient_number_lv2 == patientLv2.getPatient_number_lv2()
                && represent.equals(patientLv2.getRepresent());
    }
}
