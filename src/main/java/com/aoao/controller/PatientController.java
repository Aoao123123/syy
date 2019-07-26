package com.aoao.controller;

import com.aoao.domain.PatientLv1;
import com.aoao.domain.PatientLv2;
import com.aoao.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 表現層
 */
@Controller
@RequestMapping(path = "/patient")
public class PatientController {

    @Autowired
    private IPatientService patientService;

    @RequestMapping(path = "/findAllPatientNumber")
    public @ResponseBody List<Integer> findAllPatientNumber(){
        return patientService.findAllPatientNumber();
    }

    @RequestMapping(path = "/findByPatientNumber")
    public @ResponseBody PatientLv1 findPatientByPatientNumber(Integer patient_number_lv1){
        PatientLv1 patient = patientService.findPatientByPatientNumber(patient_number_lv1);
        System.out.println(patient);
        return patient;
    }

    @RequestMapping(path = "/updatePatientLv1")
    public @ResponseBody String updatePatientLv1Info(PatientLv1 patientLv1){
        System.out.println("病人的一級表更新記錄....");
        return patientService.updatePatientLv1Info(patientLv1);
    }

    @RequestMapping(path = "/insertPatientLv1")
    public @ResponseBody String insertPatientLv1Info(PatientLv1 patientLv1){
        System.out.println("病人的一級表新增記錄....");
        return patientService.insertPatientLv1Info(patientLv1);
    }

    @RequestMapping(path = "/updatePatientLv2")
    public @ResponseBody String updatePatientLv2Info(PatientLv2 patientLv2){
        System.out.println("病人的二級表更新記錄....");
        return patientService.updatePatientLv2Info(patientLv2);
    }

    @RequestMapping(path = "/insertPatientLv2")
    public @ResponseBody String insertPatientLv2Info(PatientLv2 patientLv2){
        System.out.println("病人的二級表新增記錄....");
        return patientService.insertPatientLv2Info(patientLv2);
    }

    @RequestMapping(path = "/deletePatientLv2")
    public @ResponseBody String deletePatientLv2Info(PatientLv2 patientLv2){
        System.out.println("病人的二級表刪除記錄....");
        return patientService.deletePatientLv2Info(patientLv2);
    }

    @RequestMapping(path = "/deletePatientLv2ByPatientNumber")
    public @ResponseBody String deletePatientLv2InfoWithPatientNumber(PatientLv2 patientLv2) {
        System.out.println("病人的二級表按住院號刪除記錄....");
        return patientService.deletePatientLv2InfoWithPatientNumber(patientLv2);
    }
}
