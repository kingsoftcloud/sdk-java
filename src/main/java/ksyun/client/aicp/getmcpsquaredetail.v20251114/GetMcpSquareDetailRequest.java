package ksyun.client.aicp.getmcpsquaredetail.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetMcpSquareDetailRequest
* @Description 请求参数
*/
@Data
public class GetMcpSquareDetailRequest{
    /**MCP服务ID*/
    @KsYunField(name="McpServerId")
    private String McpServerId;

}
