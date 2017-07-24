package com.gxb.sdk.parm.data.vo;


import com.gxb.sdk.parm.data.base.DataObjectBase;

/**
 * 字典集.
 */
public class DictionaryVo extends DataObjectBase {
    private String code;
    private String name;
    private String parent;

    public DictionaryVo() {
    }
    public DictionaryVo(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof DictionaryVo)) {
            return false;
        }
        return code != null && code.equals(((DictionaryVo)o).code);
    }

    //这个用来显示在PickerView上面的字符串,PickerView会通过反射获取getPickerViewText方法显示出来。
    public String getPickerViewText() {//NOTICE 该方法不能被混淆
        //这里还可以判断文字超长截断再提供显示
        return name;
    }
}
