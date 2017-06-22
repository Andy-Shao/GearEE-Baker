package com.github.andyshao.baker.packager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.github.andyshao.lang.number.ByteSize;
import com.github.andyshao.lang.number.SimpleByteSize;
import com.github.andyshaox.baker.core.PackagerConfig;

@Component("packagerConfig")
public class ClouadPackagerConf implements PackagerConfig {
    @Value("${Baker.packager.type}")
    private String packagerType;
    @Value("${Baker.packager.valid}")
    private boolean valid;
    @Value("${Baker.packager.maxTaskNum}")
    private int maxTaskNum;
    @Value("${Baker.packager.maxDiskSize}")
    private String maxDiskSize;
    @Value("${Baker.packager.perTaskMaxDiskSize}")
    private String perTaskMaxDiskSize;

    @Override
    public String getPackagerType() {
        return this.packagerType;
    }

    @Override
    public boolean isValid() {
        return this.valid;
    }

    @Override
    public int getMaxTaskNum() {
        return this.maxTaskNum;
    }

    @Override
    public ByteSize getMaxDiskSize() {
        return SimpleByteSize.covertToString(this.maxDiskSize);
    }

    @Override
    public ByteSize getPerTaskMaxDiskSize() {
        return SimpleByteSize.covertToString(this.perTaskMaxDiskSize);
    }

}
