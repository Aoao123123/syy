package com.aoao.service.impl;

import com.aoao.dao.IPatientDao;
import com.aoao.domain.PatientLv1;
import com.aoao.domain.PatientLv2;
import com.aoao.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 業務層實現類
 * 事務控制應該都在業務層
 */

@Service("accountService")
public class PatientServiceImpl implements IPatientService {

    @Autowired
    private IPatientDao patientDao;

    @Override
    public PatientLv1 findPatientByPatientNumber(String patient_number_lv1) {
        PatientLv1 patient = patientDao.findPatientByPatientNumber(patient_number_lv1);
        return patient;
    }

    @Override
    public void updatePatientLv1Info(PatientLv1 patientLv1) {
        if (patientLv1.getPatient_number_lv1() == null){
            System.out.println("病人一級表更新時未傳入patient_number_lv1");
            return;
        }

        patientDao.updatePatientLv1Info(patientLv1);
        System.out.println("病人一級表更新記錄成功");
    }

    @Override
    public void insertPatientLv1Info(PatientLv1 patientLv1) {
        if (patientLv1.getPatient_number_lv1() == null && patientLv1.getName() == null){
            System.out.println("病人一級表新增記錄時未傳入patient_number_lv1和name");
            return;
        }

        patientDao.insertPatientLv1Info(patientLv1);
        System.out.println("病人一級表新增記錄成功");
    }

    @Override
    public void updatePatientLv2Info(PatientLv2 patientLv2) {
        if (patientLv2.getPatient_number_lv2() == null && patientLv2.getRepresent() == null){
            System.out.println("病人二級表更新記錄時未傳入patient_number_lv2和represent");
            return;
        }

        patientDao.updatePatientLv2Info(patientLv2);
        System.out.println("病人二級表更新記錄成功");
    }

    @Override
    public void insertPatientLv2Info(PatientLv2 patientLv2) {
        if ((patientLv2.getPatient_number_lv2() == null && patientLv2.getRepresent() == null)
            || patientLv2.getCheckbox_binary() == null){
            System.out.println("病人二級表新增記錄時未傳入patient_number_lv2,represent或checkbox_binary");
            return;
        }

        patientDao.insertPatientLv2Info(patientLv2);
        System.out.println("病人二級表新增記錄成功");
    }

    @Override
    public void deletePatientLv2Info(PatientLv2 patientLv2) {
        if (patientLv2.getPatient_number_lv2() == null && patientLv2.getRepresent() == null){
            System.out.println("病人二級表刪除記錄時未傳入patient_number_lv2和represent");
            return;
        }

        patientDao.deletePatientLv2Info(patientLv2);
        System.out.println("病人二級表刪除記錄成功");
    }
}
