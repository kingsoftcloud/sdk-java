package ksyun.client.krds.updateresourceprotection.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateResourceProtectionRequest
* @Description 请求参数
*/
@Data
public class UpdateResourceProtectionRequest{
    /**实例id*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**保护开关

```json
开启：ON 关闭：OFF 
```*/
    @KsYunField(name="ProtectionSwitch")
    private String ProtectionSwitch;

    /**操作理由

```json
限定64字符
```*/
    @KsYunField(name="ProtectionReason")
    private String ProtectionReason;

}
