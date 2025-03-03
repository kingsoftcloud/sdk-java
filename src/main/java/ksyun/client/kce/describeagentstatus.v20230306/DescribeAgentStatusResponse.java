package ksyun.client.kce.describeagentstatus.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeAgentStatusResponse
 * @Description DescribeAgentStatus 返回体
 */
@Data
@ToString
public class DescribeAgentStatusResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
