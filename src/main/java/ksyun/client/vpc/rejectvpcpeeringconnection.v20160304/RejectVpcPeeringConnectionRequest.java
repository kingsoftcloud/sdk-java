package ksyun.client.vpc.rejectvpcpeeringconnection.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RejectVpcPeeringConnectionRequest
 * @Description 请求参数
 */
@Data
public class RejectVpcPeeringConnectionRequest {
    /**
     * 对等连接的ID
     */
    @KsYunField(name = "VpcPeeringConnectionId")
    private String VpcPeeringConnectionId;

}