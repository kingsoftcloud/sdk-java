package ksyun.client.sqlserver.createimporttask.v20190425;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateImportTaskRequest
* @Description 请求参数
*/
@Data
public class CreateImportTaskRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**ks3的区域所在*/
    @KsYunField(name="KS3Region")
    private String KS3Region;

    /**ks3的桶名称*/
    @KsYunField(name="KS3Bucket")
    private String KS3Bucket;

    /**ks3中文件名称*/
    @KsYunField(name="KS3Key")
    private String KS3Key;

    /**ks3文件大小*/
    @KsYunField(name="KS3FileSize")
    private String KS3FileSize;

    /**任务ID*/
    @KsYunField(name="ImportTaskId")
    private String ImportTaskId;

    /**数据库名称*/
    @KsYunField(name="DBName")
    private String DBName;

}
