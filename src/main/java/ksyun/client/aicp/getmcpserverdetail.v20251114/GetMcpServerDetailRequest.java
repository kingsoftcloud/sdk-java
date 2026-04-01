package ksyun.client.aicp.getmcpserverdetail.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetMcpServerDetailRequest
* @Description 请求参数
*/
@Data
public class GetMcpServerDetailRequest{
    /**MCP服务ID*/
    @KsYunField(name="McpServerId")
    private String McpServerId;

}
