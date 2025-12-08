package ksyun.client.tidb.updateinstancetrialorder.v20210520;

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
试用延期：delay
试用转正：buy

注意：无默认，不区分大小写
```*/
    @KsYunField(name="OperateType")
    private String OperateType;

    /**计费类型

```json
包年包月：1
按量付费：87
按量付费（按日月结）：5
```*/
    @KsYunField(name="BillType")
    private Integer BillType;

    /**延期或转正时间

```json
默认1天/年，按日结算和按量付费不用指定
```*/
    @KsYunField(name="Duration")
    private Integer Duration;

}
