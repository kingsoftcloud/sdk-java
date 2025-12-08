package ksyun.client.clickhouse.createsecuritygroup.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateSecurityGroupRequest
* @Description 请求参数
*/
@Data
public class CreateSecurityGroupRequest{
    /**商品类型

```json
高可用版:523
单副本版:676

注意：仅做标记，取默认值即可
```*/
    @KsYunField(name="ProductType")
    private Integer ProductType;

    /**安全组名称。*/
    @KsYunField(name="SecurityGroupName")
    private String SecurityGroupName;

    /**安全组描述。*/
    @KsYunField(name="Description")
    private String Description;

}
