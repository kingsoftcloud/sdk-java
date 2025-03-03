package ksyun.client.krds.statisticdbinstances.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname StatisticDBInstancesRequest
 * @Description 请求参数
 */
@Data
public class StatisticDBInstancesRequest {
    /**
     * 过期时间	默认：7天以内；过滤出过期时间小于N天的实例，传入这个参数会给出状态EXPIRING_SOON统计；取值范围：>0
     */
    @KsYunField(name = "ExpiryDateLessThan")
    private Integer ExpiryDateLessThan;


}