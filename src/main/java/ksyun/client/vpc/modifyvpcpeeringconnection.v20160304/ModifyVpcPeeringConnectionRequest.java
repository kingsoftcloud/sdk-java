package ksyun.client.vpc.modifyvpcpeeringconnection.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyVpcPeeringConnectionRequest
* @Description 请求参数
*/
@Data
public class ModifyVpcPeeringConnectionRequest{
    /**对等连接的ID*/
    @KsYunField(name="VpcPeeringConnectionId")
    private String VpcPeeringConnectionId;

    /**对等连接的名称*/
    @KsYunField(name="PeeringName")
    private String PeeringName;

    /**对等连接的带宽*/
    @KsYunField(name="BandWidth")
    private Integer BandWidth;


}