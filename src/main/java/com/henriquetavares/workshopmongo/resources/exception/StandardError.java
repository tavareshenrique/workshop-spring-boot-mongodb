package com.henriquetavares.workshopmongo.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {

    private Long timesstamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandardError() {

    }

    public StandardError(Long timesstamp, Integer status, String error, String message, String path) {
        this.timesstamp = timesstamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Long getTimesstamp() {
        return timesstamp;
    }

    public void setTimesstamp(Long timesstamp) {
        this.timesstamp = timesstamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
