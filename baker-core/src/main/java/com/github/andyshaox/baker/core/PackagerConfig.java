package com.github.andyshaox.baker.core;

import com.github.andyshao.lang.number.ByteSize;

/**
 * 
 * Title: Packager configure informations<br>
 * Descript:<br>
 * Copyright: Copryright(c) 20 Jun 2017<br>
 * Encoding:UNIX UTF-8
 * @author Andy.Shao
 *
 */
public interface PackagerConfig {
    String getPackagerType();
    boolean isValid();
    int getMaxTaskNum();
    ByteSize getMaxDiskSize();
    ByteSize perTaskMaxDiskSize();
}
