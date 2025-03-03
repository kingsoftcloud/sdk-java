package ksyun.client.vpc.modifydirectconnect.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyDirectConnectRequest
 * @Description 请求参数
 */
@Data
public class ModifyDirectConnectRequest {
    /**
     * 物理端口ID
     */
    @KsYunField(name = "DirectConnectId")
    private String DirectConnectId;

    /**
     * 专线的名称
     */
    @KsYunField(name = "DirectConnectName")
    private String DirectConnectName;

}