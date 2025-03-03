package ksyun.client.tidb.listtasks.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListTasksRequest
 * @Description 请求参数
 */
@Data
public class ListTasksRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}