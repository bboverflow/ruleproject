package cn.trusteye.f2.pojo.po;

import cn.trusteye.base.util.DateSerializer;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class F2sesnkeySet {
    private String sesnkey;

    private BigDecimal allnum;

    private BigDecimal newnum;

    private BigDecimal postAllnum;

    private BigDecimal postNewnum;

    private BigDecimal getAllnum;

    private BigDecimal getNewnum;

    private BigDecimal responseAllnum;

    private BigDecimal responseNewnum;

    private BigDecimal otherAllnum;

    private BigDecimal otherNewnum;

    private String realnicmac;

    private String networkCard;

    private String pcname;

    private String f2version;

    private String accessmode;

    private String browser;

    private String systeminfo;

    private Long ipaddress;

    private Long timestamp;

    private String serverNo;

    private Long f2ip;

    private Date captureTime;

    private Date restoreTime;

    private Date updateTime;

    private String devNo;

    private String slocation;

    private Date locInfoTime;

    private Long accessWay;

    private String imsi;

    private String msisdn;

    private BigDecimal locInfoContentid;

    public String getSesnkey() {
        return sesnkey;
    }

    public void setSesnkey(String sesnkey) {
        this.sesnkey = sesnkey == null ? null : sesnkey.trim();
    }

    public BigDecimal getAllnum() {
        return allnum;
    }

    public void setAllnum(BigDecimal allnum) {
        this.allnum = allnum;
    }

    public BigDecimal getNewnum() {
        return newnum;
    }

    public void setNewnum(BigDecimal newnum) {
        this.newnum = newnum;
    }

    public BigDecimal getPostAllnum() {
        return postAllnum;
    }

    public void setPostAllnum(BigDecimal postAllnum) {
        this.postAllnum = postAllnum;
    }

    public BigDecimal getPostNewnum() {
        return postNewnum;
    }

    public void setPostNewnum(BigDecimal postNewnum) {
        this.postNewnum = postNewnum;
    }

    public BigDecimal getGetAllnum() {
        return getAllnum;
    }

    public void setGetAllnum(BigDecimal getAllnum) {
        this.getAllnum = getAllnum;
    }

    public BigDecimal getGetNewnum() {
        return getNewnum;
    }

    public void setGetNewnum(BigDecimal getNewnum) {
        this.getNewnum = getNewnum;
    }

    public BigDecimal getResponseAllnum() {
        return responseAllnum;
    }

    public void setResponseAllnum(BigDecimal responseAllnum) {
        this.responseAllnum = responseAllnum;
    }

    public BigDecimal getResponseNewnum() {
        return responseNewnum;
    }

    public void setResponseNewnum(BigDecimal responseNewnum) {
        this.responseNewnum = responseNewnum;
    }

    public BigDecimal getOtherAllnum() {
        return otherAllnum;
    }

    public void setOtherAllnum(BigDecimal otherAllnum) {
        this.otherAllnum = otherAllnum;
    }

    public BigDecimal getOtherNewnum() {
        return otherNewnum;
    }

    public void setOtherNewnum(BigDecimal otherNewnum) {
        this.otherNewnum = otherNewnum;
    }

    public String getRealnicmac() {
        return realnicmac;
    }

    public void setRealnicmac(String realnicmac) {
        this.realnicmac = realnicmac == null ? null : realnicmac.trim();
    }

    public String getNetworkCard() {
        return networkCard;
    }

    public void setNetworkCard(String networkCard) {
        this.networkCard = networkCard == null ? null : networkCard.trim();
    }

    public String getPcname() {
        return pcname;
    }

    public void setPcname(String pcname) {
        this.pcname = pcname == null ? null : pcname.trim();
    }

    public String getF2version() {
        return f2version;
    }

    public void setF2version(String f2version) {
        this.f2version = f2version == null ? null : f2version.trim();
    }

    public String getAccessmode() {
        return accessmode;
    }

    public void setAccessmode(String accessmode) {
        this.accessmode = accessmode == null ? null : accessmode.trim();
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }

    public String getSysteminfo() {
        return systeminfo;
    }

    public void setSysteminfo(String systeminfo) {
        this.systeminfo = systeminfo == null ? null : systeminfo.trim();
    }

    public Long getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(Long ipaddress) {
        this.ipaddress = ipaddress;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getServerNo() {
        return serverNo;
    }

    public void setServerNo(String serverNo) {
        this.serverNo = serverNo == null ? null : serverNo.trim();
    }

    public Long getF2ip() {
        return f2ip;
    }

    public void setF2ip(Long f2ip) {
        this.f2ip = f2ip;
    }

    public Date getCaptureTime() {
        return captureTime;
    }

    public void setCaptureTime(Date captureTime) {
        this.captureTime = captureTime;
    }

    public Date getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(Date restoreTime) {
        this.restoreTime = restoreTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDevNo() {
        return devNo;
    }

    public void setDevNo(String devNo) {
        this.devNo = devNo == null ? null : devNo.trim();
    }

    public String getSlocation() {
        return slocation;
    }

    public void setSlocation(String slocation) {
        this.slocation = slocation == null ? null : slocation.trim();
    }

    public Date getLocInfoTime() {
        return locInfoTime;
    }

    public void setLocInfoTime(Date locInfoTime) {
        this.locInfoTime = locInfoTime;
    }

    public Long getAccessWay() {
        return accessWay;
    }

    public void setAccessWay(Long accessWay) {
        this.accessWay = accessWay;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi == null ? null : imsi.trim();
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn == null ? null : msisdn.trim();
    }

    public BigDecimal getLocInfoContentid() {
        return locInfoContentid;
    }

    public void setLocInfoContentid(BigDecimal locInfoContentid) {
        this.locInfoContentid = locInfoContentid;
    }
}