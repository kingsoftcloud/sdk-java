package ksyun.client.trade.createtrialtobuynow.v20250220;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateTrialToBuyNowRequest
 * @Description 请求参数
 */
@Data
public class CreateTrialToBuyNowRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "instanceId")
    private String InstanceId;

    /**
     * 计费方式。默认按照当前实例的计费方式进行转正。支持的计费方式列表通过ListInstanceSupportBillTypes接口获取
     */
    @KsYunField(name = "billType")
    private Integer BillType;

    /**
     * 转正为包年包月时，必须填写正式实例购买时长，单位月
     */
    @KsYunField(name = "duration")
    private Integer Duration;

}