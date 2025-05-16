package ksyun.client.pdns.describeendpoints.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeEndPointsRequest
 * @Description 请求参数
 */
@Data
public class DescribeEndPointsRequest {
    /**
     * 出站节点的Id
     */
    @KsYunField(name = "EndPointId")
    private List<String> EndPointIdList;

}