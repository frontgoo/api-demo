package com.gxb.sdk.parm;

import java.io.Serializable;
import java.util.HashMap;

public class Status implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 2980240602011064012L;

    /**
     * 状态产生时，设置在task内，PREPARE：预准备阶段；LOGINED：登录成功阶段；FINISHED:任务完成阶段
     * 
     * @author <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
     * @version 1.0
     * @since 2017年7月2日 下午11:01:52
     */
    public enum Stage {
        PREPARE, LOGINED, FINISHED
    }

    /**
     * 当前任务阶段状态
     */
    private Stage stage;

    public enum PhaseStatus {
        LOGIN_WAITING, LOGIN_SUCCESS, LOGIN_FAILED,

        REFRESH_IMAGE_WAITING, REFRESH_IMAGE_SUCCESS, REFRESH_IMAGE_FAILED,

        REFRESH_SMS_WAITING, REFRESH_SMS_SUCCESS, REFRESH_SMS_FAILED,

        REFRESH_QR_CODE_WAITING, REFRESH_QR_CODE_SUCCESS, REFRESH_QR_CODE_FAILED,

        SMS_VERIFY_NEW,

        IMAGE_VERIFY_NEW,

        QR_VERIFY_NEW, QR_VERIFY_CONFIRMED, QR_VERIFY_FAILED, QR_VERIFY_SUCCESS,

        // 默认
        WAITING,

        SUCCESS, FAILED
    }

    /**
     * 当前任务当前状态
     */
    private PhaseStatus phaseStatus;
    private HashMap<String, Object> extra;
    private String token;
    private long timestamp;

    public Status(String token, Stage stage, PhaseStatus phaseStatus) {
        super();
        this.stage = stage;
        this.phaseStatus = phaseStatus;
        this.token = token;
        this.extra = new Extra();
    }

    public class Extra extends HashMap<String, Object> {
        /**
         *
         */
        private static final long serialVersionUID = 8118688790195970262L;
        private static final String TITLE = "title";
        private static final String TIPS = "tips";
        private static final String REMARK = "remark";

        public String getTitle() {
            return (String) get(TITLE);
        }

        public void setTitle(String title) {
            put(TITLE, title);
        }

        public String getTips() {
            return (String) get(TIPS);
        }

        public void setTips(String tips) {
            put(TIPS, tips);
        }

        public String getRemark() {
            return (String) get(REMARK);
        }

        public void setRemark(String remark) {
            put(REMARK, remark);
        }

    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public PhaseStatus getPhaseStatus() {
        return phaseStatus;
    }

    public void setPhaseStatus(PhaseStatus phaseStatus) {
        this.phaseStatus = phaseStatus;
    }

    public Extra getExtra() {
        Extra extra = new Extra();
        if (this.extra != null) {
            extra.putAll(this.extra);
        }
        setExtra(extra);
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Status [stage=" + stage + ", phaseStatus=" + phaseStatus + ", extra=" + extra + ", token=" + token + "]";
    }

}

