package ksyun.client.cen.detachnetworkinstance.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DetachNetworkInstanceRequest
 * @Description 请求参数
 */
@Data
public class DetachNetworkInstanceRequest {
    /**
     * 云企业网的ID
     */
    @KsYunField(name = "CenId")
    private String CenId;

    /**
     * 网络实例ID
     */
    @KsYunField(name = "NetworkInstanceId")
    private String NetworkInstanceId;

}