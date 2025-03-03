package ksyun.client.slb.setprivatelinkdeleteprotection.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname SetPrivateLinkDeleteProtectionRequest
 * @Description 请求参数
 */
@Data
public class SetPrivateLinkDeleteProtectionRequest {
    /**
     * 实例的ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 删除保护
     */
    @KsYunField(name = "DeleteProtection")
    private String DeleteProtection;

}