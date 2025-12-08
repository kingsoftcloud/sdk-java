package ksyun.client.tidb.descregion.v20210520;

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
    /**地域标识。例如：cn-shanghai-2*/
    @KsYunField(name="RegionCode")
    private String RegionCode;

    /**产品线商品ID

```json
集群版:577
企业版:711
```*/
    @KsYunField(name="ProductType")
    private Integer ProductType;

}
