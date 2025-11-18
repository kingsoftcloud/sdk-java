package ksyun.client.aicp.modifytrainjob.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyTrainJobRequest
* @Description 请求参数
*/
@Data
public class ModifyTrainJobRequest{
    /**训练任务Id*/
    @KsYunField(name="TrainJobId")
    private String TrainJobId;

    /**优先级，可选值：
 ·kaic-high
 ·kaic-normal
 ·kaic-low*/
    @KsYunField(name="Priority")
    private String Priority;

}