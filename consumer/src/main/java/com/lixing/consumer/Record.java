package com.lixing.consumer;




public class Record  {

    private String equipment;
    private String channel;
    private String region;
    private String app;
    private String platform;
    private Long pushTime;
    private Long clickTime;
    private  String MacAdress;


    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public Long getPushTime() {
        return pushTime;
    }

    public void setPushTime(Long pushTime) {
        this.pushTime = pushTime;
    }

    public Long getClickTime() {
        return clickTime;
    }

    public void setClickTime(Long clickTime) {
        this.clickTime = clickTime;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getMacAdress() {
        return MacAdress;
    }

    public void setMacAdress(String macAdress) {
        MacAdress = macAdress;
    }

    public Record() {
    }

    public Record(String equipment, String channel, String region, String app, String platform, String macAdress) {
        this.equipment = equipment;
        this.channel = channel;
        this.region = region;
        this.app = app;
        this.platform = platform;
        MacAdress = macAdress;
    }
}
