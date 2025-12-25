package ksyun.client.epc.runsoinstances.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RunSoInstancesRequest
* @Description 请求参数
*/
@Data
public class RunSoInstancesRequest{
    /**镜像ID*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**实例名称*/
    @KsYunField(name="InstanceName")
    private String InstanceName;

    /**机型*/
    @KsYunField(name="InstanceTypeId")
    private String InstanceTypeId;

    /**安全组*/
    @KsYunField(name = "SecurityGroupId", type = 1)
    private List<String> SecurityGroupIdList;

    /**子网ID*/
    @KsYunField(name="SubnetId")
    private String SubnetId;

    /***/
    @KsYunField(name="Volumes")
    private VolumesDto Volumes;

    @Data
    @ToString
    public static class VolumesDto {
        /**硬盘大小*/
        @KsYunField(name = "Size", type = 1)
        private List<Integer> SizeList;

    }

    /**可用区*/
    @KsYunField(name="ZoneId")
    private String ZoneId;

    /**实例的描述，默认为空字符串。
    ◦ 必须以字母或中文开头。
    ◦ 只能包含中文、字母、数字、点号“.”、空格、下划线“_”、中划线“-”、等号“=”、英文逗号“,”、中文逗号“，”和中文句号“。”
    ◦ 长度限制在255个字符以内。
示例值：用于测试的云服务器实例*/
    @KsYunField(name="Description")
    private String Description;

    /**实例主机名，即实例操作系统内部的计算机名。
    ◦ Linux实例：
    ◦ 允许使用字母、数字、点号“.”或中划线“-”。
    ◦ 不能以中划线、点号开头或结尾，且不能连续使用中划线和点号。
    ◦ Linux系统长度限制在2～63个字符之间。*/
    @KsYunField(name="HostName")
    private String HostName;

    /**实例和云盘的计费类型，取值：
    ◦ 包年包月Monthly
    ◦ 按量付费（按日月结）Daily（默认）*/
    @KsYunField(name="InstanceChargeType")
    private String InstanceChargeType;

    /**是否保留镜像设置，取值：
    ◦ true：保留镜像设置，保留后将使用镜像预设的密码或密钥对登录实例。
    ◦ false（默认）：不保留镜像设置。
    说明
    ◦ 仅自定义镜像支持该功能。
    ◦ 该参数取值为true时，请勿传入PassWord和KeyPairName。
示例值：true*/
    @KsYunField(name="KeepImageCredential")
    private Boolean KeepImageCredential;

    /**如需使用“SSH密钥”方式登录实例，请指定已创建密钥对的名称。
    说明
    ◦ Windows实例不支持SSH密钥方式，即使传入了该参数，仍旧只生效密码Password。
    ◦ Linux实例支持密码或密钥对登录。调用该接口时如果同时设置了密钥对KeyPairName和密码Password，则仅生效密钥对KeyPairName。
示例值：kp-test-123*/
    @KsYunField(name="KeyPairName")
    private String KeyPairName;

    /**如需使用“密码”方式登录实例，请通过该参数指定实例的管理员账号初始登录密码。其中Linux管理员账号为root，Windows管理员账号为Administrator。
    密码复杂度要求如下：
    ◦ 长度限制在8～30之间。
    ◦ 密码只能由大写字母、小写字母、数字和特殊字符组成，且必须包含至少三项。
    ◦ 特殊字符可以使用：`~!@#$%^&*()_-+=|{}[]:;'<>,.?/
    ◦ 不能以“/”和“$6$”开头。
    说明：登录凭证支持“密码”、“密钥对”、“保留镜像设置”三种方式，使用“密码”方式登录实例时，建议增加密码复杂度以提高安全性。*/
    @KsYunField(name="Password")
    private String Password;

    /**购买资源的时长（月）。
    ◦ 取值：1、2、3、4、5、6、7、8、9、12、24、36、48、60
    ◦ 默认值：1
说明：仅当参数InstanceChargeType取值为Monthly时，该参数生效且为必选值*/
    @KsYunField(name="Period")
    private Integer Period;

    /**有序后缀的起始序号，取值：1～999，默认值为1。
示例值：1*/
    @KsYunField(name="SuffixIndex")
    private Integer SuffixIndex;

    /**表示当创建多台实例时，是否为Hostname和InstanceName自动添加有序后缀，取值：
    ◦ true：开启有序后缀。
    ◦ false（默认）：关闭有序后缀。*/
    @KsYunField(name="UniqueSuffix")
    private Boolean UniqueSuffix;

    /**创建实例时是否安装云助手Agent，取值：
    ◦ true：创建时安装。
    ◦ false（默认）：创建时不安装。
*/
    @KsYunField(name="InstallRunCommandAgent")
    private Boolean InstallRunCommandAgent;

    /**创建数量，取值范围：1～100；传入0时，会默认为1。
示例值：1*/
    @KsYunField(name="Count")
    private Integer Count;

    /**星海专区*/
    @KsYunField(name="SoZoneId")
    private String SoZoneId;

    /**实例自定义数据。设置的自定义数据必须经过Base64编码，且Base64编码前的自定义数据大小不能超过16KB。
不填则默认为空。
示例值：ZWNobyBoZWxsbyBlY3Mh*/
    @KsYunField(name="UserData")
    private String UserData;

}
