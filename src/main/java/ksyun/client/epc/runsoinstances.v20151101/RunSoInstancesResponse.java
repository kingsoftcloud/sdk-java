package ksyun.client.epc.runsoinstances.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RunSoInstancesResponse
* @Description RunSoInstances 返回体
*/
@Data
@ToString
public class RunSoInstancesResponse extends BaseResponseModel {
    /**实例ID*/
    @JsonProperty("InstanceIds")
    private List<String> InstanceIds;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
