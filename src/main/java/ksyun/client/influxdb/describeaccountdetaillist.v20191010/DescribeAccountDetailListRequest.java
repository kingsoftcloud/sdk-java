package ksyun.client.influxdb.describeaccountdetaillist.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeAccountDetailListRequest
 * @Description 请求参数
 */
@Data
public class DescribeAccountDetailListRequest {
    /**
     * action
     */
    @KsYunField(name = "Action")
    private String Action;

}