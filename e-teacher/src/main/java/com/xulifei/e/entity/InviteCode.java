package com.xulifei.e.entity;

import java.io.Serializable;

public class InviteCode implements Serializable {
    private static final long serialVersionUID = -2534610911783897579L;
    private String codeId;

    private String code;

    private String status;

    public String getCodeId() {
        return codeId;
    }

    public void setCodeId(String codeId) {
        this.codeId = codeId == null ? null : codeId.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}