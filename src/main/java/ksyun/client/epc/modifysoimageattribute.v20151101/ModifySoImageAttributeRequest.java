package ksyun.client.epc.modifysoimageattribute.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifySoImageAttributeRequest
* @Description 请求参数
*/
@Data
public class ModifySoImageAttributeRequest{
    /**镜像的启动模式，不填则保持原有配置。取值：
• BIOS：BIOS启动模式
• UEFI：UEFI启动模式*/
    @KsYunField(name="BootMode")
    private String BootMode;

    /**镜像描述*/
    @KsYunField(name="Description")
    private String Description;

    /**自定义镜像ID。*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**镜像名称。*/
    @KsYunField(name="ImageName")
    private String ImageName;

    /**星海专区*/
    @KsYunField(name="SoZoneId")
    private String SoZoneId;

}
