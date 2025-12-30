package ksyun.client.aicp.createtrainjob.v20240612;

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

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("TrainJobId")
    private String TrainJobId;

}
