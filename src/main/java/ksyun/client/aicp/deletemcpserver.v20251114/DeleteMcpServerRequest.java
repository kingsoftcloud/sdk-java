package ksyun.client.aicp.deletemcpserver.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteMcpServerRequest
* @Description 请求参数
*/
@Data
public class DeleteMcpServerRequest{
    /**MCP服务ID（必填）*/
    @KsYunField(name="McpServerId")
    private String McpServerId;

}
