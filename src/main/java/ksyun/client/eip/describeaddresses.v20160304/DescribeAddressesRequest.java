package ksyun.client.eip.describeaddresses.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAddressesRequest
* @Description 请求参数
*/
@Data
public class DescribeAddressesRequest{
    /**项目的ID*/
    @KsYunField(name="ProjectId",type=2)
    private List<String> ProjectIdList;

    /**多个弹性IP的ID*/
    @KsYunField(name="AllocationId",type=2)
    private List<String> AllocationIdList;

    /**筛选Filter*/
    @KsYunField(name="Filter",type=2)
    private List<FilterDto1> FilterList;

    @Data
    @ToString
    public static class FilterDto1 {
        /**有效值： 
- network-interface-id，网卡ID
- instance-type(Slb|Ipfwd|Havip)，弹性IP绑定的实例类型
- band-width-share-id，共享带宽ID
- line-id，线路的ID
- public-ip，弹性IP的地址*/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name="Value",type=2)
        private List<String> ValueList;

    }

    /**是否在返回值中包含资源标签信息*/
    @KsYunField(name="IsContainTag")
    private Boolean IsContainTag;

    /**多个标签的键*/
    @KsYunField(name="TagKey",type=2)
    private List<String> TagKeyList;

    /**多个标签的键*/
    @KsYunField(name="TagKV",type=2)
    private List<TagKVDto2> TagKVList;

    @Data
    @ToString
    public static class TagKVDto2 {
        /**标签键*/
        @KsYunField(name="Name")
        private String Name;

        /**标签值*/
        @KsYunField(name="Value")
        private String Value;

    }

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

    /**弹性IP的状态，已绑定(associate)，未绑定(disassociate)*/
    @KsYunField(name="State")
    private String State;

    /**IP版本*/
    @KsYunField(name="IpVersion")
    private String IpVersion;

}
