package ksyun.client.vpc.deleteflowlog.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteFlowLogRequest
 * @Description 请求参数
 */
@Data
public class DeleteFlowLogRequest {
    /**
     * 流日志的Id
     */
    @KsYunField(name = "FlowLogId")
    private String FlowLogId;

}