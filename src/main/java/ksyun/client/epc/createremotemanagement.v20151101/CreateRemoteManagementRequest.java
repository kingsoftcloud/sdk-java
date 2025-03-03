package ksyun.client.epc.createremotemanagement.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateRemoteManagementRequest
 * @Description 请求参数
 */
@Data
public class CreateRemoteManagementRequest {
    /**
     * 手机动态码
     */
    @KsYunField(name = "DynamicCode")
    private String DynamicCode;

    /**
     * 个人识别码
     */
    @KsYunField(name = "Pin")
    private String Pin;

    /**
     * 手机号码
     */
    @KsYunField(name = "PhoneNumber")
    private String PhoneNumber;

    /**
     * 姓名
     */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * 版本ID
     */
    @KsYunField(name = "VersionId")
    private Integer VersionId;

}