package ksyun.client.epc.replyprocess.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ReplyProcessRequest
* @Description 请求参数
*/
@Data
public class ReplyProcessRequest{
    /**流程的ID*/
    @KsYunField(name="OperationProcessId")
    private String OperationProcessId;

    /**回复内容*/
    @KsYunField(name="Remarks")
    private String Remarks;

}