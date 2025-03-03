package ksyun.client.epc.deleteprocess.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteProcessRequest
 * @Description 请求参数
 */
@Data
public class DeleteProcessRequest {
    /**
     * 流程的ID
     */
    @KsYunField(name = "OperationProcessId")
    private String OperationProcessId;


}