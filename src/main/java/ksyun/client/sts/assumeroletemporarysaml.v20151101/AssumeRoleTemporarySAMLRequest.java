package ksyun.client.sts.assumeroletemporarysaml.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname AssumeRoleTemporarySAMLRequest
 * @Description 请求参数
 */
@Data
public class AssumeRoleTemporarySAMLRequest {
    /**
     * 要扮演的IAM角色的KRN，参考格式：krn:ksc:iam::account-id:role/role-name。
     * <p>
     * 您可以通过IAM控制台访问对应角色详情页查询对应角色的KRN信息。
     */
    @KsYunField(name = "RoleKrn")
    private String RoleKrn;

    /**
     * 角色会话名称。
     * 该参数为用户自定义参数。通常设置为调用该API的用户身份来区分实际不同的操作者。
     */
    @KsYunField(name = "RoleSessionName")
    private String RoleSessionName;

    /**
     * 过期时间。单位：秒。
     * <p>
     * 过期时间最小值为900秒，最大值为86400秒，默认值为3600秒。
     */
    @KsYunField(name = "DurationSeconds")
    private String DurationSeconds;

    /**
     * 为STS Token额外添加的一个权限策略，进一步限制STS Token的权限。具体如下：
     * 如果指定该权限策略，则STS Token最终的权限策略取IAM角色权限策略与该权限策略的交集。
     * 如果不指定该权限策略，则STS Token最终的权限策略取IAM角色的权限策略。
     * 长度为1~1024个字符。
     * <p>
     * 格式：
     * <p>
     * {
     * “Version”: “2015-11-01”,
     * “Statement”: [
     * {
     * “Effect”: “Allow”,
     * “Action”: “",
     * “Resource”: "”
     * }
     * ]
     * }
     */
    @KsYunField(name = "Policy")
    private String Policy;

}