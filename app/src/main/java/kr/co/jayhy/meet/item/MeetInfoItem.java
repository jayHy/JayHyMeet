package kr.co.jayhy.meet.item;

import java.util.Date;

/**
 * Created by jhkim on 2017-07-02.
 */

public class MeetInfoItem {

    private int meetIdx = 0;
    private String title = "";
    private String intro = "";
    private String content = "";
    private String addrSido = "";
    private String addrGogun = "";
    private String addrLocX = "";
    private String addrLoxY = "";
    private Date startDate = null;
    private String startTime = "";
    private Date endDate = null;
    private String endTime = "";
    private Date reqStartDate = null;
    private String reqStartTime = "";
    private Date reqEndDate = null;
    private String reqEndtime = "";
    private String statusCd = "";
    private String imageServer = "";
    private String imagePath = "";
    private String imageName = "";
    private boolean openYn = false;
    private String typeCd = "";
    private String memberIdx = "";

    public int getMeetIdx() {
        return meetIdx;
    }

    public void setMeetIdx(int meetIdx) {
        this.meetIdx = meetIdx;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAddrSido() {
        return addrSido;
    }

    public void setAddrSido(String addrSido) {
        this.addrSido = addrSido;
    }

    public String getAddrGogun() {
        return addrGogun;
    }

    public void setAddrGogun(String addrGogun) {
        this.addrGogun = addrGogun;
    }

    public String getAddrLocX() {
        return addrLocX;
    }

    public void setAddrLocX(String addrLocX) {
        this.addrLocX = addrLocX;
    }

    public String getAddrLoxY() {
        return addrLoxY;
    }

    public void setAddrLoxY(String addrLoxY) {
        this.addrLoxY = addrLoxY;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Date getReqStartDate() {
        return reqStartDate;
    }

    public void setReqStartDate(Date reqStartDate) {
        this.reqStartDate = reqStartDate;
    }

    public String getReqStartTime() {
        return reqStartTime;
    }

    public void setReqStartTime(String reqStartTime) {
        this.reqStartTime = reqStartTime;
    }

    public Date getReqEndDate() {
        return reqEndDate;
    }

    public void setReqEndDate(Date reqEndDate) {
        this.reqEndDate = reqEndDate;
    }

    public String getReqEndtime() {
        return reqEndtime;
    }

    public void setReqEndtime(String reqEndtime) {
        this.reqEndtime = reqEndtime;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }

    public String getImageServer() {
        return imageServer;
    }

    public void setImageServer(String imageServer) {
        this.imageServer = imageServer;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public boolean isOpenYn() {
        return openYn;
    }

    public void setOpenYn(boolean openYn) {
        this.openYn = openYn;
    }

    public String getTypeCd() {
        return typeCd;
    }

    public void setTypeCd(String typeCd) {
        this.typeCd = typeCd;
    }

    public String getMemberIdx() {
        return memberIdx;
    }

    public void setMemberIdx(String memberIdx) {
        this.memberIdx = memberIdx;
    }

}
