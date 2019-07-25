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
    public @ResponseBody List<String>  findAllPatientNumber(){
        return patientService.findAllPatientNumber();
    }

    @RequestMapping(path = "/findByPatientNumber")
    public @ResponseBody PatientLv1 findPatientByPatientNumber(String patient_number_lv1){
        PatientLv1 patient = patientService.findPatientByPatientNumber(patient_number_lv1);
        System.out.println(patient);
        return patient;
    }

    @RequestMapping(path = "/updatePatientLv1")
    public @ResponseBody String updatePatientLv1Info(PatientLv1 patientLv1){
        System.out.println("病人的一級表更新記錄....");
        if (patientLv1.getPatient_number_lv1() == 0){
            return "incoming patient_number_lv1 is null";
        }

        List<String> listPatientNumber = findAllPatientNumber();
        if (!listPatientNumber.contains(patientLv1.getPatient_number_lv1())){
            return "This patient doesn't exist";
        }

        patientService.updatePatientLv1Info(patientLv1);
        return "A recording in patient_lv1 is updated successfully";
    }

    @RequestMapping(path = "/insertPatientLv1")
    public @ResponseBody String insertPatientLv1Info(PatientLv1 patientLv1){
        System.out.println("病人的一級表新增記錄....");
        if (patientLv1.getPatient_number_lv1() == 0 || patientLv1.getName() == null){
            return "incoming patient_number_lv1 or name is null";
        }

        patientService.insertPatientLv1Info(patientLv1);
        return "A recording in patient_lv1 is inserted successfully";
    }

    @RequestMapping(path = "/updatePatientLv2")
    public @ResponseBody String updatePatientLv2Info(PatientLv2 patientLv2){
        System.out.println("病人的二級表更新記錄....");
        if (patientLv2.getPatient_number_lv2() == 0 || patientLv2.getRepresent() == null){
            return "incoming patient_number_lv2 or represent is null";
        }

        List<String> listPatientNumber = findAllPatientNumber();
        if (!listPatientNumber.contains(patientLv2.getPatient_number_lv2())){
            return "This patient doesn't exist";
        }

        patientService.updatePatientLv2Info(patientLv2);
        return "A recording in patient_lv2 is updated successfully";
    }

    @RequestMapping(path = "/insertPatientLv2")
    public @ResponseBody String insertPatientLv2Info(PatientLv2 patientLv2){
        System.out.println("病人的二級表新增記錄....");
        if (patientLv2.getPatient_number_lv2() == 0 || patientLv2.getRepresent() == null
                || patientLv2.getCheckbox_binary() == null){
            return "patient_number_lv2,represent or checkbox_binary is null";
        }

        patientService.insertPatientLv2Info(patientLv2);
        return "The record is inserted successfully in patient_lv2 ";
    }

    @RequestMapping(path = "/deletePatientLv2")
    public @ResponseBody String deletePatientLv2Info(PatientLv2 patientLv2){
        System.out.println("病人的二級表刪除記錄....");
        if (patientLv2.getPatient_number_lv2() == 0 || patientLv2.getRepresent() == null){
            return "incoming patient_number_lv2 or represent is null";
        }

        List<String> listPatientNumber = findAllPatientNumber();
        if (!listPatientNumber.contains(patientLv2.getPatient_number_lv2())){
            return "This patient doesn't exist";
        }

        patientService.deletePatientLv2Info(patientLv2);
        return "The record is deleted successfully from patient_lv2";
    }

    @RequestMapping(path = "/deletePatientLv2ByPatientNumber")
    public @ResponseBody String deletePatientLv2InfoWithPatientNumber(PatientLv2 patientLv2) {
        System.out.println("病人的二級表按住院號刪除記錄....");
        if (patientLv2.getPatient_number_lv2() == 0){
            return "incoming patient_number_lv2 is null";
        }

        List<String> listPatientNumber = findAllPatientNumber();
        if (!listPatientNumber.contains(patientLv2.getPatient_number_lv2())){
            return "This patient doesn't exist";
        }

        patientService.deletePatientLv2InfoWithPatientNumber(patientLv2);
        return "The recordings are successfully deleted from patient_lv2 according to the patient number";
    }
}
