package ksyun.client.postgresql.describesecuritygroup.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class DescribeSecurityGroupRequest {
    /**
     * 安全组ID
     * <p>
     * ```json
     * 根据安全组ID筛选,若不指定则为查询列表
     * ```
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

}