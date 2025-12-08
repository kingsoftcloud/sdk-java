package ksyun.client.milvus.bindsecuritygroupinstances.v20231010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname BindSecurityGroupInstancesResponse
* @Description BindSecurityGroupInstances 返回体
*/
@Data
@ToString
public class BindSecurityGroupInstancesResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Code")
    private String Code;

    /***/
    @JsonProperty("Message")
    private String Message;

    /***/
    @JsonProperty("Data")
    private Boolean Data;

}
