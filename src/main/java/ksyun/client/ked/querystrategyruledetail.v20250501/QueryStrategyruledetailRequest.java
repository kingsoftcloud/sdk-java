package ksyun.client.ked.querystrategyruledetail.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname QueryStrategyruledetailRequest
 * @Description 请求参数
 */
@Data
public class QueryStrategyruledetailRequest {
    /**
     * 策略组 id
     */
    @KsYunField(name = "securityGroupId")
    private String SecurityGroupId;


}