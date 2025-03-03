package ksyun.client.pdns.describeendpoints.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

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