package ksyun.client.trade.listinstancesupportbilltypes.v20250220;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListInstanceSupportBillTypesRequest
 * @Description 请求参数
 */
@Data
public class ListInstanceSupportBillTypesRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "instanceId")
    private String InstanceId;

}