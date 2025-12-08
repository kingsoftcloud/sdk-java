package ksyun.client.milvus.listbackup.v20231010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListBackupResponse
* @Description ListBackup 返回体
*/
@Data
@ToString
public class ListBackupResponse extends BaseResponseModel {
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
    @JsonProperty("Offset")
    private Integer Offset;

    /***/
    @JsonProperty("Limit")
    private Integer Limit;

    /***/
    @JsonProperty("Total")
    private Integer Total;

    /**备份列表数据*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**备份id*/
        @JsonProperty("BackupId")
        private String BackupId;

        /**备份名称*/
        @JsonProperty("BackupName")
        private String BackupName;

        /**备份状态

```json
COMPLETED: '正常',
BUILDING: '创建中',
NEW: '初始化',
FAILED: '异常'
```*/
        @JsonProperty("BackupState")
        private String BackupState;

        /**备份类型(手动/自动)*/
        @JsonProperty("BackupMethod")
        private String BackupMethod;

        /**备份描述*/
        @JsonProperty("BackupDimension")
        private String BackupDimension;

        /**备份大小(前端展示会转为MB)*/
        @JsonProperty("BackupSize")
        private Integer BackupSize;

        /**备份保留天数*/
        @JsonProperty("RetentionDays")
        private Integer RetentionDays;

        /**备份维度详细信息*/
        @JsonProperty("Collections")
        private List<CollectionsDto> Collections;

        @Data
        @ToString
        public static class CollectionsDto {
            /**db名称*/
            @JsonProperty("DbName")
            private String DbName;

            /**collection名称*/
            @JsonProperty("CollectionName")
            private String CollectionName;

            /**加载阶段

```json
Loaded: '已加载',
NotLoad: '未加载',
Loading: '加载中'
```*/
            @JsonProperty("LoadState")
            private String LoadState;

            /**大小(前端展示转为MB)*/
            @JsonProperty("Size")
            private Integer Size;

            /**描述*/
            @JsonProperty("Description")
            private String Description;

        }

        /**创建时间*/
        @JsonProperty("CreatedAt")
        private String CreatedAt;

    }

}
