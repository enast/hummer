package org.enast.hummer.unifytask.server.biz;

import java.util.Date;

import org.enast.hummer.unifytask.core.common.UnifyTaskStatusType;
import org.enast.hummer.unifytask.server.model.UnifyTask;
import org.enast.hummer.unifytask.server.web.vo.TaskQueryVO;
import sf.common.wrapper.Page;

import java.util.List;

/**
 * @author zhujinming6
 * @create 2019-10-11 20:10
 * @update 2019-10-11 20:10
 **/
public interface UnifyTaskBiz {

    List<UnifyTask> findList();

    UnifyTask findOne(String taskNo, String server);
    UnifyTask findOneById(String id);

    Integer add(UnifyTask unifyTask);

    void addList(List<UnifyTask> taskList);

    void updateList(List<UnifyTask> taskListUpdate);

    void updateTaskStatus(String server, String taskNo, UnifyTaskStatusType executing);

    void updateTaskStatusAndTryTimes(String server, String taskNo, UnifyTaskStatusType executing, int retryTimes);

    void updateTaskStatusAndLastExcuteTime(String server, String taskNo, UnifyTaskStatusType finished, Date time);

    Page<UnifyTask> pageList(TaskQueryVO taskQueryVO);

    int update(UnifyTask task);

    void closeTask(String id);


}
