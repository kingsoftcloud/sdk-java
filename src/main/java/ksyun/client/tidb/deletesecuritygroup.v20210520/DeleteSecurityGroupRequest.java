package ksyun.client.tidb.deletesecuritygroup.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class DeleteSecurityGroupRequest {
    /**
     * 安全组ID列表。多个安全组ID请用英文逗号隔开。
     */
    @KsYunField(name = "SecurityGroupIds")
    private String SecurityGroupIds;

}