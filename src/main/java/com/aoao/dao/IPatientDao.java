package com.aoao.dao;

import com.aoao.domain.PatientLv1;
import com.aoao.domain.PatientLv2;
import com.aoao.domain.SuggestionIdList;
import com.aoao.domain.Suggestion;
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
     * 查詢所有病人的問診記錄
     * @return
     */
    List<PatientLv2> findAllAssessRecords();

    /**
     * 根據住院號查詢病人
     * @param patient_number_lv1 病人的住院號
     * @return
     */
    PatientLv1 findPatientByPatientNumber(Integer patient_number_lv1);

    /**
     * 增加病人一級表記錄
     * @param patientLv1
     */
    void insertPatientLv1Info(PatientLv1 patientLv1);

    /**
     * 更新病人一級表記錄
     * @param patientLv1
     */
    void updatePatientLv1Info(PatientLv1 patientLv1);

    /**
     * 更新病人二級表記錄
     * @param patientLv2
     */
    void updatePatientLv2Info(PatientLv2 patientLv2);

    /**
     * 增加新的病人二級表記錄
     * @param patientLv2
     */
    void insertPatientLv2Info(PatientLv2 patientLv2);

    /**
     * 刪除病人二級表記錄
     * @param patientLv2
     */
    void deletePatientLv2Info(PatientLv2 patientLv2);

    /**
     * 根據住院號刪除病人的整個二級表記錄
     * @param patientLv2
     */
    void deletePatientLv2InfoWithPatientNumber(PatientLv2 patientLv2);

    List<Suggestion> findSuggestionBySuggestionId(List<String> suggestionIdList);
}
