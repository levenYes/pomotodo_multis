package cn.liwenye.bean;

import java.util.Date;

public class Pomos {
    private String uuid;

    private Date createdAt;

    private Date updatedAt;

    private String description;

    private Date startedAt;

    private Date endedAt;

    private Date localStartedAt;

    private Date localEndedAt;

    private Integer length;

    private Boolean abandoned;

    private Boolean manual;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public Date getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(Date endedAt) {
        this.endedAt = endedAt;
    }

    public Date getLocalStartedAt() {
        return localStartedAt;
    }

    public void setLocalStartedAt(Date localStartedAt) {
        this.localStartedAt = localStartedAt;
    }

    public Date getLocalEndedAt() {
        return localEndedAt;
    }

    public void setLocalEndedAt(Date localEndedAt) {
        this.localEndedAt = localEndedAt;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Boolean getAbandoned() {
        return abandoned;
    }

    public void setAbandoned(Boolean abandoned) {
        this.abandoned = abandoned;
    }

    public Boolean getManual() {
        return manual;
    }

    public void setManual(Boolean manual) {
        this.manual = manual;
    }
}