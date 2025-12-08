package ksyun.client.trade.addtrialtobuytask.v20250220;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AddTrialToBuyTaskRequest
* @Description 请求参数
*/
@Data
public class AddTrialToBuyTaskRequest{
    /**实例id*/
    @KsYunField(name="instanceId")
    private String InstanceId;

    /**计费方式。默认按照当前实例的计费方式进行转正。支持的计费方式列表通过ListInstanceSupportBillTypes接口获取*/
    @KsYunField(name="billType")
    private Integer BillType;

    /**转正为包年包月时，必须填写正式实例购买时长，单位月*/
    @KsYunField(name="duration")
    private Integer Duration;

    /**指定转正日期，格式为yyyy-MM-dd HH:mm:ss。默认是到期时间点转正。*/
    @KsYunField(name="autoTrialToBuyDate")
    private String AutoTrialToBuyDate;

}
