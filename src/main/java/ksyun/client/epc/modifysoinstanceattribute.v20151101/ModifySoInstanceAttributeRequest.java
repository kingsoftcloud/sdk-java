package ksyun.client.epc.modifysoinstanceattribute.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifySoInstanceAttributeRequest
* @Description 请求参数
*/
@Data
public class ModifySoInstanceAttributeRequest{
    /**实例删除保护属性，指定是否支持通过控制台或API删除实例。取值：
• true：开启实例删除保护。
• false：关闭实例删除保护。
示例值：true*/
    @KsYunField(name="DeletionProtection")
    private String DeletionProtection;

    /**实例的描述。
• 必须以字母或中文开头。
• 只能包含中文、字母、数字、点“.”、空格、下划线“_”、中划线“-”、等号“=”、英文逗号“,”、中文逗号“，”和中文句号“。”
• 长度限制在255个字符以内。
说明 传入空字符串时，将清空原有描述信息。
示例值：ECS instance for testing.*/
    @KsYunField(name="Description")
    private String Description;

    /**实例主机名，即实例操作系统内部的计算机名。
• Linux实例：
    ◦ 允许使用字母、数字、点号“.”或中划线“-”。
    ◦ 不能以中划线、点号开头或结尾，且不能连续使用中划线和点号。
    ◦ Linux系统长度限制在2～63个字符之间。
• Windows实例：
    ◦ 允许使用字母、数字或中划线“-”，不能完全是数字。
    ◦ 不能以中划线开头或结尾，且不能连续使用中划线。
    ◦ Windows系统长度限制在2～15个字符之间。
示例值：instance-host-name*/
    @KsYunField(name="Hostname")
    private String Hostname;

    /**实例ID。
示例值：4f35e8f7-f549-5c55-9531-5f43ca78*****/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**实例的名称。
• 以字母或中文开头。
• 只能包含中文、字母、数字、下划线“_”、中划线“-”和点号“.”。
• 长度限制为1～128个字符。
示例值：instance-test*/
    @KsYunField(name="InstanceName")
    private String InstanceName;

    /**示例值：password@123
使用“密码”方式登录实例时，请设置实例的登录密码。
• 长度限制在8～30之间。
• 密码只能由大写字母、小写字母、数字和特殊字符组成，且必须包含至少三项。
• 特殊字符可以使用：`~!@#$%^&*()_-+=|{}[]:;'<>,.?/
• 不能以“/”和“$6$”开头。*/
    @KsYunField(name="Password")
    private String Password;

    /**星海专区*/
    @KsYunField(name="SoZoneId")
    private String SoZoneId;

}