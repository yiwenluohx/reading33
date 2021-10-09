package com.ttread.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AppUserInfo {
    private String id;

    private String name;

    private String photo;

    private String regGrade;

    private String currentGrade;

    private Integer gender;

    private Date birthday;

    private String province;

    private String city;

    private String district;

    private String street;

    private BigDecimal clVal;

    private Date glUpdateDate;

    private Integer points;

    private Date pointsUpdatetime;

    private Integer orderTotal;

    private Date totalUpdatetime;

    private Date regTime;

    private String regOrganization;

    private String currentOrganization;

    private String memberStatus;

    private Date memberUpdatetime;

    private Date memberAvailable;

    private Date memberExpiry;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private Integer vipStatus;

    private String email;

    private String uidQq;

    private String uidWechat;

    private String uidSina;

    private Integer isRemind;

    private Integer isPush;

    private Integer isTest;

    private String uidAppleid;

    private String wechatPhoto;

    private String ip;

    private Integer isValid;

    private Integer teacherId;

    private Integer classId;

    private Short entryYear;

    private Integer testNum;

    private String dangdangId;

    private Date quizTime;

    private Integer joinStatus;

    private String uidUnionid;

    private String unionId;

    private Integer channelId;

    private Integer delFlag;

    private String mobile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getRegGrade() {
        return regGrade;
    }

    public void setRegGrade(String regGrade) {
        this.regGrade = regGrade == null ? null : regGrade.trim();
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade == null ? null : currentGrade.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public BigDecimal getClVal() {
        return clVal;
    }

    public void setClVal(BigDecimal clVal) {
        this.clVal = clVal;
    }

    public Date getGlUpdateDate() {
        return glUpdateDate;
    }

    public void setGlUpdateDate(Date glUpdateDate) {
        this.glUpdateDate = glUpdateDate;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Date getPointsUpdatetime() {
        return pointsUpdatetime;
    }

    public void setPointsUpdatetime(Date pointsUpdatetime) {
        this.pointsUpdatetime = pointsUpdatetime;
    }

    public Integer getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Integer orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Date getTotalUpdatetime() {
        return totalUpdatetime;
    }

    public void setTotalUpdatetime(Date totalUpdatetime) {
        this.totalUpdatetime = totalUpdatetime;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getRegOrganization() {
        return regOrganization;
    }

    public void setRegOrganization(String regOrganization) {
        this.regOrganization = regOrganization == null ? null : regOrganization.trim();
    }

    public String getCurrentOrganization() {
        return currentOrganization;
    }

    public void setCurrentOrganization(String currentOrganization) {
        this.currentOrganization = currentOrganization == null ? null : currentOrganization.trim();
    }

    public String getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus == null ? null : memberStatus.trim();
    }

    public Date getMemberUpdatetime() {
        return memberUpdatetime;
    }

    public void setMemberUpdatetime(Date memberUpdatetime) {
        this.memberUpdatetime = memberUpdatetime;
    }

    public Date getMemberAvailable() {
        return memberAvailable;
    }

    public void setMemberAvailable(Date memberAvailable) {
        this.memberAvailable = memberAvailable;
    }

    public Date getMemberExpiry() {
        return memberExpiry;
    }

    public void setMemberExpiry(Date memberExpiry) {
        this.memberExpiry = memberExpiry;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getVipStatus() {
        return vipStatus;
    }

    public void setVipStatus(Integer vipStatus) {
        this.vipStatus = vipStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUidQq() {
        return uidQq;
    }

    public void setUidQq(String uidQq) {
        this.uidQq = uidQq == null ? null : uidQq.trim();
    }

    public String getUidWechat() {
        return uidWechat;
    }

    public void setUidWechat(String uidWechat) {
        this.uidWechat = uidWechat == null ? null : uidWechat.trim();
    }

    public String getUidSina() {
        return uidSina;
    }

    public void setUidSina(String uidSina) {
        this.uidSina = uidSina == null ? null : uidSina.trim();
    }

    public Integer getIsRemind() {
        return isRemind;
    }

    public void setIsRemind(Integer isRemind) {
        this.isRemind = isRemind;
    }

    public Integer getIsPush() {
        return isPush;
    }

    public void setIsPush(Integer isPush) {
        this.isPush = isPush;
    }

    public Integer getIsTest() {
        return isTest;
    }

    public void setIsTest(Integer isTest) {
        this.isTest = isTest;
    }

    public String getUidAppleid() {
        return uidAppleid;
    }

    public void setUidAppleid(String uidAppleid) {
        this.uidAppleid = uidAppleid == null ? null : uidAppleid.trim();
    }

    public String getWechatPhoto() {
        return wechatPhoto;
    }

    public void setWechatPhoto(String wechatPhoto) {
        this.wechatPhoto = wechatPhoto == null ? null : wechatPhoto.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Short getEntryYear() {
        return entryYear;
    }

    public void setEntryYear(Short entryYear) {
        this.entryYear = entryYear;
    }

    public Integer getTestNum() {
        return testNum;
    }

    public void setTestNum(Integer testNum) {
        this.testNum = testNum;
    }

    public String getDangdangId() {
        return dangdangId;
    }

    public void setDangdangId(String dangdangId) {
        this.dangdangId = dangdangId == null ? null : dangdangId.trim();
    }

    public Date getQuizTime() {
        return quizTime;
    }

    public void setQuizTime(Date quizTime) {
        this.quizTime = quizTime;
    }

    public Integer getJoinStatus() {
        return joinStatus;
    }

    public void setJoinStatus(Integer joinStatus) {
        this.joinStatus = joinStatus;
    }

    public String getUidUnionid() {
        return uidUnionid;
    }

    public void setUidUnionid(String uidUnionid) {
        this.uidUnionid = uidUnionid == null ? null : uidUnionid.trim();
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId == null ? null : unionId.trim();
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }
}