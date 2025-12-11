package ksyun.client.vpc.describevpcpeeringconnections.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeVpcPeeringConnectionsRequest
* @Description 请求参数
*/
@Data
public class DescribeVpcPeeringConnectionsRequest{
    /**项目的ID*/
    @KsYunField(name="ProjectId",type=2)
    private List<String> ProjectIdList;

    /**多个对等连接的ID*/
    @KsYunField(name="VpcPeeringConnectionId",type=2)
    private List<String> VpcPeeringConnectionIdList;

    /**筛选Filter*/
    @KsYunField(name="Filter",type=2)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值： vpc-id，Vpc的ID<br>state，对等连接状态<br>*/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name="Value",type=2)
        private List<String> ValueList;

    }

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}
