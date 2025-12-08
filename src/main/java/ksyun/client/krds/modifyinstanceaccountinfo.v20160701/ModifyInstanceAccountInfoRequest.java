package ksyun.client.krds.modifyinstanceaccountinfo.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyInstanceAccountInfoRequest
* @Description 请求参数
*/
@Data
public class ModifyInstanceAccountInfoRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**数据库帐号名称*/
    @KsYunField(name="InstanceAccountName")
    private String InstanceAccountName;

    /**数据库帐号新密码		必须包含大小写字母和数字，支持的特殊字符为!@#$%^&*()_+=-*/
    @KsYunField(name="InstanceAccountPassword")
    private String InstanceAccountPassword;

    /**数据库帐号描述		帐号描述不填则不作修改*/
    @KsYunField(name="InstanceAccountDescription")
    private String InstanceAccountDescription;

}
