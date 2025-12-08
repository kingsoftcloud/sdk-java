package ksyun.client.aicp.starttrainjob.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StartTrainJobRequest
* @Description 请求参数
*/
@Data
public class StartTrainJobRequest{
    /***/
    @KsYunField(name="TrainJobId")
    private String TrainJobId;

}
