package ksyun.client.krds.auditstatistic.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AuditStatisticResponse
* @Description AuditStatistic 返回体
*/
@Data
@ToString
public class AuditStatisticResponse extends BaseResponseModel {
    /***/
    @JsonProperty("AuditStatistic")
    private AuditStatisticDto AuditStatistic;

    @Data
    @ToString
    public static class AuditStatisticDto {
        /**SQL操作类型	
返回类型具体由审计结果统计*/
        @JsonProperty("AccessSqlLanguage")
        private AccessSqlLanguageDto AccessSqlLanguage;

        @Data
        @ToString
        public static class AccessSqlLanguageDto {
            /***/
            @JsonProperty("OTHER")
            private Integer OTHER;

            /***/
            @JsonProperty("LOGOUT")
            private Integer LOGOUT;

            /***/
            @JsonProperty("LOGIN")
            private Integer LOGIN;

            /***/
            @JsonProperty("DQL")
            private Integer DQL;

        }

        /**SQL操作命令	
返回类型具体由审计结果统计*/
        @JsonProperty("AccessSqlStatement")
        private AccessSqlStatementDto AccessSqlStatement;

        @Data
        @ToString
        public static class AccessSqlStatementDto {
            /***/
            @JsonProperty("LOGOUT")
            private Integer LOGOUT;

            /***/
            @JsonProperty("SET")
            private Integer SET;

            /***/
            @JsonProperty("LOGIN")
            private Integer LOGIN;

            /***/
            @JsonProperty("SELECT")
            private Integer SELECT;

        }

    }

}
