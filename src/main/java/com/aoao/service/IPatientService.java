package com.aoao.service;

import com.aoao.domain.PatientLv1;
import com.aoao.domain.PatientLv2;

public interface IPatientService {

    /**
     * 根據住院號查詢病人記錄
     * @param patient_number_lv1
     * @return
     */
    PatientLv1 findPatientByPatientNumber(String patient_number_lv1);

    /**
     * 更新病人一級表記錄
     * @param patientLv1
     */
    void updatePatientLv1Info(PatientLv1 patientLv1);

    /**
     * 增加病人一級表記錄
     * @param patientLv1
     */
    void insertPatientLv1Info(PatientLv1 patientLv1);

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
}
