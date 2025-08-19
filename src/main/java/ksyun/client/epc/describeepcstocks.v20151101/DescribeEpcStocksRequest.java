package ksyun.client.epc.describeepcstocks.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeEpcStocksRequest
* @Description 请求参数
*/
@Data
public class DescribeEpcStocksRequest{
    /**筛选Filter*/
    @KsYunField(name="Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值：
- host-type，裸金属服务器类型 
- availability-zone,可用区*/
        @KsYunField(name="Name")
                private String Name;
        /***/
        @KsYunField(name="Value")
                private List<String> ValueList;
    }

}