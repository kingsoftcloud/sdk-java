package ksyun.client.postgresql.statisticdbinstances.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname StatisticDBInstancesRequest
 * @Description 请求参数
 */
@Data
public class StatisticDBInstancesRequest {
    /**
     * 按照实例过期时间过滤，取值范围>1
     */
    @KsYunField(name = "ExpiryDateLessThan")
    private String ExpiryDateLessThan;

    /**
     * 实例分组id
     */
    @KsYunField(name = "GroupId")
    private String GroupId;

    /**
     * 按名称/VIP模糊过滤
     */
    @KsYunField(name = "Keyword")
    private String Keyword;


}