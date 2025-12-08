package ksyun.client.tidb.modifyaccountprivileges.v20210520;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyAccountPrivilegesRequest
* @Description 请求参数
*/
@Data
public class ModifyAccountPrivilegesRequest{
    /**实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**账户名称*/
    @KsYunField(name="AccountName")
    private String AccountName;

    /**旧权限列表:Map<string,string> */
    @KsYunField(name="OldPrivileges")
    private String OldPrivileges;

    /**新权限:Map<string,string> */
    @KsYunField(name="NewPrivileges")
    private String NewPrivileges;

}
