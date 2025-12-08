package ksyun.client.epc.confirmprocess.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ConfirmProcessRequest
* @Description 请求参数
*/
@Data
public class ConfirmProcessRequest{
    /**工单id
状态要求：仅支持工单状态为已完成的工单进行客户评价
*/
    @KsYunField(name="OperationProcessId")
    private String OperationProcessId;

    /**客户确认是否维修完成可恢复业务
有效值：
• Available
• Unavailable*/
    @KsYunField(name="UserConfirmAvailable")
    private String UserConfirmAvailable;

}
