package ksyun.client.vpc.activeflowlog.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ActiveFlowLogRequest
 * @Description 请求参数
 */
@Data
public class ActiveFlowLogRequest {
    /**
     * 流日志的ID
     */
    @KsYunField(name = "FlowLogId")
    private String FlowLogId;

}