package ksyun.client.postgresql.modifyinstanceaccountinfo.v20181225;

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
    /**实例id*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**实例名称*/
    @KsYunField(name="AccountName")
    private String AccountName;

    /**实例密码*/
    @KsYunField(name="AccountPassword")
    private String AccountPassword;

    /**数据库账户描述*/
    @KsYunField(name="AccountDescription")
    private String AccountDescription;

}
