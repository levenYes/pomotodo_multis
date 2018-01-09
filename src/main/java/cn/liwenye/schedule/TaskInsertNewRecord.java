package cn.liwenye.schedule;

import cn.liwenye.service.InsertNewRecordService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

/**
 * @author Liwenye
 * @date 2018/01/09
 * 插入新数据定时任务类
 */
@Component
public class TaskInsertNewRecord extends QuartzJobBean {

    //private InsertNewRecordService insertNewRecordService = SpringContextUtil.getBean(InsertNewRecordService.class);
    @Autowired
    InsertNewRecordService insertNewRecordService;

    @Override
    protected void executeInternal(JobExecutionContext context)
            throws JobExecutionException {
        try {
            insert();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert() throws Exception {
        insertNewRecordService.update();
    }
}
