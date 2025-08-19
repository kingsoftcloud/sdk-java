package ksyun.client.epc.replacesosystemvolume.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ReplaceSoSystemVolumeRequest
* @Description 请求参数
*/
@Data
public class ReplaceSoSystemVolumeRequest{
    /**更换操作系统时使用的镜像ID。*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**实例ID。*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**使用镜像预设密码/密钥对登录实例。取值：
• true：使用镜像预设密码/密钥对登录。
• false（默认）：不使用镜像预设密码/密钥对登录。
说明
• 仅自定义镜像支持使用该功能。
• 该参数为true时，请勿传入PassWord和KeyPairName。*/
    @KsYunField(name="KeepImageCredential")
    private Boolean KeepImageCredential;

    /**重置密钥对。
说明
• 仅对Linux操作系统的实例生效。
• KeepImageCredential为false时，本参数与Password不能同时为空。
• 若同时设置了密钥对KeyPairName和密码Password，则仅生效密钥对KeyPairName。*/
    @KsYunField(name="KeyPairName")
    private String KeyPairName;

    /**重置密码*/
    @KsYunField(name="Password")
    private String Password;

}