package ksyun.client.kpfs.modifydataflowtask.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyDataFlowTaskRequest
* @Description 请求参数
*/
@Data
public class ModifyDataFlowTaskRequest{
    /***/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

}
