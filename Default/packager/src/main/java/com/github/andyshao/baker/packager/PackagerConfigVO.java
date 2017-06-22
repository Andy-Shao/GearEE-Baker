package com.github.andyshao.baker.packager;

public class PackagerConfigVO {
    private String packagerType;
    private boolean valid;
    private int maxTaskNum;
    private String maxDiskSize;
    private String perTaskMaxDiskSize;
    public String getPackagerType() {
        return packagerType;
    }
    public void setPackagerType(String packagerType) {
        this.packagerType = packagerType;
    }
    public boolean isValid() {
        return valid;
    }
    public void setValid(boolean valid) {
        this.valid = valid;
    }
    public int getMaxTaskNum() {
        return maxTaskNum;
    }
    public void setMaxTaskNum(int maxTaskNum) {
        this.maxTaskNum = maxTaskNum;
    }
    public String getMaxDiskSize() {
        return maxDiskSize;
    }
    public void setMaxDiskSize(String maxDiskSize) {
        this.maxDiskSize = maxDiskSize;
    }
    public String getPerTaskMaxDiskSize() {
        return perTaskMaxDiskSize;
    }
    public void setPerTaskMaxDiskSize(String perTaskMaxDiskSize) {
        this.perTaskMaxDiskSize = perTaskMaxDiskSize;
    }
}
