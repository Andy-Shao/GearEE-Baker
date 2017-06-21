package com.github.andyshaox.baker.packager;

import com.github.andyshaox.baker.core.ResultCode;
import com.github.andyshaox.baker.core.TaskInfo;
import com.github.andyshaox.baker.core.TaskProcessResult;

/**
 * 
 * Title:<br>
 * Descript:<br>
 * Copyright: Copryright(c) 21 Jun 2017<br>
 * Encoding:UNIX UTF-8
 * @author Andy.Shao
 *
 */
public interface TaskProcess {
    ResultCode<TaskProcessResult> process(TaskInfo taskInfo) throws TaskProcessException;
}
