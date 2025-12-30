package ksyun.client.aicp.modifytrainjob.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyTrainJobResponse
* @Description ModifyTrainJob 返回体
*/
@Data
@ToString
public class ModifyTrainJobResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("TrainJobId")
    private String TrainJobId;

}
