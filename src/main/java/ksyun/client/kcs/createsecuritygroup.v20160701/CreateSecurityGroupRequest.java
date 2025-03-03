package ksyun.client.kcs.createsecuritygroup.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class CreateSecurityGroupRequest {
    /**
     * 可用区     	 默认：对应机房的a区
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 安全组名称。 	 安全组名称支持1-64个字符，中文，字母，数字，中划线，下划线。
     */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * 安全组描述。 	 安全组描述支持1-64个字符，中文，字母，数字，中划线，下划线。
     */
    @KsYunField(name = "Description")
    private String Description;

}