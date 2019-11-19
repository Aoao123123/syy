package com.aoao.controller;

import com.aoao.domain.*;
import com.aoao.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
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
    public @ResponseBody int updatePatientLv1Info(PatientLv1 patientLv1){
        System.out.println("病人的一級表更新記錄....");
        return patientService.updatePatientLv1Info(patientLv1);
    }

//    @RequestMapping(path = "/insertPatientLv1")
//    public @ResponseBody String insertPatientLv1Info(PatientLv1 patientLv1){
//        System.out.println("病人的一級表新增記錄....");
//        return patientService.insertPatientLv1Info(patientLv1);
//    }

    @RequestMapping(path = "/updatePatientLv2")
    public @ResponseBody int updatePatientLv2Info(PatientLv2X patientLv2){
        System.out.println("病人的二級表更新記錄....");
        return patientService.updatePatientLv2Info(patientLv2);
    }

    @RequestMapping(path = "/insertPatientLv2")
    public @ResponseBody int insertPatientLv2Info(PatientLv2X patientLv2){
        System.out.println("病人的二級表新增記錄....");
        return patientService.insertPatientLv2Info(patientLv2);
    }

//    @RequestMapping(path = "/deletePatientLv2")
//    public @ResponseBody String deletePatientLv2Info(PatientLv2 patientLv2){
//        System.out.println("病人的二級表刪除記錄....");
//        return patientService.deletePatientLv2Info(patientLv2);
//    }

    @RequestMapping(path = "/findSuggestion")
    public @ResponseBody List<Suggestion> findSuggestionBySuggestionId(SuggestionIdList suggestionIdList){
        System.out.println("查詢麻醉建議....");
        List<Suggestion> suggestions = patientService.findSuggestionBySuggestionId(suggestionIdList);
        System.out.println(suggestions);
        return suggestions;
    }

    @RequestMapping(path = "/findX")
    public @ResponseBody PatientLv2X findX(int patient_number_lv2){
        return patientService.findX(patient_number_lv2);
    }
}
