package ksyun.client.vpc.acceptvpcpeeringconnection.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AcceptVpcPeeringConnectionRequest
* @Description 请求参数
*/
@Data
public class AcceptVpcPeeringConnectionRequest{
    /**对等连接的ID*/
    @KsYunField(name="VpcPeeringConnectionId")
    private String VpcPeeringConnectionId;

}
