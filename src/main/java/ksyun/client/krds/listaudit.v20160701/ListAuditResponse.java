package ksyun.client.krds.listaudit.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListAuditResponse
* @Description ListAudit 返回体
*/
@Data
@ToString
public class ListAuditResponse extends BaseResponseModel {
    /**审计数据列表
*/
    @JsonProperty("AuditRows")
    private List<AuditRowsDto> AuditRows;

    @Data
    @ToString
    public static class AuditRowsDto {
        /**ID	
*/
        @JsonProperty("Id")
        private String Id;

        /**实例ID	
*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**用户名	
*/
        @JsonProperty("AccessUsername")
        private String AccessUsername;

        /**客户端IP	
*/
        @JsonProperty("SourceIp")
        private String SourceIp;

        /**SQL	
*/
        @JsonProperty("AccessSqlExt")
        private String AccessSqlExt;

        /**SQL操作命令	
*/
        @JsonProperty("AccessSqlStatement")
        private String AccessSqlStatement;

        /**SQL类型	
*/
        @JsonProperty("AccessSqlLanguage")
        private String AccessSqlLanguage;

        /**数据库名称	
*/
        @JsonProperty("AccessDBName")
        private String AccessDBName;

        /**客户端端口	
*/
        @JsonProperty("SourcePort")
        private Integer SourcePort;

        /**默认成功。0: 失败，1 成功	
*/
        @JsonProperty("RunResult")
        private Boolean RunResult;

        /**执行完成时间	
*/
        @JsonProperty("ExecTime")
        private Integer ExecTime;

        /**执行耗时	
*/
        @JsonProperty("Duration")
        private String Duration;

        /**更新行数	
*/
        @JsonProperty("RowSent")
        private Integer RowSent;

    }

    /**总条数	
*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**开始条数	
*/
    @JsonProperty("Marker")
    private Integer Marker;

}
