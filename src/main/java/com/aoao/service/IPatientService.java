package com.aoao.service;

import com.aoao.domain.*;

import java.util.List;

public interface IPatientService {

    /**
     * 查詢所有病人的住院號
     * @return
     */
    List<Integer> findAllPatientNumber();

    /**
     * 查詢所有問診過病人的住院號
     * @return
     */
    List<Integer> findAllDiagnosedPatientNumber();

    /**
     * 根據住院號查詢病人記錄
     * @param patient_number_lv1
     * @return
     */
    PatientLv1 findPatientByPatientNumber(Integer patient_number_lv1);

    /**
     * 更新病人一級表記錄
     * @param patientLv1
     */
    int updatePatientLv1Info(PatientLv1 patientLv1);

//    /**
//     * 增加病人一級表記錄
//     * @param patientLv1
//     */
//    String insertPatientLv1Info(PatientLv1 patientLv1);

    /**
     * 更新病人二級表記錄
     * @param patientLv2
     */
    int updatePatientLv2Info(PatientLv2X patientLv2);

    /**
     * 增加新的病人二級表記錄
     * @param patientLv2
     */
    int insertPatientLv2Info(PatientLv2X patientLv2);
//
//    /**
//     * 刪除病人二級表記錄
//     * @param patientLv2
//     */
//    String deletePatientLv2Info(PatientLv2 patientLv2);

    /**
     * 查詢麻醉建議
     * @param suggestionIdList
     * @return
     */
    List<Suggestion> findSuggestionBySuggestionId(SuggestionIdList suggestionIdList);

    PatientLv2X findX(Integer patient_number_lv2);
}
