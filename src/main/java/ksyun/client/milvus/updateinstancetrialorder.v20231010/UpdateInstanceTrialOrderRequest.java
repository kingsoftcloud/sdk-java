package ksyun.client.milvus.updateinstancetrialorder.v20231010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateInstanceTrialOrderRequest
* @Description 请求参数
*/
@Data
public class UpdateInstanceTrialOrderRequest{
    /**实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**操作类型

```json
延期：delay
购买：buy  

注意：无默认，不区分大小写
```*/
    @KsYunField(name="OperateType")
    private String OperateType;

    /**延期或转正时间指定

```json
默认1，按日结算和按量付费不用指定
```*/
    @KsYunField(name="Duration")
    private Integer Duration;

    /**计费类型

```json
按量付费：87
按量付费（按日月结）：5
包年包月： 1

注意：默认为87=按量付费
```*/
    @KsYunField(name="BillType")
    private Integer BillType;

}
