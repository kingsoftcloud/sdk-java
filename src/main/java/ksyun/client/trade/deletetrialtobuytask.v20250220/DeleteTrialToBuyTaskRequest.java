package ksyun.client.trade.deletetrialtobuytask.v20250220;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteTrialToBuyTaskRequest
 * @Description 请求参数
 */
@Data
public class DeleteTrialToBuyTaskRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "instanceId")
    private String InstanceId;

}