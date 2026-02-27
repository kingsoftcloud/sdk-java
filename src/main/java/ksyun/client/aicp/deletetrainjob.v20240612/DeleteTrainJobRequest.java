package ksyun.client.aicp.deletetrainjob.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteTrainJobRequest
* @Description 请求参数
*/
@Data
public class DeleteTrainJobRequest{
    /**训练任务ID*/
    @KsYunField(name="TrainJobId")
    private String TrainJobId;

}
