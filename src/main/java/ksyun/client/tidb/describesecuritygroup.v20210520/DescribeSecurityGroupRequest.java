package ksyun.client.tidb.describesecuritygroup.v20210520;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class DescribeSecurityGroupRequest {
    /**
     * 安全组ID。
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 规则模糊匹配，CIDR规则 or 描述
     */
    @KsYunField(name = "RuleFuzzySearch")
    private String RuleFuzzySearch;

    /**
     * 实例模糊匹配：实例名称 or IP
     */
    @KsYunField(name = "InstanceFuzzySearch")
    private String InstanceFuzzySearch;

}