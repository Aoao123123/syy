package com.aoao.controller;

import com.aoao.domain.PatientLv1;
import com.aoao.domain.PatientLv2;
import com.aoao.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 表現層
 */
@Controller
@RequestMapping(path = "/patient")
public class PatientController {

    @Autowired
    private IPatientService patientService;

    @RequestMapping(path = "/findByPatientNumber")
    public @ResponseBody PatientLv1 findPatientByPatientNumber(String patient_number_lv1){
        PatientLv1 patient = patientService.findPatientByPatientNumber(patient_number_lv1);
        System.out.println(patient);
        return patient;
    }

    @RequestMapping(path = "/updatePatientLv1")
    public @ResponseBody boolean updatePatientLv1Info(PatientLv1 patientLv1){
        System.out.println("病人的一級表更新記錄....");
        if (patientLv1.getPatient_number_lv1() == null){
            System.out.println("病人一級表更新記錄時未傳入patient_number_lv1");
            return false;
        }

        patientService.updatePatientLv1Info(patientLv1);
        return true;
    }

    @RequestMapping(path = "/insertPatientLv1")
    public @ResponseBody boolean insertPatientLv1Info(PatientLv1 patientLv1){
        System.out.println("病人的一級表新增記錄....");
        if (patientLv1.getPatient_number_lv1() == null && patientLv1.getName() == null){
            System.out.println("病人的一級表更新記錄時未傳入patient_number_lv1和name");
            return false;
        }

        patientService.insertPatientLv1Info(patientLv1);
        return true;
    }

    @RequestMapping(path = "/updatePatientLv2")
    public @ResponseBody boolean updatePatientLv2Info(PatientLv2 patientLv2){
        System.out.println("病人的二級表更新記錄....");
        if (patientLv2.getPatient_number_lv2() == null && patientLv2.getRepresent() == null){
            System.out.println("病人二級表更新記錄時未傳入patient_number_lv2或represent");
            return false;
        }

        patientService.updatePatientLv2Info(patientLv2);
        return true;
    }

    @RequestMapping(path = "/insertPatientLv2")
    public @ResponseBody boolean insertPatientLv2Info(PatientLv2 patientLv2){
        System.out.println("病人的二級表新增記錄....");
        if ((patientLv2.getPatient_number_lv2() == null && patientLv2.getRepresent() == null)
                || patientLv2.getCheckbox_binary() == null){
            System.out.println("病人二級表新增記錄時未傳入patient_number_lv2,checkbox_binary或represent");
            return false;
        }

        patientService.insertPatientLv2Info(patientLv2);
        return true;
    }

    @RequestMapping(path = "/deletePatientLv2")
    public @ResponseBody boolean deletePatientLv2Info(PatientLv2 patientLv2){
        System.out.println("病人的二級表刪除記錄....");
        if (patientLv2.getPatient_number_lv2() == null && patientLv2.getRepresent() == null){
            System.out.println("病人二級表刪除記錄時未傳入patient_number_lv2或represent");
            return false;
        }

        patientService.deletePatientLv2Info(patientLv2);
        return true;
    }
}
