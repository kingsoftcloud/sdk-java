package ksyun.client.vpc.associatenetworkacl.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AssociateNetworkAclRequest
* @Description 请求参数
*/
@Data
public class AssociateNetworkAclRequest{
    /**子网的ID*/
    @KsYunField(name="SubnetId")
    private String SubnetId;

    /**ACL的ID*/
    @KsYunField(name="NetworkAclId")
    private String NetworkAclId;


}