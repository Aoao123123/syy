package com.aoao.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class PatientLv1 implements Serializable {

    private int patient_number_lv1;
    private String name;
    private String department;
    private String bed_number;
    private int age;
    private String gender;
    private int height;
    private double weight;
    private int sbp;
    private int dbp;
    private int r;
    private int p;
    private double t;
    private String pre_diagnose;
    private String assume;
    private String chief_complaint;
    private String others;
    private double na;
    private double k;
    private double cl;
    private double wbc;
    private int hb;
    private int plts;
    private double pt;
    private double aptt;
    private double bun;
    private double creat;
    private double co2;
    private double tp;
    private double alb;
    private int ast;
    private int alt;
    private double glu;
    private String result_binary;
    private String reason;
    private String lv1_binary;
    private String lv2_binary;
    private String firstAssessDoc;
    private Date firstAssessDate;
    private String secondAssessDoc;
    private Date secondAssessDate;

    private PatientLv2X patientLv2X;
}
