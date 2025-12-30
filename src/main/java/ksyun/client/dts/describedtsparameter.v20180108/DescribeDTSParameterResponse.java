package ksyun.client.dts.describedtsparameter.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDTSParameterResponse
* @Description DescribeDTSParameter 返回体
*/
@Data
@ToString
public class DescribeDTSParameterResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**参数列表*/
        @JsonProperty("DTSParameter")
        private List<DataDTSParameterDto> DTSParameter;

        @Data
        @ToString
        public static class DataDTSParameterDto {
            /**参数名*/
            @JsonProperty("DBParameter")
            private String DBParameter;

            /**参数默认值*/
            @JsonProperty("DBParameterDefault")
            private String DBParameterDefault;

            /**参数类型*/
            @JsonProperty("DBParameterType")
            private String DBParameterType;

            /**参数最大值*/
            @JsonProperty("DBParameterMax")
            private String DBParameterMax;

            /**参数最小值*/
            @JsonProperty("DBParameterMin")
            private String DBParameterMin;

            /**是否为需要重启的参数*/
            @JsonProperty("DBParameterRestartRequired")
            private Boolean DBParameterRestartRequired;

            /**源端参数值*/
            @JsonProperty("SourceDBParameterValue")
            private String SourceDBParameterValue;

            /**目标端参数值*/
            @JsonProperty("TargetDBParameterValue")
            private String TargetDBParameterValue;

            /**枚举类型的参数值，可有多个枚举值；若参数不是枚举类型，则不会返回此参数。*/
            @JsonProperty("DBParameterEnums")
            private List<String> DBParameterEnums;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
