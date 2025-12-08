package ksyun.client.clickhouse.describeenginedefaultparameters.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeEngineDefaultParametersResponse
* @Description DescribeEngineDefaultParameters 返回体
*/
@Data
@ToString
public class DescribeEngineDefaultParametersResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Code")
    private String Code;

    /***/
    @JsonProperty("Message")
    private String Message;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**```json
注意：如下参数名含有 'null' 字符串，单独展示，不在示例中展示

{
                "name": "insert_null_as_default",
                "min": "0",
                "max": "1",
                "visible": 1,
                "restart_required": false,
                "type": "Int",
                "config_type": "users",
                "enums": "",
                "default": "1"
}

{
                "name": "join_use_nulls",
                "min": "0",
                "max": "1",
                "visible": 1,
                "restart_required": false,
                "type": "Int",
                "config_type": "users",
                "enums": "",
                "default": "0"
}

```*/
        @JsonProperty("Parameters")
        private List<DataDtoParametersDto> Parameters;

        @Data
        @ToString
        public static class DataDtoParametersDto {
            /***/
            @JsonProperty("name")
            private String Name;

            /***/
            @JsonProperty("min")
            private String Min;

            /***/
            @JsonProperty("max")
            private String Max;

            /***/
            @JsonProperty("visible")
            private Integer Visible;

            /***/
            @JsonProperty("restart_required")
            private Boolean Restart_required;

            /***/
            @JsonProperty("type")
            private String Type;

            /***/
            @JsonProperty("config_type")
            private String Config_type;

            /***/
            @JsonProperty("enums")
            private String Enums;

            /***/
            @JsonProperty("default")
            private String DefaultField;

        }

    }

}
