package ksyun.client.krds.sqlauditlinechart.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SqlAuditLineChartResponse
* @Description SqlAuditLineChart 返回体
*/
@Data
@ToString
public class SqlAuditLineChartResponse extends BaseResponseModel {

    /***/
    @JsonProperty("data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**实例ID	
UUID*/
        @JsonProperty("productId")
        private String ProductId;

        /**时间点	
毫秒级时间戳*/
        @JsonProperty("execTime")
        private Integer ExecTime;

        /**查询次数	
*/
        @JsonProperty("count")
        private Integer Count;

    }

}
