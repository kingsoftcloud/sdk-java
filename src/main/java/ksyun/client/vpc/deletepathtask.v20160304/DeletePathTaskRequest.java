package ksyun.client.vpc.deletepathtask.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeletePathTaskRequest
* @Description 请求参数
*/
@Data
public class DeletePathTaskRequest{
    /**路径分析任务ID*/
    @KsYunField(name="PathTaskId")
    private String PathTaskId;

}
