package ksyun.client.krds.describeaudithotcount.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAuditHotCountResponse
* @Description DescribeAuditHotCount 返回体
*/
@Data
@ToString
public class DescribeAuditHotCountResponse extends BaseResponseModel {

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

        /**SQL执行次数	
*/
        @JsonProperty("count")
        private Integer Count;

        /**全量SQL占比
*/
        @JsonProperty("countRatio")
        private Double CountRatio;

    }

}
