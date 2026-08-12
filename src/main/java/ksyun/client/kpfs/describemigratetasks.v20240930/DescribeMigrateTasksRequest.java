package ksyun.client.kpfs.describemigratetasks.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeMigrateTasksRequest
* @Description 请求参数
*/
@Data
public class DescribeMigrateTasksRequest{
    /**数据迁移规则ID。*/
    @KsYunField(name="RuleId")
    private String RuleId;

    /**数据迁移任务ID。*/
    @KsYunField(name="TaskId")
    private String TaskId;

    /**分页大小，默认为10。*/
    @KsYunField(name="PageSize")
    private Long PageSize;

    /**页码，默认为1。*/
    @KsYunField(name="PageNum")
    private Long PageNum;

}
