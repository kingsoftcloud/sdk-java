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
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("TrainJobId")
    private String TrainJobId;

}
