package ksyun.client.vpc.deletenetworkaclentry.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteNetworkAclEntryRequest
* @Description 请求参数
*/
@Data
public class DeleteNetworkAclEntryRequest{
    /**ACL的ID*/
    @KsYunField(name="NetworkAclId")
    private String NetworkAclId;

    /**ACL规则的ID*/
    @KsYunField(name="NetworkAclEntryId")
    private String NetworkAclEntryId;

}
