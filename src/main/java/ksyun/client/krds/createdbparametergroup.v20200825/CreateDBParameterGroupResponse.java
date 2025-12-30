package ksyun.client.krds.createdbparametergroup.v20200825;

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

    /***/
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
            /***/
            @JsonProperty("DBParameterGroupId")
            private String DBParameterGroupId;

            /***/
            @JsonProperty("DBParameterGroupName")
            private String DBParameterGroupName;

            /***/
            @JsonProperty("EngineVersion")
            private String EngineVersion;

            /***/
            @JsonProperty("Parameters")
            private DataDBParameterGroupParametersDto Parameters;

            @Data
            @ToString
            public static class DataDBParameterGroupParametersDto {
            }

            /***/
            @JsonProperty("Engine")
            private String Engine;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
