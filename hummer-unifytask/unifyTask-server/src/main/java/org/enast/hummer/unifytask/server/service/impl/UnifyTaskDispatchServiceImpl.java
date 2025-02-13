package org.enast.hummer.unifytask.server.service.impl;

import org.enast.hummer.unifytask.server.service.ServerUnifyTaskService;
import org.enast.hummer.unifytask.server.service.UnifyTaskDispatchService;
import org.enast.hummer.unifytask.core.vo.TaskAjaxResult;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.Future;

/**
 * @author zhujinming6
 * @create 2019-10-12 13:07
 * @update 2019-10-12 13:07
 **/
@Service
public class UnifyTaskDispatchServiceImpl implements UnifyTaskDispatchService {

    @Resource
    ServerUnifyTaskService serverUnifyTaskService;

    /**
     * 异步调用任务
     *
     * @param server
     * @param taskName
     * @return
     */
    @Override
    @Async
    public Future<TaskAjaxResult<Boolean>> dispatchTaskAsync(String server, String taskName) {
        Future<TaskAjaxResult<Boolean>> resultFuture = new AsyncResult(serverUnifyTaskService.dispatchTask(server, taskName));
        return resultFuture;
    }

    /**
     * 同步
     *
     * @param server
     * @param taskName
     * @return
     */
    @Override
    public TaskAjaxResult<Boolean> dispatchTask(String server, String taskName) {
        return serverUnifyTaskService.dispatchTask(server, taskName);
    }
}
