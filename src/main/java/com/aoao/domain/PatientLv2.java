package com.aoao.domain;

import java.io.Serializable;

public class PatientLv2 implements Serializable {

    private String patient_number_lv2;
    private String checkbox_binary;
    private String remark;
    private String represent;

    public String getPatient_number_lv2() {
        return patient_number_lv2;
    }

    public void setPatient_number_lv2(String patient_number_lv2) {
        this.patient_number_lv2 = patient_number_lv2;
    }

    public String getCheckbox_binary() {
        return checkbox_binary;
    }

    public void setCheckbox_binary(String checkbox_binary) {
        this.checkbox_binary = checkbox_binary;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRepresent() {
        return represent;
    }

    public void setRepresent(String represent) {
        this.represent = represent;
    }

    @Override
    public String toString() {
        return "PatientLv2{" +
                "patient_number_lv2='" + patient_number_lv2 + '\'' +
                ", checkbox_binary='" + checkbox_binary + '\'' +
                ", remark='" + remark + '\'' +
                ", represent='" + represent + '\'' +
                '}';
    }
}
