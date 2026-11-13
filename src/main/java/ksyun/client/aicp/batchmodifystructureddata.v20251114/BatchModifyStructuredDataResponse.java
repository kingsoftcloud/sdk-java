package ksyun.client.aicp.batchmodifystructureddata.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname BatchModifyStructuredDataResponse
* @Description BatchModifyStructuredData 返回体
*/
@Data
@ToString
public class BatchModifyStructuredDataResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**当前页行数据*/
    @JsonProperty("Rows")
    private List<RowsDto> Rows;

    @Data
    @ToString
    public static class RowsDto {
        /**行 ID*/
        @JsonProperty("RowId")
        private String RowId;

        /**行数据，动态结构，示例{“员工”: “张三”}*/
        @JsonProperty("Values")
        private RowsValuesDto Values;

        @Data
        @ToString
        public static class RowsValuesDto {
        }

    }

}
