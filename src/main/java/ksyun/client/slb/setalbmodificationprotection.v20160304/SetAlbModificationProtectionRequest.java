package ksyun.client.slb.setalbmodificationprotection.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname SetAlbModificationProtectionRequest
 * @Description 请求参数
 */
@Data
public class SetAlbModificationProtectionRequest {
    /**
     * alb负载均衡id
     */
    @KsYunField(name = "albId")
    private String AlbId;

    /**
     * 修改保护on/off
     */
    @KsYunField(name = "modificationProtection")
    private String ModificationProtection;

}