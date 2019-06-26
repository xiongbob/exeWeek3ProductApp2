//package com.company;

public class Software extends Product {
    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    //Get the superclass info from its toString() and add more info for subclass
    @Override
    public String toString(){
        return super.toString()+
                "Software written by " + programmer + "\n" +
                "The platform is " + platform + "\n" +
                "The operating system is " + os + "\n";
    }

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
