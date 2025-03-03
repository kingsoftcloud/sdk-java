package ksyun.client.rabbitmq.describesecuritygrouprules.v20191017;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeSecurityGroupRulesResponse
 * @Description DescribeSecurityGroupRules 返回体
 */
@Data
@ToString
public class DescribeSecurityGroupRulesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
