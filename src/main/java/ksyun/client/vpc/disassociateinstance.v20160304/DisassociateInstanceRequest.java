package ksyun.client.vpc.disassociateinstance.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DisassociateInstanceRequest
* @Description 请求参数
*/
@Data
public class DisassociateInstanceRequest{
    /**网卡ID*/
    @KsYunField(name="NetworkInterfaceId")
    private String NetworkInterfaceId;

    /**Nat的ID*/
    @KsYunField(name="NatId")
    private String NatId;

}
