package ksyun.client.kpfs.managedataflowtask.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ManageDataFlowTaskRequest
* @Description 请求参数
*/
@Data
public class ManageDataFlowTaskRequest{
    /**文件系统ID。*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**数据流动策略ID。*/
    @KsYunField(name="StrategyId")
    private String StrategyId;

    /**数据流动任务ID。*/
    @KsYunField(name="TaskId")
    private String TaskId;

    /**• 停止：pause，运行中状态的任务，支持停止，停止后变为暂停状态。
• 恢复：resume，暂停状态的任务，支持恢复，恢复后变为运行中状态
• 取消: cancel，运行中、暂停、等待状态的任务，支持取消，取消后变为完成状态*/
    @KsYunField(name="Operation")
    private String Operation;

}
