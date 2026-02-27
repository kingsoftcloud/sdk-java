package ksyun.client.aicp.stoptrainjob.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StopTrainJobResponse
* @Description StopTrainJob 返回体
*/
@Data
@ToString
public class StopTrainJobResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**训练任务ID*/
    @JsonProperty("TrainJobId")
    private String TrainJobId;

}
