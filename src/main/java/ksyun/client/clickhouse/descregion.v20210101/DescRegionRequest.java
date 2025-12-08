package ksyun.client.clickhouse.descregion.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescRegionRequest
* @Description 请求参数
*/
@Data
public class DescRegionRequest{
    /**商品类型
```json
高可用版:523
单副本版:676
```*/
    @KsYunField(name="ProductType")
    private Integer ProductType;

    /**地域编码。*/
    @KsYunField(name="RegionCode")
    private String RegionCode;

}
