package com.github.andyshaox.baker.packager;

/**
 * 
 * Title:<br>
 * Descript:<br>
 * Copyright: Copryright(c) 21 Jun 2017<br>
 * Encoding:UNIX UTF-8
 * @author Andy.Shao
 *
 */
public class TaskProcessException extends RuntimeException{
    private static final long serialVersionUID = -4446236951997875526L;
    public TaskProcessException(String message) {
        super(message);
    }
    public TaskProcessException(Throwable e) {
        super(e);
    }
    public TaskProcessException(String message, Throwable e) {
        super(message, e);
    }
    public TaskProcessException() {
    }
}
