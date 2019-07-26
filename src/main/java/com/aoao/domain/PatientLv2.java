package com.aoao.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class PatientLv2 implements Serializable {

    private int patient_number_lv2;
    private String checkbox_binary;
    private String remark;
    private String represent;
}
