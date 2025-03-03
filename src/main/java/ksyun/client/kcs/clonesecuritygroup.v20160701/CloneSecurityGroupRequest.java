package ksyun.client.kcs.clonesecuritygroup.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CloneSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class CloneSecurityGroupRequest {
    /**
     * 可用区。     	 默认：对应机房的a区</br>注意：未指定和源安全组相同可用区，则默认克隆至机房a区。
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 安全组名称。 	 安全组名称支持1-64个字符，中文，字母，数字，中划线，下划线。
     */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * 安全组描述。	 安全组描述支持1-64个字符，中文，字母，数字，中划线，下划线。
     */
    @KsYunField(name = "Description")
    private String Description;

    /**
     * 源安全组ID。
     */
    @KsYunField(name = "SrcSecurityGroupId")
    private String SrcSecurityGroupId;


}