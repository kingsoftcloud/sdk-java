package ksyun.client.postgresql.createdbparametergroup.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateDBParameterGroupResponse
* @Description CreateDBParameterGroup 返回体
*/
@Data
@ToString
public class CreateDBParameterGroupResponse extends BaseResponseModel {

    /**返回新建参数组详情*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("DBParameterGroup")
        private DataDBParameterGroupDto DBParameterGroup;

        @Data
        @ToString
        public static class DataDBParameterGroupDto {
            /**参数组ID*/
            @JsonProperty("DBParameterGroupId")
            private String DBParameterGroupId;

            /**参数组名称*/
            @JsonProperty("DBParameterGroupName")
            private String DBParameterGroupName;

            /**参数组版本
##### 注意：应用参数组时需要版本和实例版本一致*/
            @JsonProperty("EngineVersion")
            private String EngineVersion;

            /**参数组描述*/
            @JsonProperty("Description")
            private String Description;

            /**当前参数组，新建时自定义的参数列表*/
            @JsonProperty("Parameters")
            private DataDBParameterGroupParametersDto Parameters;

            @Data
            @ToString
            public static class DataDBParameterGroupParametersDto {
                /***/
                @JsonProperty("autovacuum_analyze_scale_factor")
                private Integer Autovacuum_analyze_scale_factor;

            }

            /**引擎类型

##### 注意：RDS和Postgresql不同，请勿代入RDS使用*/
            @JsonProperty("Engine")
            private String Engine;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
