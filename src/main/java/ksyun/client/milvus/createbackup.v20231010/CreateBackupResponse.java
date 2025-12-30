package ksyun.client.milvus.createbackup.v20231010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateBackupResponse
* @Description CreateBackup 返回体
*/
@Data
@ToString
public class CreateBackupResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**备份id*/
        @JsonProperty("id")
        private String Id;

        /**备份名称*/
        @JsonProperty("name")
        private String Name;

        /**备份状态*/
        @JsonProperty("state")
        private String State;

        /**备份方式(手动/自动)*/
        @JsonProperty("method")
        private String Method;

        /**备份维度*/
        @JsonProperty("dimension")
        private String Dimension;

        /**备份大小*/
        @JsonProperty("size")
        private Integer Size;

        /**备份保留天数*/
        @JsonProperty("retention_days")
        private Integer Retention_days;

        /**备份创建时间*/
        @JsonProperty("created_at")
        private String Created_at;

        /**备份细节*/
        @JsonProperty("collection_backups")
        private List<String> Collection_backups;

    }

}
