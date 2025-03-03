package ksyun.client.kad.createforwardsource.v20161122;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateForwardSourceRequest
 * @Description 请求参数
 */
@Data
public class CreateForwardSourceRequest {
    /**
     * 四层转发配置的ID
     */
    @KsYunField(name = "ForwardConfId")
    private String ForwardConfId;

    /**
     * 源站IP
     */
    @KsYunField(name = "SourceIp")
    private String SourceIp;

    /**
     * 源站端口
     */
    @KsYunField(name = "SourcePort")
    private String SourcePort;


}