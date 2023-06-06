package ksyun.client.vpc.createnetworkacl.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateNetworkAclRequest
* @Description 请求参数
*/
@Data
public class CreateNetworkAclRequest{
    /**Vpc的ID*/
    @KsYunField(name="VpcId")
    private String VpcId;

    /**ACL的名称*/
    @KsYunField(name="NetworkAclName")
    private String NetworkAclName;

    /**ACL的描述*/
    @KsYunField(name="Description")
    private String Description;


}