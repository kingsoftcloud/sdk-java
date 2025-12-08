package ksyun.client.kcs.createcacheparametergroup.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateCacheParameterGroupResponse
* @Description CreateCacheParameterGroup 返回体
*/
@Data
@ToString
public class CreateCacheParameterGroupResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("id")
        private String Id;

        /***/
        @JsonProperty("name")
        private String Name;

        /***/
        @JsonProperty("description")
        private String Description;

        /***/
        @JsonProperty("engine")
        private String Engine;

        /***/
        @JsonProperty("created")
        private String Created;

        /***/
        @JsonProperty("updated")
        private String Updated;

        /***/
        @JsonProperty("parameters")
        private List<ParametersDto> Parameters;

        @Data
        @ToString
        public static class ParametersDto {
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
            private ValidityDto Validity;

            @Data
            @ToString
            public static class ValidityDto {
                /***/
                @JsonProperty("type")
                private String Type;

                /***/
                @JsonProperty("dataType")
                private String DataType;

                /***/
                @JsonProperty("value")
                private List<String> Value;

            }

        }

    }

}
