package com.aoao.service.impl;

import com.aoao.dao.IPatientDao;
import com.aoao.domain.*;
import com.aoao.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 業務層實現類
 * 事務控制應該都在業務層
 */

@Service("patientService")
public class PatientServiceImpl implements IPatientService {

    @Autowired
    private IPatientDao patientDao;


    @Override
    public List<Integer> findAllPatientNumber() {
        return patientDao.findAllPatientNumber();
    }

    @Override
    public List<Integer> findAllDiagnosedPatientNumber() {
        return patientDao.findAllDiagnosedPatientNumber();
    }

    @Override
    public PatientLv1 findPatientByPatientNumber(Integer patient_number_lv1) {
        if (patient_number_lv1 == 0){
            return null;
        }

        return patientDao.findPatientByPatientNumber(patient_number_lv1);
    }

    @Override
    public int updatePatientLv1Info(PatientLv1 patientLv1) {
        if (patientLv1.getPatient_number_lv1() == 0){
            return -2;
        }

        List<Integer> listPatientNumber = findAllPatientNumber();
        if (!listPatientNumber.contains(patientLv1.getPatient_number_lv1())){
            return -1;
        }

        patientDao.updatePatientLv1Info(patientLv1);
        return 0;
    }

//    @Override
//    public String insertPatientLv1Info(PatientLv1 patientLv1) {
//        if (patientLv1.getPatient_number_lv1() == 0 || patientLv1.getName() == null){
//            return "incoming patient_number_lv1 or name is null";
//        }
//
//        patientDao.insertPatientLv1Info(patientLv1);
//        System.out.println("病人一級表新增記錄成功");
//        return "A recording in patient_lv1 is inserted successfully";
//    }

    @Override
    public int updatePatientLv2Info(PatientLv2X patientLv2) {
        if (patientLv2.getPatient_number_lv2() == 0){
            return -2;
        }

        List<Integer> listDiagnosedPatientNumber = findAllDiagnosedPatientNumber();
        if (!listDiagnosedPatientNumber.contains(patientLv2.getPatient_number_lv2())){
            return -1;
        }

        patientDao.updatePatientLv2Info(patientLv2);
        return 0;
    }

    @Override
    public int insertPatientLv2Info(PatientLv2X patientLv2) {
        if (patientLv2.getPatient_number_lv2() == 0){
            return -2;
        }

        List<Integer> listDiagnosedPatientNumber = findAllDiagnosedPatientNumber();
        if (listDiagnosedPatientNumber.contains(patientLv2.getPatient_number_lv2())){
            return -1;
        }

        patientDao.insertPatientLv2Info(patientLv2);
        return 0;
    }
//
//    @Override
//    public String deletePatientLv2Info(PatientLv2 patientLv2) {
//        if (patientLv2.getPatient_number_lv2() == 0 || patientLv2.getRepresent() == null){
//            return "incoming patient_number_lv2 or represent is null";
//        }
//
//        List<Integer> listPatientNumber = findAllPatientNumber();
//        List<PatientLv2> listAllAccessRecords = findAllAssessRecords();
//        if (!listPatientNumber.contains(patientLv2.getPatient_number_lv2())){
//            return "This patient doesn't exist";
//        }
//        if (!listAllAccessRecords.contains(patientLv2)){
//            return "The assess record of the patient has already been deleted";
//        }
//
//        patientDao.deletePatientLv2Info(patientLv2);
//        return "The record is deleted successfully from patient_lv2";
//    }

    @Override
    public List<Suggestion> findSuggestionBySuggestionId(SuggestionIdList suggestionIdList) {

        return patientDao.findSuggestionBySuggestionId(suggestionIdList.getSuggestionIdList());
    }

    @Override
    public PatientLv2X findX(Integer patient_number_lv2) {
        return patientDao.findX(patient_number_lv2);
    }
}
