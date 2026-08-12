package ksyun.client.kpfs.deletedatamigratetask.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteDataMigrateTaskRequest
* @Description 请求参数
*/
@Data
public class DeleteDataMigrateTaskRequest{
    /**文件系统ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**数据流动任务ID清单，以逗号分隔，支持批量删除*/
    @KsYunField(name="TaskIds")
    private String TaskIds;

}
