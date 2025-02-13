package org.enast.hummer.unifytask.server.web.vo;

import lombok.Data;
import org.enast.hummer.unifytask.core.common.UnifyTaskStatusType;

/**
 * @author zhujinming6
 * @create 2020-05-21 16:43
 * @update 2020-05-21 16:43
 **/
@Data
public class TaskQueryVO {

    private String name;

    private String taskNo;

    private String server;

    private UnifyTaskStatusType status;

    private Integer pageNo = 1;
    private Integer pageSize = 10;
}
