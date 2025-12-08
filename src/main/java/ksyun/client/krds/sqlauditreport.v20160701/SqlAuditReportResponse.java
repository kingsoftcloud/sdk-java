package ksyun.client.krds.sqlauditreport.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SqlAuditReportResponse
* @Description SqlAuditReport 返回体
*/
@Data
@ToString
public class SqlAuditReportResponse extends BaseResponseModel {
    /***/
    @JsonProperty("data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**数据库名称	
*/
        @JsonProperty("dbName")
        private String DbName;

        /**
*/
        @JsonProperty("duration")
        private Integer Duration;

        /**执行次数	
*/
        @JsonProperty("count")
        private Integer Count;

        /**SQL模板	
*/
        @JsonProperty("sqlTemplate")
        private String SqlTemplate;

        /**执行次数比例	
*/
        @JsonProperty("countRatio")
        private Double CountRatio;

        /**执行耗时占比	
*/
        @JsonProperty("durationRatio")
        private Double DurationRatio;

        /**平均执行耗时	
*/
        @JsonProperty("durationAvg")
        private Double DurationAvg;

    }

    /**每页条数	
*/
    @JsonProperty("size")
    private Integer Size;

    /**总条数	
*/
    @JsonProperty("totalSize")
    private Integer TotalSize;

    /**页码	
*/
    @JsonProperty("page")
    private Integer Page;

}
