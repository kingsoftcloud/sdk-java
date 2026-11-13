package ksyun.client.aicp.getagent.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetAgentRequest
* @Description 请求参数
*/
@Data
public class GetAgentRequest{
    /***/
    @KsYunField(name="AgentId")
    private String AgentId;

}
