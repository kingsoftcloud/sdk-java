package ksyun.client.tidb.modifyaccountinfo.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyAccountInfoRequest
 * @Description 请求参数
 */
@Data
public class ModifyAccountInfoRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 账户名
     */
    @KsYunField(name = "AccountName")
    private String AccountName;

    /**
     * 账户密码
     */
    @KsYunField(name = "AccountPassword")
    private String AccountPassword;

    /**
     * 账户类型:非必传，修改管理员用户的时候需指定'admin'
     */
    @KsYunField(name = "AccountType")
    private String AccountType;

}