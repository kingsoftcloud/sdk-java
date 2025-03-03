package ksyun.client.iam.setuserssosettings.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname SetUserSsoSettingsRequest
 * @Description 请求参数
 */
@Data
public class SetUserSsoSettingsRequest {
    /**
     * 是否开启用户 SSO
     * 0否 1是
     */
    @KsYunField(name = "Status")
    private Integer Status;

    /**
     * 元数据文档。经过 Base64 编码
     */
    @KsYunField(name = "Metadata")
    private String Metadata;

    /**
     * 域名 状态开启时必填
     */
    @KsYunField(name = "Domain")
    private String Domain;

}