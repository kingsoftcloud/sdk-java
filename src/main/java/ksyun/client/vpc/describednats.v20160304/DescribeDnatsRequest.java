package ksyun.client.vpc.describednats.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDnatsRequest
* @Description 请求参数
*/
@Data
public class DescribeDnatsRequest{
    /**多个Dnat的ID*/
    @KsYunField(name="DnatId")
    private List<String> DnatIdList;

    /**筛选Filter*/
    @KsYunField(name="Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值：
- nat-id，Nat的ID
- nat-ip，Nat的IP
- public-port，公网端口
- private-ip-address，服务器私网IP
- ip-protocol，协议类型
- dnat-name，Dnat的名称
- network-interface-id，网卡的ID*/
        @KsYunField(name="Name")
                private String Name;
        /***/
        @KsYunField(name="Value")
                private List<String> ValueList;
    }

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}