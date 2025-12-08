package ksyun.client.kec.describeinstancetypeconfigs.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeInstanceTypeConfigsRequest
* @Description 请求参数
*/
@Data
public class DescribeInstanceTypeConfigsRequest{
    /**
支持如下过滤器名称
instance-family 实例族
instance-type 实例类型
availability-zone 可用区*/
    @KsYunField(name="Filter",type=2)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**	
Filter.1.Name.1=instance-type*/
        @KsYunField(name="Name",type=2)
        private List<String> NameList;

        /**	
Filter.1.Value.1=****/
        @KsYunField(name="Value",type=2)
        private List<String> ValueList;

    }

}
