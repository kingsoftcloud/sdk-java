package ksyun.client.mongodb.describeinstancestatistic.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeInstanceStatisticRequest
 * @Description 请求参数
 */
@Data
public class DescribeInstanceStatisticRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}