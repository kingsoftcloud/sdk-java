package ksyun.client.vpc.deactiveflowlog.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeactiveFlowLogRequest
 * @Description 请求参数
 */
@Data
public class DeactiveFlowLogRequest {
    /**
     * 流日志的ID
     */
    @KsYunField(name = "FlowLogId")
    private String FlowLogId;

}