package ksyun.client.pdns.describezonerecord.v20160304;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname DescribeZoneRecordRequest
 * @Description 请求参数
 */
@Data
public class DescribeZoneRecordRequest {
    /**
     * Zone的ID
     */
    @KsYunField(name = "ZoneId")
    private String ZoneId;

    /**
     * 记录的ID
     */
    @KsYunField(name = "RecordId")
    private List<String> RecordIdList;

    /**
     * 筛选Filter
     */
    @KsYunField(name = "Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**
         * 有效值：
         * - record-type，记录类型
         * - record-name记录名称
         */
        @KsYunField(name = "Name")
        private String Name;
        /***/
        @KsYunField(name = "Value")
        private List<String> ValueList;
    }


}