package ksyun.client.clickhouse.listregion.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListRegionRequest
* @Description 请求参数
*/
@Data
public class ListRegionRequest{
    /**商品类型

```json
高可用版:523
单副本版:676
```*/
    @KsYunField(name="ProductType")
    private Integer ProductType;

}
