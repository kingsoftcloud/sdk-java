package ksyun.client.epc.replyprocess.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ReplyProcessRequest
 * @Description 请求参数
 */
@Data
public class ReplyProcessRequest {
    /**
     * 流程的ID
     */
    @KsYunField(name = "OperationProcessId")
    private String OperationProcessId;

    /**
     * 回复内容
     */
    @KsYunField(name = "Remarks")
    private String Remarks;

}