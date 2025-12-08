package ksyun.client.krds.describeaudithotduration.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAuditHotDurationResponse
* @Description DescribeAuditHotDuration 返回体
*/
@Data
@ToString
public class DescribeAuditHotDurationResponse extends BaseResponseModel {
    /***/
    @JsonProperty("data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**数据库库名	
*/
        @JsonProperty("dbName")
        private String DbName;

        /**数据库表名	
*/
        @JsonProperty("tableName")
        private String TableName;

        /**执行耗时	
*/
        @JsonProperty("duration")
        private Double Duration;

        /**	执行耗时占比	
*/
        @JsonProperty("durationRatio")
        private Double DurationRatio;

    }

}
