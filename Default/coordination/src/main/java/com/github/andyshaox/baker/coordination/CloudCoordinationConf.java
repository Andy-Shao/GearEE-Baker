package com.github.andyshaox.baker.coordination;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.github.andyshaox.baker.core.CoordinationConfig;

/**
 * 
 * Title:<br>
 * Descript:<br>
 * Copyright: Copryright(c) 22 Jun 2017<br>
 * Encoding:UNIX UTF-8
 * @author Andy.Shao
 *
 */
@Component("coordinationConfig")
public class CloudCoordinationConf implements CoordinationConfig {
    @Value("${Baker.coordination.type}")
    private String coordinationType;
    @Value("${Baker.coordination.isValid}")
    private boolean isValid;

    @Override
    public String coordiantionType() {
        return this.coordinationType;
    }

    @Override
    public boolean isValid() {
        return this.isValid;
    }

}
