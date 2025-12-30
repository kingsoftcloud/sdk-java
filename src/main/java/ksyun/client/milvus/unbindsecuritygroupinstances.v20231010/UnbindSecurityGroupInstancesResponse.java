package ksyun.client.milvus.unbindsecuritygroupinstances.v20231010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UnbindSecurityGroupInstancesResponse
* @Description UnbindSecurityGroupInstances 返回体
*/
@Data
@ToString
public class UnbindSecurityGroupInstancesResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private Boolean Data;

}
