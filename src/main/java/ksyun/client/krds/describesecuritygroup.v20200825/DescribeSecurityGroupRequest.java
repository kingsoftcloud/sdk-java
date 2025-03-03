package ksyun.client.krds.describesecuritygroup.v20200825;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class DescribeSecurityGroupRequest {
    /**
     * 安全组ID列表，不传的时候返回列表，传值展示指定ID的安全组信息。
     */
    @KsYunField(name = "SecurityGroupId.N")
    private String SecurityGroupIdN;

    /**
     * 取值范围：IPV4 / IPV6 （默认IPV4）
     */
    @KsYunField(name = "SecurityGroupType")
    private String SecurityGroupType;


}