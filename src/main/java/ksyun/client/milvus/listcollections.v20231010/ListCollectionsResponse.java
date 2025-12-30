package ksyun.client.milvus.listcollections.v20231010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListCollectionsResponse
* @Description ListCollections 返回体
*/
@Data
@ToString
public class ListCollectionsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Offset")
    private Integer Offset;

    /***/
    @JsonProperty("Limit")
    private Integer Limit;

    /***/
    @JsonProperty("Total")
    private Integer Total;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("DbName")
        private String DbName;

        /***/
        @JsonProperty("Collections")
        private List<String> Collections;

    }

}
