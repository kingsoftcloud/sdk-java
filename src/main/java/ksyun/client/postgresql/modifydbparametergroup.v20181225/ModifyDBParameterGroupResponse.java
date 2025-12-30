package ksyun.client.postgresql.modifydbparametergroup.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyDBParameterGroupResponse
* @Description ModifyDBParameterGroup 返回体
*/
@Data
@ToString
public class ModifyDBParameterGroupResponse extends BaseResponseModel {

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
            @JsonProperty("Description")
            private String Description;

            /***/
            @JsonProperty("Parameters")
            private DataDBParameterGroupParametersDto Parameters;

            @Data
            @ToString
            public static class DataDBParameterGroupParametersDto {
                /***/
                @JsonProperty("autovacuum_analyze_scale_factor")
                private Integer Autovacuum_analyze_scale_factor;

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
