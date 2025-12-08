package ksyun.client.tidb.listtasks.v20210520;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListTasksRequest
* @Description 请求参数
*/
@Data
public class ListTasksRequest{
    /**实例ID*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

}
