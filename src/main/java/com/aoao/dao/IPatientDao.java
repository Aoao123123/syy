package com.aoao.dao;

import com.aoao.domain.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久層接口，實現類對象以代理對象形式配置到映射配置文件中
 */
@Repository
public interface IPatientDao {


    /**
     * 查詢所有病人的住院號
     * @return
     */
    List<Integer> findAllPatientNumber();

    /**
     * 根據住院號查詢病人
     * @param patient_number_lv1 病人的住院號
     * @return
     */
    PatientLv2X findPatientByPatientNumber(Integer patient_number_lv1);

//    /**
//     * 增加病人一級表記錄X
//     * @param patientLv1
//     */
//    void insertPatientLv1Info(PatientLv1 patientLv1);

    /**
     * 更新病人一級表記錄
     * @param patientLv1
     */
    void updatePatientLv1Info(PatientLv1 patientLv1);

    /**
     * 更新病人二級表記錄
     * @param patientLv2
     */
    void updatePatientLv2Info(PatientLv2X patientLv2);

//    /**
//     * 增加新的病人二級表記錄
//     * @param patientLv2
//     */
//    void insertPatientLv2Info(PatientLv2 patientLv2);

//    /**
//     * 刪除病人二級表記錄
//     * @param patientLv2
//     */
//    void deletePatientLv2Info(PatientLv2 patientLv2);

    /**
     * 查詢麻醉建議
     * @param suggestionIdList
     * @return
     */
    List<Suggestion> findSuggestionBySuggestionId(List<String> suggestionIdList);

    PatientLv2X findX(Integer patient_number_lv2);
}
