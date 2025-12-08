package ksyun.client.kce.describeagentstatus.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAgentStatusResponse
* @Description DescribeAgentStatus 返回体
*/
@Data
@ToString
public class DescribeAgentStatusResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /**agent状态-有效值：
Pending-关联中
Healthy-正常
Unhealthy-异常
Failed-关联失败
Terminating-解除关联中
Deleted-已解除关联
Unknown-未知*/
    @JsonProperty("AgentsStatus")
    private String AgentsStatus;

    /***/
    @JsonProperty("Message")
    private String Message;

}
