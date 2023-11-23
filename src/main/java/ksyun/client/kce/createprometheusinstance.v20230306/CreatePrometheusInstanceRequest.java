package ksyun.client.kce.createprometheusinstance.v20230306;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreatePrometheusInstanceRequest
* @Description 请求参数
*/
@Data
public class CreatePrometheusInstanceRequest{
    /**实例名称，有效值：2-64个字符，支持中文，英文，数字，以及特殊.!$^*()%#&+/:;<=>[]_`{}~*/
    @KsYunField(name="InstanceName")
    private String InstanceName;

    /**实例计费方式，目前只支持按量付费有效值：DailyVolume*/
    @KsYunField(name="ChargeType")
    private String ChargeType;

    /**数据存储时长，有效值：15、30、45、90、180、365*/
    @KsYunField(name="DataRetentionTime")
    private Integer DataRetentionTime;


}