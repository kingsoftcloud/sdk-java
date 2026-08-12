package ksyun.client.kpfs.stopdatamigratetask.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StopDataMigrateTaskRequest
* @Description 请求参数
*/
@Data
public class StopDataMigrateTaskRequest{
    /**数据流动任务ID*/
    @KsYunField(name="TaskId")
    private String TaskId;

}
