package ksyun.client.kce.updatenodepooldelprotection.v20190806;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdateNodePoolDelProtectionRequest
 * @Description 请求参数
 */
@Data
public class UpdateNodePoolDelProtectionRequest {
    /**
     * 节点池Id
     */
    @KsYunField(name = "NodePoolId")
    private String NodePoolId;

    /**
     * 是否开启删除保护
     */
    @KsYunField(name = "EnableDelProtection")
    private Boolean EnableDelProtection;

}