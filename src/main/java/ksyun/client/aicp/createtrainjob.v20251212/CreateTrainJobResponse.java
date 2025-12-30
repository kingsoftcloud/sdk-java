package ksyun.client.aicp.createtrainjob.v20251212;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateTrainJobResponse
* @Description CreateTrainJob 返回体
*/
@Data
@ToString
public class CreateTrainJobResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**训练任务的ID*/
    @JsonProperty("TrainJobId")
    private String TrainJobId;

}
