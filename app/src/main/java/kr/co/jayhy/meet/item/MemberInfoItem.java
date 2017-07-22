package kr.co.jayhy.meet.item;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by jhkim on 2017-07-02.
 */

public class MemberInfoItem extends RealmObject {

    @PrimaryKey
    private int memberIdx = 0;
    private String email = "";
    private String passwd = "";
    private String name = "";
    private String sex = "";
    private String emailPubYn = "";
    private String emailRecvYn = "";
    private String phone = "";
    private String deptNm = "";
    private String compayNm = "";
    private String homepage = "";
    private boolean categoryYn = false;
    private boolean weekYn = false;
    private boolean timeYn = false;
    private boolean useYn = false;

    public int getMemberIdx() {
        return memberIdx;
    }

    public void setMemberIdx(int memberIdx) {
        this.memberIdx = memberIdx;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmailPubYn() {
        return emailPubYn;
    }

    public void setEmailPubYn(String emailPubYn) {
        this.emailPubYn = emailPubYn;
    }

    public String getEmailRecvYn() {
        return emailRecvYn;
    }

    public void setEmailRecvYn(String emailRecvYn) {
        this.emailRecvYn = emailRecvYn;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDeptNm() {
        return deptNm;
    }

    public void setDeptNm(String deptNm) {
        this.deptNm = deptNm;
    }

    public String getCompayNm() {
        return compayNm;
    }

    public void setCompayNm(String compayNm) {
        this.compayNm = compayNm;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public boolean isCategoryYn() {
        return categoryYn;
    }

    public void setCategoryYn(boolean categoryYn) {
        this.categoryYn = categoryYn;
    }

    public boolean isWeekYn() {
        return weekYn;
    }

    public void setWeekYn(boolean weekYn) {
        this.weekYn = weekYn;
    }

    public boolean isTimeYn() {
        return timeYn;
    }

    public void setTimeYn(boolean timeYn) {
        this.timeYn = timeYn;
    }

    public boolean isUseYn() {
        return useYn;
    }

    public void setUseYn(boolean useYn) {
        this.useYn = useYn;
    }



}
