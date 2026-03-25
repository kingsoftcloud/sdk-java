package ksyun.client.aicp.activatemcpofficialserver.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ActivateMcpOfficialServerRequest
* @Description 请求参数
*/
@Data
public class ActivateMcpOfficialServerRequest{
    /**MCP服务ID*/
    @KsYunField(name="McpServerId")
    private String McpServerId;

    /**认证字段值*/
    @KsYunField(name="AuthFieldValue")
    private String AuthFieldValue;

}
