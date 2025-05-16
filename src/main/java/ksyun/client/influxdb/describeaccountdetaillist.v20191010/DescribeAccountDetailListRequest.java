package ksyun.client.influxdb.describeaccountdetaillist.v20191010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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