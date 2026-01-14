package ksyun.client.aicp.querytokendata.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryTokenDataResponse
* @Description QueryTokenData 返回体
*/
@Data
@ToString
public class QueryTokenDataResponse extends BaseResponseModel {

    /**总条数，分页展示用。*/
    @JsonProperty("TotalCount")
    private Long TotalCount;

    /**本次获取数据的最后一条值，分页游标。*/
    @JsonProperty("LastKey")
    private String LastKey;

    /**总的输入tokens量*/
    @JsonProperty("SumInputToken")
    private Long SumInputToken;

    /**总的输出tokens量*/
    @JsonProperty("SumOutputToken")
    private Long SumOutputToken;

    /**总的tokens量*/
    @JsonProperty("SumTotalToken")
    private Long SumTotalToken;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**按模型分组统计的模型名*/
        @JsonProperty("Model")
        private String Model;

        /**输入tokens量*/
        @JsonProperty("InputToken")
        private Long InputToken;

        /**输出tokens量*/
        @JsonProperty("OutputToken")
        private Long OutputToken;

        /**输入和输出tokens量*/
        @JsonProperty("TotalToken")
        private Long TotalToken;

        /**缓存命中量*/
        @JsonProperty("TotalCacheToken")
        private Long TotalCacheToken;

        /**缓存未命中量*/
        @JsonProperty("TotalCacheMissToken")
        private Long TotalCacheMissToken;

        /**联网搜索次数*/
        @JsonProperty("TotalWebSearch")
        private Long TotalWebSearch;

    }

    /**总的缓存命中量*/
    @JsonProperty("SumTotalCacheToken")
    private Long SumTotalCacheToken;

    /**总的缓存未命中量*/
    @JsonProperty("SumTotalCacheMissToken")
    private Long SumTotalCacheMissToken;

    /**总的联网搜索次数*/
    @JsonProperty("SumTotalWebSearch")
    private Long SumTotalWebSearch;

}
