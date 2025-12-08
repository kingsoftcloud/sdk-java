package ksyun.client.vpc.associateinstance.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AssociateInstanceRequest
* @Description 请求参数
*/
@Data
public class AssociateInstanceRequest{
    /**网卡ID*/
    @KsYunField(name="NetworkInterfaceId")
    private String NetworkInterfaceId;

    /**Nat的ID*/
    @KsYunField(name="NatId")
    private String NatId;

    /**要绑定的NatIp的ID值*/
    @KsYunField(name="NatIpId",type=2)
    private List<String> NatIpIdList;

}
