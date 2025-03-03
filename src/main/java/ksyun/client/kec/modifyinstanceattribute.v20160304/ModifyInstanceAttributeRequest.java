package ksyun.client.kec.modifyinstanceattribute.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyInstanceAttributeRequest
 * @Description 请求参数
 */
@Data
public class ModifyInstanceAttributeRequest {
    /**
     * 待修改属性的实例ID
     * 标准UUID格式，形如`^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$`
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 实例名称，修改实例名称不需要关闭实例。
     * 最短2字符，最长64字符，支持中英文
     */
    @KsYunField(name = "InstanceName")
    private String InstanceName;

    /**
     * 实例开机密码
     * 最短8字符，最长32字符，必须包含大小写英文字符和数字，支持其他可见字符
     */
    @KsYunField(name = "InstancePassword")
    private String InstancePassword;

    /**
     * 操作系统内部的计算机名
     * 字符长度为[2, 64]，不支持点号（.），每段允许字母（不限制大小写）、数字和短横线（-）组成
     */
    @KsYunField(name = "HostName")
    private String HostName;

    /**
     * 重启模式描述,注:若已选择请求参数InstancePassword，则RestartMode不可缺省
     */
    @KsYunField(name = "RestartMode")
    private String RestartMode;


}