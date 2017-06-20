package com.github.andyshaox.baker.conf;

import java.util.Map;

import com.github.andyshaox.baker.conf.vo.CoordinationStableArgs;
import com.github.andyshaox.baker.conf.vo.PackagerStableArgs;

/**
 * 
 * Title:Stable configure Service<br>
 * Descript:<br>
 * Copyright: Copryright(c) 20 Jun 2017<br>
 * Encoding:UNIX UTF-8
 * 
 * @author Andy.Shao
 *
 */
public interface StableConfService {
    /**
     * return all of stable configures
     * 
     * @return if doesn't exist then return a empty map
     */
    Map<String , CoordinationStableArgs> coordinationStableArgsMapping();

    /**
     * get a stable configure by packagerType
     * 
     * @param packagerType packageType
     * @return if doesn't exist then return null
     */
    PackagerStableArgs getPackagerArgs(String packagerType);

    /**
     * get a stable configure informations
     * 
     * @param coordinationType stable type
     * @return if doesn't exist then return null
     */
    CoordinationStableArgs getStableArgs(String coordinationType);

    /**
     * if and only if it exists then return true
     * 
     * @param coordiantionType types
     * @return if doesn't exist then return false
     */
    boolean isExistCoordination(String coordiantionType);

    /**
     * if and only if it exists then return true
     * 
     * @param packagerType type
     * @return if it doesn't exist then return false
     */
    boolean isExistPackager(String packagerType);

    /**
     * list all of package configures
     * 
     * @return if doesn't exist then return a empty list
     */
    Map<String , PackagerStableArgs> PackagerStableArgsMapping();
}
