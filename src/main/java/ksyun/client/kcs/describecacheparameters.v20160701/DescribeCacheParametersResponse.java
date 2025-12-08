package ksyun.client.kcs.describecacheparameters.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCacheParametersResponse
* @Description DescribeCacheParameters 返回体
*/
@Data
@ToString
public class DescribeCacheParametersResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("name")
        private String Name;

        /***/
        @JsonProperty("desc")
        private String Desc;

        /***/
        @JsonProperty("defaultValue")
        private String DefaultValue;

        /***/
        @JsonProperty("currentValue")
        private String CurrentValue;

        /***/
        @JsonProperty("validity")
        private DataDtoValidityDto Validity;

        @Data
        @ToString
        public static class DataDtoValidityDto {
            /***/
            @JsonProperty("type")
            private String Type;

            /***/
            @JsonProperty("dataType")
            private String DataType;

            /***/
            @JsonProperty("value")
            private String Value;

            /***/
            @JsonProperty("values")
            private List<String> Values;

            /***/
            @JsonProperty("min")
            private String Min;

            /***/
            @JsonProperty("max")
            private String Max;

        }

    }

}
