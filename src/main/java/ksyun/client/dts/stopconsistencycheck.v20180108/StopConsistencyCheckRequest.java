package ksyun.client.dts.stopconsistencycheck.v20180108;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname StopConsistencyCheckRequest
 * @Description 请求参数
 */
@Data
public class StopConsistencyCheckRequest {
    /**
     * 主任务ID。
     */
    @KsYunField(name = "TaskId")
    private String TaskId;

}