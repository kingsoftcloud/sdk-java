package ksyun.client.vpc.disassociateeip.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DisassociateEipRequest
* @Description 请求参数
*/
@Data
public class DisassociateEipRequest{
    /**要解绑EIP的NAT ID
> NAT2.0的ID才可调用*/
    @KsYunField(name="NatId")
    private String NatId;

    /**要解绑的EIP ID*/
    @KsYunField(name="FloatingIpIds",type=1)
    private List<String> FloatingIpIdsList;

}
