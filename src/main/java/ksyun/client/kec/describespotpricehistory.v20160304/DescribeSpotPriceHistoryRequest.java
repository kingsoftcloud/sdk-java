package ksyun.client.kec.describespotpricehistory.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeSpotPriceHistoryRequest
 * @Description 请求参数
 */
@Data
public class DescribeSpotPriceHistoryRequest {
    /**
     * 实例套餐规格，支持机型E1，N2，N3
     */
    @KsYunField(name = "InstanceType")
    private String InstanceType;

    /**
     * 可用区信息
     */
    @KsYunField(name = "AvailabilityZone")
    private String AvailabilityZone;

    /**
     * 查询竞价实例历史价格的起始时间。按照ISO8601标准表示，并使用UTC +8时间，格式为yyyy-MM-ddTHH:mm:ssZ。默认值：空，空代表结束时间前3小时，最大值不得超过指定的结束时间3天。
     */
    @KsYunField(name = "StartTime")
    private String StartTime;

    /**
     * 查询抢占式实例历史价格的结束时间。按照ISO8601标准表示，并使用UTC +8时间，格式为yyyy-MM-ddTHH:mm:ssZ。默认值：空，空表示当前时间。（endtime不进行强校验）。
     */
    @KsYunField(name = "EndTime")
    private String EndTime;


}