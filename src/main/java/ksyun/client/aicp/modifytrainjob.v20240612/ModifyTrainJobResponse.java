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

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**训练任务ID*/
    @JsonProperty("TrainJobId")
    private String TrainJobId;

}
