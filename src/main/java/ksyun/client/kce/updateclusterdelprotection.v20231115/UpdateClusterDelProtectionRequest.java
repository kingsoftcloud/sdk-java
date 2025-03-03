package ksyun.client.kce.updateclusterdelprotection.v20231115;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdateClusterDelProtectionRequest
 * @Description 请求参数
 */
@Data
public class UpdateClusterDelProtectionRequest {
    /**
     * 集群Id
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 是否开启删除保护
     */
    @KsYunField(name = "EnableDelProtection")
    private Boolean EnableDelProtection;

}