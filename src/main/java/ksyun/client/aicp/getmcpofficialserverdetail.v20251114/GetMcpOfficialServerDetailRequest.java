package ksyun.client.aicp.getmcpofficialserverdetail.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetMcpOfficialServerDetailRequest
* @Description 请求参数
*/
@Data
public class GetMcpOfficialServerDetailRequest{
    /**MCP服务ID*/
    @KsYunField(name="McpServerId")
    private String McpServerId;

}
