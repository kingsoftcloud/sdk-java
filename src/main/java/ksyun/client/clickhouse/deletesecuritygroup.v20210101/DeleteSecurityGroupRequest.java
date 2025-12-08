package ksyun.client.clickhouse.deletesecuritygroup.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteSecurityGroupRequest
* @Description 请求参数
*/
@Data
public class DeleteSecurityGroupRequest{
    /**安全组ID列表。*/
    @KsYunField(name="SecurityGroupIds")
    private String SecurityGroupIds;

    /**商品类型：Clickhouse固定取值：523。

```json
高可用版:523
单副本版:676
```*/
    @KsYunField(name="ProductType")
    private Integer ProductType;

}
