package ksyun.client.kpfs.describedatamigratetasklist.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDataMigrateTaskListRequest
* @Description 请求参数
*/
@Data
public class DescribeDataMigrateTaskListRequest{
    /**文件系统ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**数据流动任务ID清单，以逗号分隔，支持批量精确检索*/
    @KsYunField(name="TaskIds")
    private String TaskIds;

    /**数据流动任务名称，模糊检索*/
    @KsYunField(name="TaskName")
    private String TaskName;

    /**数据流动任务类型，有效值：export：导出*/
    @KsYunField(name="TaskType")
    private String TaskType;

    /**目录路径，模糊检索 /aaa/bbb/*/
    @KsYunField(name="DirPath")
    private String DirPath;

    /**存储桶名称，模糊检索*/
    @KsYunField(name="Bucket")
    private String Bucket;

    /**存储桶前缀，模糊检索/aaa/bbb/*/
    @KsYunField(name="BucketPrefix")
    private String BucketPrefix;

    /**页码，默认为1*/
    @KsYunField(name="PageNum")
    private Integer PageNum;

    /**分页大小，默认为10*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
