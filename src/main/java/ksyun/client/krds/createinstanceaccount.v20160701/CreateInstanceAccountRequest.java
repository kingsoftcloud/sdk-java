package ksyun.client.krds.createinstanceaccount.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateInstanceAccountRequest
 * @Description 请求参数
 */
@Data
public class CreateInstanceAccountRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 账号名称	。root, rdsrepladmin, rdsadmin, dtsroot, sa不可用；由大小写字母、数字或下划线组成，以小写字母开头，以小写字母或数字结尾，长度为2~16个字符。
     */
    @KsYunField(name = "InstanceAccountName")
    private String InstanceAccountName;

    /**
     * 账号密码	。8-30个字符，必须包含大小写字母和数字；支持的特殊字符：!@#$%^&*()_+=-
     */
    @KsYunField(name = "InstanceAccountPassword")
    private String InstanceAccountPassword;

    /**
     * 数据库账号描述。
     */
    @KsYunField(name = "InstanceAccountDescription")
    private String InstanceAccountDescription;

}