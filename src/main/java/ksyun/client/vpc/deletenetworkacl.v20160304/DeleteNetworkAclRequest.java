package ksyun.client.vpc.deletenetworkacl.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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