package ksyun.client.postgresql.createinstanceaccount.v20181225;

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
public class CreateInstanceAccountRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**账号名称

```json
长度为2~16个字符，由小写字母、数字或下划线组成，但开头需为字母，结尾需为字母或数字
```*/
    @KsYunField(name="AccountName")
    private String AccountName;

    /**账号密码*/
    @KsYunField(name="AccountPassword")
    private String AccountPassword;

    /**账号描述*/
    @KsYunField(name="AccountDescription")
    private String AccountDescription;

}
