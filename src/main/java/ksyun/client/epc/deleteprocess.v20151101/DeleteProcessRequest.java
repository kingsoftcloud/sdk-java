package ksyun.client.epc.deleteprocess.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteProcessRequest
* @Description 请求参数
*/
@Data
public class DeleteProcessRequest{
    /**流程的ID*/
    @KsYunField(name="OperationProcessId")
    private String OperationProcessId;


}