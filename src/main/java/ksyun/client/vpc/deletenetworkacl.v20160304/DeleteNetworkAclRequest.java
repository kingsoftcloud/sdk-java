package ksyun.client.vpc.deletenetworkacl.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteNetworkAclRequest
 * @Description 请求参数
 */
@Data
public class DeleteNetworkAclRequest {
    /**
     * ACL的ID
     */
    @KsYunField(name = "NetworkAclId")
    private String NetworkAclId;

}