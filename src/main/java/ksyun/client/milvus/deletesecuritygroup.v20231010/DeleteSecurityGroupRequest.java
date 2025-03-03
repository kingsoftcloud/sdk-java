package ksyun.client.milvus.deletesecuritygroup.v20231010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class DeleteSecurityGroupRequest {
    /**
     * 安全组ID列表，支持批量(可英文逗号隔开)
     */
    @KsYunField(name = "SecurityGroupIds")
    private String SecurityGroupIds;

}