package ksyun.client.aicp.getinferencelogs.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetInferenceLogsRequest
* @Description 请求参数
*/
@Data
public class GetInferenceLogsRequest{
    /**推理服务ID*/
    @KsYunField(name="InferenceId")
    private String InferenceId;

    /**Pod名称*/
    @KsYunField(name="PodName")
    private String PodName;

    /**返回从指定时间（秒）开始的日志*/
    @KsYunField(name="SinceSeconds")
    private Integer SinceSeconds;

    /**返回日志的最后几行*/
    @KsYunField(name="TailLines")
    private Integer TailLines;

}
