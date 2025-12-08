package ksyun.client.trade.deletetrialtobuytask.v20250220;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteTrialToBuyTaskRequest
* @Description 请求参数
*/
@Data
public class DeleteTrialToBuyTaskRequest{
    /**实例id*/
    @KsYunField(name="instanceId")
    private String InstanceId;

}
