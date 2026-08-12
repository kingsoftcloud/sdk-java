package ksyun.client.kpfs.getdatamigratetaskprogress.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetDataMigrateTaskProgressRequest
* @Description 请求参数
*/
@Data
public class GetDataMigrateTaskProgressRequest{
    /**数据流动任务ID*/
    @KsYunField(name="TaskId")
    private String TaskId;

}
