package ksyun.client.aicp.deletetrainjob.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteTrainJobResponse
* @Description DeleteTrainJob 返回体
*/
@Data
@ToString
public class DeleteTrainJobResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("TrainJobId")
    private String TrainJobId;

}
