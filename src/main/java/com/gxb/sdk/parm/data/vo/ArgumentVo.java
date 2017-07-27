package com.gxb.sdk.parm.data.vo;



import com.gxb.sdk.parm.data.base.DataObjectBase;

import java.util.List;

/**
 * 授权参数项.
 */
public class ArgumentVo extends DataObjectBase {
    private String title;
    private String hint;
    private String argumentName;
    private String argumentType;//ArgumentTypeEnum
    private String requireType;//RequireTypeEnum
    private List<OptionArgumentVo> optionArgumentList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getArgumentName() {
        return argumentName;
    }

    public void setArgumentName(String argumentName) {
        this.argumentName = argumentName;
    }

    public String getArgumentType() {
        return argumentType;
    }

    public void setArgumentType(String argumentType) {
        this.argumentType = argumentType;
    }

	public String getRequireType() {
		return requireType;
	}

	public void setRequireType(String requireType) {
		this.requireType = requireType;
	}

    public List<OptionArgumentVo> getOptionArgumentList() {
        return optionArgumentList;
    }

    public void setOptionArgumentList(List<OptionArgumentVo> optionArgumentList) {
        this.optionArgumentList = optionArgumentList;
    }
}
