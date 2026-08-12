package ksyun.client.kpfs.managemigratetask.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ManageMigrateTaskRequest
* @Description 请求参数
*/
@Data
public class ManageMigrateTaskRequest{
    /**数据迁移任务ID。*/
    @KsYunField(name="TaskId")
    private String TaskId;

    /**任务操作。pause：暂停任务（仅运行中支持）；resume：恢复任务（仅已暂停、异常中断支持）；close：关闭任务（仅运行中、异常中断支持）；delete：删除任务（仅已关闭、已完成、异常中断支持）；re_execute：重新执行任务（仅已完成支持）。*/
    @KsYunField(name="Operation")
    private String Operation;

}
