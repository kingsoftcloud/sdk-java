package ksyun.client.epc.disassociatecluster.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DisassociateClusterRequest
 * @Description 请求参数
 */
@Data
public class DisassociateClusterRequest {
    /**
     * 裸金属服务器资源ID
     */
    @KsYunField(name = "HostId")
    private String HostId;

}