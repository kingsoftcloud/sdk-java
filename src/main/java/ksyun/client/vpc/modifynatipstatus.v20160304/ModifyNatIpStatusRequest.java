package ksyun.client.vpc.modifynatipstatus.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyNatIpStatusRequest
 * @Description 请求参数
 */
@Data
public class ModifyNatIpStatusRequest {
    /**
     * NatIp的ID
     */
    @KsYunField(name = "NatIpId")
    private String NatIpId;

    /**
     * NatIp的禁用状态
     */
    @KsYunField(name = "Enabled")
    private Boolean Enabled;

}