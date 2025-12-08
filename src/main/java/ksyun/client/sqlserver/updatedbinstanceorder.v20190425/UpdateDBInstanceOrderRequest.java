package ksyun.client.sqlserver.updatedbinstanceorder.v20190425;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateDBInstanceOrderRequest
* @Description 请求参数
*/
@Data
public class UpdateDBInstanceOrderRequest{
    /**实例Id*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**操作类型

```json
试用延期：Renew
试用转正：Buy

```*/
    @KsYunField(name="UpdateUse")
    private String UpdateUse;

    /**持续时间

```json
注意：选定续费或者转正方式为包年包月是，需要指定持续时间；
```*/
    @KsYunField(name="Duration")
    private Integer Duration;

    /**计费类型

```json
包年包月：YEAR_MONTH
按日月结（按日配置付费月结）：DAY
按小时实时结算：HourlyInstantSettlement

注意：若不选定计费类型，则默认为HourlyInstantSettlement
```*/
    @KsYunField(name="BillType")
    private String BillType;

}
