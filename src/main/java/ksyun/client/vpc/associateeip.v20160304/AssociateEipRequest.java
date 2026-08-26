package ksyun.client.vpc.associateeip.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AssociateEipRequest
* @Description 请求参数
*/
@Data
public class AssociateEipRequest{
    /**要绑定EIP的NAT2.0的ID
> NAT2.0的ID才可调用*/
    @KsYunField(name="NatId")
    private String NatId;

    /**需要绑定至NAT的EIP ID
> 多个EIP需要使用同一种链路*/
    @KsYunField(name="FloatingIpIds",type=1)
    private List<String> FloatingIpIdsList;

}
