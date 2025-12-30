package ksyun.client.aicp.starttrainjob.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StartTrainJobResponse
* @Description StartTrainJob 返回体
*/
@Data
@ToString
public class StartTrainJobResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("TrainJobId")
    private String TrainJobId;

}
