package ksyun.client.kec.describeinstancetypeconfigs.v20160304;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname DescribeInstanceTypeConfigsRequest
 * @Description 请求参数
 */
@Data
public class DescribeInstanceTypeConfigsRequest {
    /**
     * 支持如下过滤器名称
     * instance-family 实例族
     * instance-type 实例类型
     * availability-zone 可用区
     */
    @KsYunField(name = "Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**
         * Filter.1.Name.1=instance-type
         */
        @KsYunField(name = "Name")
        private List<String> NameList;
        /**
         * Filter.1.Value.1=
         ****/
        @KsYunField(name = "Value")
        private List<String> ValueList;
    }

}