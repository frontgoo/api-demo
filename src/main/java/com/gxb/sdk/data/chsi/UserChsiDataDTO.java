package com.gxb.sdk.data.chsi;


import java.io.Serializable;
import java.util.List;

/**
 * Created by yediwu on 2017/9/14.
 */
public class UserChsiDataDTO implements Serializable {


    private static final long serialVersionUID = 1L;

    private ChsiBaseInfoDTO chsiBaseInfoDTO;
    private List<ChsiSchoolInfoDTO> schoolInfoList;
    private List<ChsiEducationInfoDTO> educationInfoList;


    public List<ChsiSchoolInfoDTO> getSchoolInfoList() {
        return schoolInfoList;
    }

    public void setSchoolInfoList(List<ChsiSchoolInfoDTO> schoolInfoList) {
        this.schoolInfoList = schoolInfoList;
    }

    public List<ChsiEducationInfoDTO> getEducationInfoList() {
        return educationInfoList;
    }

    public void setEducationInfoList(List<ChsiEducationInfoDTO> educationInfoList) {
        this.educationInfoList = educationInfoList;
    }

    public ChsiBaseInfoDTO getChsiBaseInfoDTO() {
        return chsiBaseInfoDTO;
    }

    public void setChsiBaseInfoDTO(ChsiBaseInfoDTO chsiBaseInfoDTO) {
        this.chsiBaseInfoDTO = chsiBaseInfoDTO;
    }
}
