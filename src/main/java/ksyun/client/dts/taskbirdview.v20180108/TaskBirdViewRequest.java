package ksyun.client.dts.taskbirdview.v20180108;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname TaskBirdViewRequest
 * @Description 请求参数
 */
@Data
public class TaskBirdViewRequest {
    /**
     * 任务类型
     * <p>
     * ```json
     * 默认：Transmission 
     * <p>
     * 范围：
     * 数据迁移	Transmission
     * 数据同步	Synchronous
     * 数据订阅	Subscription
     * ```
     */
    @KsYunField(name = "taskType")
    private String TaskType;

}