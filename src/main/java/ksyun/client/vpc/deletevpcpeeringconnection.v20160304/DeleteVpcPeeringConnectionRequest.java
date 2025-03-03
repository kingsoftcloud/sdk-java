package ksyun.client.vpc.deletevpcpeeringconnection.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteVpcPeeringConnectionRequest
 * @Description 请求参数
 */
@Data
public class DeleteVpcPeeringConnectionRequest {
    /**
     * 对等连接的ID
     */
    @KsYunField(name = "VpcPeeringConnectionId")
    private String VpcPeeringConnectionId;

}