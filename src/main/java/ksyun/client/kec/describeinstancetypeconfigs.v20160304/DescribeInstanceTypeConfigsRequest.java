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
    /***/
    @KsYunField(name="Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /***/
        @KsYunField(name="Name")
        private List<String> NameList;
        /***/
        @KsYunField(name="Value")
        private List<String> ValueList;
    }


}