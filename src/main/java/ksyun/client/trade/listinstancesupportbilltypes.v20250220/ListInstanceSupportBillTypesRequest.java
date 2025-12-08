package ksyun.client.trade.listinstancesupportbilltypes.v20250220;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListInstanceSupportBillTypesRequest
* @Description 请求参数
*/
@Data
public class ListInstanceSupportBillTypesRequest{
    /**实例ID*/
    @KsYunField(name="instanceId")
    private String InstanceId;

}
