package ksyun.client.kcf.describefunctions.v20211215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeFunctionsResponse
* @Description DescribeFunctions 返回体
*/
@Data
@ToString
public class DescribeFunctionsResponse extends BaseResponseModel {

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
        @JsonProperty("MaxRecords")
        private Integer MaxRecords;

        /***/
        @JsonProperty("Marker")
        private Integer Marker;

        /***/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("Functions")
        private List<DataFunctionsDto> Functions;

        @Data
        @ToString
        public static class DataFunctionsDto {
            /***/
            @JsonProperty("Id")
            private String Id;

            /***/
            @JsonProperty("Name")
            private String Name;

            /***/
            @JsonProperty("Description")
            private String Description;

            /***/
            @JsonProperty("Runtime")
            private String Runtime;

            /***/
            @JsonProperty("MemorySize")
            private Integer MemorySize;

            /***/
            @JsonProperty("CodeType")
            private String CodeType;

            /***/
            @JsonProperty("State")
            private String State;

            /***/
            @JsonProperty("FunctionTotalInvocations")
            private Integer FunctionTotalInvocations;

            /***/
            @JsonProperty("FunctionErrors")
            private Integer FunctionErrors;

            /***/
            @JsonProperty("RequestType")
            private String RequestType;

            /***/
            @JsonProperty("CreatedAt")
            private String CreatedAt;

            /***/
            @JsonProperty("UpdatedAt")
            private String UpdatedAt;

        }

    }

}
