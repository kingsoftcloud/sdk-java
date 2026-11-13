package ksyun.client.aicp.describestructureddata.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeStructuredDataResponse
* @Description DescribeStructuredData 返回体
*/
@Data
@ToString
public class DescribeStructuredDataResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**结构化表名*/
    @JsonProperty("TableName")
    private String TableName;

    /**列定义（表头）*/
    @JsonProperty("Columns")
    private List<ColumnsDto> Columns;

    @Data
    @ToString
    public static class ColumnsDto {
        /**列类型*/
        @JsonProperty("Type")
        private String Type;

        /**是否允许为空*/
        @JsonProperty("Nullable")
        private Boolean Nullable;

        /**列名*/
        @JsonProperty("Name")
        private String Name;

    }

    /**总行数*/
    @JsonProperty("Total")
    private Integer Total;

    /**分页*/
    @JsonProperty("Page")
    private Integer Page;

    /**分页*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**当前页行数据*/
    @JsonProperty("Rows")
    private List<RowsDto> Rows;

    @Data
    @ToString
    public static class RowsDto {
        /**行 ID*/
        @JsonProperty("RowId")
        private String RowId;

        /**行数据，动态结构，示例{"员工": "张三"}*/
        @JsonProperty("Values")
        private RowsValuesDto Values;

        @Data
        @ToString
        public static class RowsValuesDto {
        }

    }

}
