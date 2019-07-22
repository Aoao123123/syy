package com.aoao.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PatientLv1 implements Serializable {

    private String patient_number_lv1;
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
    private int na;
    private double k;
    private int cl;
    private double wbc;
    private int hb;
    private int plts;
    private double pt;
    private double aptt;
    private double bun;
    private int creat;
    private int tbil;
    private int ast;
    private int alt;
    private double glu;
    private String result_binary;
    private String lv1_binary;
    private String lv2_binary;
    private String firstAssessDoc;
    private Date firstAssessDate;
    private String secondAssessDoc;
    private Date secondAssessDate;

    private List<PatientLv2> patientLv2List;

    public String getPatient_number_lv1() {
        return patient_number_lv1;
    }

    public void setPatient_number_lv1(String patient_number_lv1) {
        this.patient_number_lv1 = patient_number_lv1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBed_number() {
        return bed_number;
    }

    public void setBed_number(String bed_number) {
        this.bed_number = bed_number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSbp() {
        return sbp;
    }

    public void setSbp(int sbp) {
        this.sbp = sbp;
    }

    public int getDbp() {
        return dbp;
    }

    public void setDbp(int dbp) {
        this.dbp = dbp;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public double getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public String getPre_diagnose() {
        return pre_diagnose;
    }

    public void setPre_diagnose(String pre_diagnose) {
        this.pre_diagnose = pre_diagnose;
    }

    public String getAssume() {
        return assume;
    }

    public void setAssume(String assume) {
        this.assume = assume;
    }

    public String getChief_complaint() {
        return chief_complaint;
    }

    public void setChief_complaint(String chief_complaint) {
        this.chief_complaint = chief_complaint;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public int getNa() {
        return na;
    }

    public void setNa(int na) {
        this.na = na;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public int getCl() {
        return cl;
    }

    public void setCl(int cl) {
        this.cl = cl;
    }

    public double getWbc() {
        return wbc;
    }

    public void setWbc(double wbc) {
        this.wbc = wbc;
    }

    public int getHb() {
        return hb;
    }

    public void setHb(int hb) {
        this.hb = hb;
    }

    public int getPlts() {
        return plts;
    }

    public void setPlts(int plts) {
        this.plts = plts;
    }

    public double getPt() {
        return pt;
    }

    public void setPt(double pt) {
        this.pt = pt;
    }

    public double getAptt() {
        return aptt;
    }

    public void setAptt(double aptt) {
        this.aptt = aptt;
    }

    public double getBun() {
        return bun;
    }

    public void setBun(double bun) {
        this.bun = bun;
    }

    public int getCreat() {
        return creat;
    }

    public void setCreat(int creat) {
        this.creat = creat;
    }

    public int getTbil() {
        return tbil;
    }

    public void setTbil(int tbil) {
        this.tbil = tbil;
    }

    public int getAst() {
        return ast;
    }

    public void setAst(int ast) {
        this.ast = ast;
    }

    public int getAlt() {
        return alt;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }

    public double getGlu() {
        return glu;
    }

    public void setGlu(double glu) {
        this.glu = glu;
    }

    public String getResult_binary() {
        return result_binary;
    }

    public void setResult_binary(String result_binary) {
        this.result_binary = result_binary;
    }

    public String getLv1_binary() {
        return lv1_binary;
    }

    public void setLv1_binary(String lv1_binary) {
        this.lv1_binary = lv1_binary;
    }

    public String getLv2_binary() {
        return lv2_binary;
    }

    public void setLv2_binary(String lv2_binary) {
        this.lv2_binary = lv2_binary;
    }

    public List<PatientLv2> getPatientLv2List() {
        return patientLv2List;
    }

    public void setPatientLv2List(List<PatientLv2> patientLv2List) {
        this.patientLv2List = patientLv2List;
    }

    public String getFirstAssessDoc() {
        return firstAssessDoc;
    }

    public void setFirstAssessDoc(String firstAssessDoc) {
        this.firstAssessDoc = firstAssessDoc;
    }

    public Date getFirstAssessDate() {
        return firstAssessDate;
    }

    public void setFirstAssessDate(Date firstAssessDate) {
        this.firstAssessDate = firstAssessDate;
    }

    public String getSecondAssessDoc() {
        return secondAssessDoc;
    }

    public void setSecondAssessDoc(String secondAssessDoc) {
        this.secondAssessDoc = secondAssessDoc;
    }

    public Date getSecondAssessDate() {
        return secondAssessDate;
    }

    public void setSecondAssessDate(Date secondAssessDate) {
        this.secondAssessDate = secondAssessDate;
    }

    @Override
    public String toString() {
        return "PatientLv1{" +
                "patient_number_lv1='" + patient_number_lv1 + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", bed_number='" + bed_number + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", sbp=" + sbp +
                ", dbp=" + dbp +
                ", r=" + r +
                ", p=" + p +
                ", t=" + t +
                ", na=" + na +
                ", k=" + k +
                ", cl=" + cl +
                ", wbc=" + wbc +
                ", hb=" + hb +
                ", plts=" + plts +
                ", pt=" + pt +
                ", aptt=" + aptt +
                ", bun=" + bun +
                ", creat=" + creat +
                ", tbil=" + tbil +
                ", ast=" + ast +
                ", alt=" + alt +
                ", glu=" + glu +
                ", result_binary='" + result_binary + '\'' +
                ", lv1_binary='" + lv1_binary + '\'' +
                ", lv2_binary='" + lv2_binary + '\'' +
                ", firstAssessDoc='" + firstAssessDoc + '\'' +
                ", firstAssessDate=" + firstAssessDate +
                ", secondAssessDoc='" + secondAssessDoc + '\'' +
                ", secondAssessDate=" + secondAssessDate +
                ", patientLv2List=" + patientLv2List +
                '}';
    }
}
