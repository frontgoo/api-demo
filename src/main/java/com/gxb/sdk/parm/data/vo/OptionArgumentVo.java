package com.gxb.sdk.parm.data.vo;


import com.gxb.sdk.parm.data.base.DataObjectBase;

import java.util.List;

/**
 * 下拉参数项.
 */
public class OptionArgumentVo extends DataObjectBase {
    //变量名称
    private String argumentName;
    //字典集列表
    private List<DictionaryVo> dictionaryList;

    public String getArgumentName() {
        return argumentName;
    }

    public void setArgumentName(String argumentName) {
        this.argumentName = argumentName;
    }

    public List<DictionaryVo> getDictionaryList() {
        return dictionaryList;
    }

    public void setDictionaryList(List<DictionaryVo> dictionaryList) {
        this.dictionaryList = dictionaryList;
    }
}
