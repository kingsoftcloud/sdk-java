package ksyun.client.epc.describeepcdeviceattributes.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeEpcDeviceAttributesRequest
* @Description 请求参数
*/
@Data
public class DescribeEpcDeviceAttributesRequest{
    /**筛选Filter*/
    @KsYunField(name="Filter",type=1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值：
- host-type，裸金属服务器类型
*/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name="Value",type=1)
        private List<String> ValueList;

    }

    /**设备的ID*/
    @KsYunField(name="DeviceAttributeId",type=1)
    private List<String> DeviceAttributeIdList;

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}
