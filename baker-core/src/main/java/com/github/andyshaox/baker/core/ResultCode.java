package com.github.andyshaox.baker.core;

/**
 * 
 * Title:<br>
 * Descript:<br>
 * Copyright: Copryright(c) 21 Jun 2017<br>
 * Encoding:UNIX UTF-8
 * @author Andy.Shao
 *
 * @param <DATA> result data
 */
public interface ResultCode<DATA> {
    String code();
    String message();
    DATA data();
}
