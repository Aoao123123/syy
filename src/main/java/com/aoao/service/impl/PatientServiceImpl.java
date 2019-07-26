package com.aoao.service.impl;

import com.aoao.dao.IPatientDao;
import com.aoao.domain.PatientLv1;
import com.aoao.domain.PatientLv2;
import com.aoao.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 業務層實現類
 * 事務控制應該都在業務層
 */

@Service("accountService")
public class PatientServiceImpl implements IPatientService {

    @Autowired
    private IPatientDao patientDao;


    @Override
    public List<Integer> findAllPatientNumber() {
        return patientDao.findAllPatientNumber();
    }

    @Override
    public PatientLv1 findPatientByPatientNumber(Integer patient_number_lv1) {
        PatientLv1 patient = patientDao.findPatientByPatientNumber(patient_number_lv1);
        return patient;
    }

    @Override
    public String updatePatientLv1Info(PatientLv1 patientLv1) {
        if (patientLv1.getPatient_number_lv1() == 0){
            return "incoming patient_number_lv1 is null";
        }

        List<Integer> listPatientNumber = findAllPatientNumber();
        if (!listPatientNumber.contains(patientLv1.getPatient_number_lv1())){
            return "This patient doesn't exist";
        }

        patientDao.updatePatientLv1Info(patientLv1);
        return "A recording in patient_lv1 is updated successfully";
    }

    @Override
    public String insertPatientLv1Info(PatientLv1 patientLv1) {
        if (patientLv1.getPatient_number_lv1() == 0 || patientLv1.getName() == null){
            return "incoming patient_number_lv1 or name is null";
        }

        patientDao.insertPatientLv1Info(patientLv1);
        System.out.println("病人一級表新增記錄成功");
        return "A recording in patient_lv1 is inserted successfully";
    }

    @Override
    public String updatePatientLv2Info(PatientLv2 patientLv2) {
        if (patientLv2.getPatient_number_lv2() == 0 || patientLv2.getRepresent() == null){
            return "incoming patient_number_lv2 or represent is null";
        }

        List<Integer> listPatientNumber = findAllPatientNumber();
        if (!listPatientNumber.contains(patientLv2.getPatient_number_lv2())){
            return "This patient doesn't exist";
        }

        patientDao.updatePatientLv2Info(patientLv2);
        return "A recording in patient_lv2 is updated successfully";
    }

    @Override
    public String insertPatientLv2Info(PatientLv2 patientLv2) {
        if (patientLv2.getPatient_number_lv2() == 0 || patientLv2.getRepresent() == null
            || patientLv2.getCheckbox_binary() == null){
            return "patient_number_lv2,represent or checkbox_binary is null";
        }

        patientDao.insertPatientLv2Info(patientLv2);
        return "The record is inserted successfully in patient_lv2 ";
    }

    @Override
    public String deletePatientLv2Info(PatientLv2 patientLv2) {
        if (patientLv2.getPatient_number_lv2() == 0 || patientLv2.getRepresent() == null){
            return "incoming patient_number_lv2 or represent is null";
        }

        List<Integer> listPatientNumber = findAllPatientNumber();
        if (!listPatientNumber.contains(patientLv2.getPatient_number_lv2())){
            return "This patient doesn't exist";
        }

        patientDao.deletePatientLv2Info(patientLv2);
        return "The record is deleted successfully from patient_lv2";
    }

    @Override
    public String deletePatientLv2InfoWithPatientNumber(PatientLv2 patientLv2) {
        if (patientLv2.getPatient_number_lv2() == 0){
            System.out.println("病人二級表按住院號刪除時未傳入patient_number_lv2");
            return "incoming patient_number_lv2 is null";
        }

        List<Integer> listPatientNumber = findAllPatientNumber();
        if (!listPatientNumber.contains(patientLv2.getPatient_number_lv2())){
            return "This patient doesn't exist";
        }

        patientDao.deletePatientLv2InfoWithPatientNumber(patientLv2);
        System.out.println("病人二級表按住院號刪除成功");
        return "The recordings are successfully deleted from patient_lv2 according to the patient number";
    }
}
