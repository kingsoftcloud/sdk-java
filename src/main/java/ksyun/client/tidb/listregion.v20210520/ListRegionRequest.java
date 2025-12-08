package ksyun.client.tidb.listregion.v20210520;

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
    /**产品线ID

```json
集群版:577
企业版:711
```*/
    @KsYunField(name="ProductType")
    private Integer ProductType;

}
