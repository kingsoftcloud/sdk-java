package ksyun.client.kec.modifyimageattribute.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyImageAttributeRequest
 * @Description 请求参数
 */
@Data
public class ModifyImageAttributeRequest {
    /**
     * 待修改属性的镜像ID。
     * 16f55e1d-8ab3-4026-ba4d-5ae9e6f083db
     */
    @KsYunField(name = "ImageId")
    private String ImageId;

    /**
     * 新镜像的名称。
     * 2-64个字符，支持中文、字母、数字以及-_@#.字符
     */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * 版本名称
     */
    @KsYunField(name = "OsVersion")
    private String OsVersion;

    /**
     * 客户自行安装cloudinit后，需要将该值修改为true，本接口取值：true,false
     */
    @KsYunField(name = "CloudInitSupport")
    private Boolean CloudInitSupport;

}