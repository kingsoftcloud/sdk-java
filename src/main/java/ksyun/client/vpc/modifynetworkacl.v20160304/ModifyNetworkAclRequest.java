package ksyun.client.vpc.modifynetworkacl.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyNetworkAclRequest
* @Description 请求参数
*/
@Data
public class ModifyNetworkAclRequest{
    /**ACL的ID*/
    @KsYunField(name="NetworkAclId")
    private String NetworkAclId;

    /**ACL的名称*/
    @KsYunField(name="NetworkAclName")
    private String NetworkAclName;

    /**ACL的描述*/
    @KsYunField(name="Description")
    private String Description;


}