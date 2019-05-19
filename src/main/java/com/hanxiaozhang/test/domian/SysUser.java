/**
 * Copyright (C), 2018-2018, hanxiaozhang
 * FileName: SysUser
 * Author:   han
 * Date:     2018/12/2 21:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hanxiaozhang.test.domian;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * 〈功能简述〉<br> 
 * 〈〉
 *
 * @author han
 * @create 2019/5/19
 * @since 1.0.0
 */
@Entity
@Table(name = "sys_user", schema = "", catalog = "")
public class SysUser{

    private String sysUserId;
    private String password;
    private String username;
    private Date accountExpiredDate;
    private Short attemptTimes;
    private Date credentialsExpiredDate;
    private String enable;
    private Date lastAttemptDate;
    private String description;
    private String createdId;
    private String createdName;
    private Date createdDate;
    private String lastModifiedId;
    private String lastModifiedName;
    private Date lastModifiedDate;
    private String remark;

    private String page;
    private String limit;


    @Id
    @Column(name = "sys_user_id")
    public String getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(String sysUserId) {
        this.sysUserId = sysUserId;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "account_expired_date")
    public Date getAccountExpiredDate() {
        return accountExpiredDate;
    }

    public void setAccountExpiredDate(Date accountExpiredDate) {
        this.accountExpiredDate = accountExpiredDate;
    }

    @Basic
    @Column(name = "attempt_times")
    public Short getAttemptTimes() {
        return attemptTimes;
    }

    public void setAttemptTimes(Short attemptTimes) {
        this.attemptTimes = attemptTimes;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "credentials_expired_date")
    public Date getCredentialsExpiredDate() {
        return credentialsExpiredDate;
    }

    public void setCredentialsExpiredDate(Date credentialsExpiredDate) {
        this.credentialsExpiredDate = credentialsExpiredDate;
    }

    @Basic
    @Column(name = "enable")
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    @Basic
    @Column(name = "last_attempt_date")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getLastAttemptDate() {
        return lastAttemptDate;
    }

    public void setLastAttemptDate(Date lastAttemptDate) {
        this.lastAttemptDate = lastAttemptDate;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "created_id")
    public String getCreatedId() {
        return createdId;
    }

    public void setCreatedId(String createdId) {
        this.createdId = createdId;
    }

    @Basic
    @Column(name = "created_name")
    public String getCreatedName() {
        return createdName;
    }

    public void setCreatedName(String createdName) {
        this.createdName = createdName;
    }

    @Basic
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "last_modified_id")
    public String getLastModifiedId() {
        return lastModifiedId;
    }

    public void setLastModifiedId(String lastModifiedId) {
        this.lastModifiedId = lastModifiedId;
    }

    @Basic
    @Column(name = "last_modified_name")
    public String getLastModifiedName() {
        return lastModifiedName;
    }

    public void setLastModifiedName(String lastModifiedName) {
        this.lastModifiedName = lastModifiedName;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_modified_date")
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    @Transient
    @JsonSerialize
    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    @Transient
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "sysUserId='" + sysUserId + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", accountExpiredDate=" + accountExpiredDate +
                ", attemptTimes=" + attemptTimes +
                ", credentialsExpiredDate=" + credentialsExpiredDate +
                ", enable='" + enable + '\'' +
                ", lastAttemptDate=" + lastAttemptDate +
                ", description='" + description + '\'' +
                ", createdId='" + createdId + '\'' +
                ", createdName='" + createdName + '\'' +
                ", createdDate=" + createdDate +
                ", lastModifiedId='" + lastModifiedId + '\'' +
                ", lastModifiedName='" + lastModifiedName + '\'' +
                ", lastModifiedDate=" + lastModifiedDate +
                ", remark='" + remark + '\'' +
                ", page='" + page + '\'' +
                ", limit='" + limit + '\'' +
                '}';
    }
}