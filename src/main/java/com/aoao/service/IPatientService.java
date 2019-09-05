package com.aoao.service;

import com.aoao.domain.PatientLv1;
import com.aoao.domain.PatientLv2;
import com.aoao.domain.SuggestionIdList;
import com.aoao.domain.Suggestion;

import java.util.List;

public interface IPatientService {

    /**
     * 查詢所有病人的住院號
     * @return
     */
    List<Integer> findAllPatientNumber();

    /**
     * 查詢所有病人的問診記錄
     * @return
     */
    List<PatientLv2> findAllAssessRecords();

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
    String updatePatientLv1Info(PatientLv1 patientLv1);

    /**
     * 增加病人一級表記錄
     * @param patientLv1
     */
    String insertPatientLv1Info(PatientLv1 patientLv1);

    /**
     * 更新病人二級表記錄
     * @param patientLv2
     */
    String updatePatientLv2Info(PatientLv2 patientLv2);

    /**
     * 增加新的病人二級表記錄
     * @param patientLv2
     */
    String insertPatientLv2Info(PatientLv2 patientLv2);

    /**
     * 刪除病人二級表記錄
     * @param patientLv2
     */
    String deletePatientLv2Info(PatientLv2 patientLv2);

    /**
     * 根據住院號刪除病人的整個二級表記錄
     * @param patientLv2
     */
    String deletePatientLv2InfoWithPatientNumber(PatientLv2 patientLv2);

    List<Suggestion> findSuggestionBySuggestionId(SuggestionIdList suggestionIdList);

}
