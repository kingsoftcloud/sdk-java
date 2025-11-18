package ksyun.client.aicp.stoptrainjob.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StopTrainJobRequest
* @Description 请求参数
*/
@Data
public class StopTrainJobRequest{
    /**训练任务Id*/
    @KsYunField(name="TrainJobId")
    private String TrainJobId;

}