package ksyun.client.postgresql.modifyinstanceaccountinfo.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyInstanceAccountInfoRequest
 * @Description 请求参数
 */
@Data
public class ModifyInstanceAccountInfoRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 实例名称
     */
    @KsYunField(name = "InstanceAccountName")
    private String InstanceAccountName;

    /**
     * 实例密码
     */
    @KsYunField(name = "InstanceAccountPassword")
    private String InstanceAccountPassword;

    /**
     * 数据库账户描述
     */
    @KsYunField(name = "InstanceAccountDescription")
    private String InstanceAccountDescription;


}