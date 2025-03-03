package ksyun.client.slb.setalbdeleteprotection.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname SetAlbDeleteProtectionRequest
 * @Description 请求参数
 */
@Data
public class SetAlbDeleteProtectionRequest {
    /**
     * alb负载均衡id
     */
    @KsYunField(name = "albId")
    private String AlbId;

    /**
     * 删除保护on/off
     */
    @KsYunField(name = "deleteProtection")
    private String DeleteProtection;

}