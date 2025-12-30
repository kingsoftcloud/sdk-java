package ksyun.client.kec.describesnapshotpolicylist.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSnapshotPolicyListResponse
* @Description DescribeSnapshotPolicyList 返回体
*/
@Data
@ToString
public class DescribeSnapshotPolicyListResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**自动快照策略总个数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**自动快照策略 ID*/
        @JsonProperty("AutoSnapshotPolicyId")
        private String AutoSnapshotPolicyId;

        /**自动快照策略名称*/
        @JsonProperty("AutoSnapshotPolicyName")
        private String AutoSnapshotPolicyName;

        /**策略创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**该策略的文件系统列表*/
        @JsonProperty("FileSystems")
        private List<DataFileSystemsDto> FileSystems;

        @Data
        @ToString
        public static class DataFileSystemsDto {
            /**文件系统名称*/
            @JsonProperty("FileSystemName")
            private String FileSystemName;

            /**文件系统ID*/
            @JsonProperty("FileSystemId")
            private String FileSystemId;

        }

        /**自动快照策略备份周期。有效值：
• day：按天（默认值）
• week：按周
• month：按月*/
        @JsonProperty("FrequencyUnit")
        private String FrequencyUnit;

        /**备份日期*/
        @JsonProperty("IndexOfFrequency")
        private List<Integer> IndexOfFrequency;

        /**备份时间点*/
        @JsonProperty("SnapshotTimePoints")
        private List<String> SnapshotTimePoints;

        /**下一次触发自动快照执行的时间*/
        @JsonProperty("NextActiveTime")
        private String NextActiveTime;

        /**快照保留时间*/
        @JsonProperty("AliveDays")
        private Integer AliveDays;

    }

}
