package ksyun.client.mongodb.describedefaultparams.v20250101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDefaultParamsResponse
* @Description DescribeDefaultParams 返回体
*/
@Data
@ToString
public class DescribeDefaultParamsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("DefaultParams")
    private List<DefaultParamsDto> DefaultParams;

    @Data
    @ToString
    public static class DefaultParamsDto {
        /***/
        @JsonProperty("DefaultValue")
        private String DefaultValue;

        /***/
        @JsonProperty("Visible")
        private Integer Visible;

        /***/
        @JsonProperty("RestartRequired")
        private Boolean RestartRequired;

        /***/
        @JsonProperty("ParamName")
        private String ParamName;

        /***/
        @JsonProperty("ParamType")
        private String ParamType;

        /***/
        @JsonProperty("DataType")
        private String DataType;

        /***/
        @JsonProperty("Enums")
        private List<String> Enums;

    }

}
