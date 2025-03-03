package ksyun.client.vpc.acceptvpcpeeringconnection.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AcceptVpcPeeringConnectionRequest
 * @Description 请求参数
 */
@Data
public class AcceptVpcPeeringConnectionRequest {
    /**
     * 对等连接的ID
     */
    @KsYunField(name = "VpcPeeringConnectionId")
    private String VpcPeeringConnectionId;

}