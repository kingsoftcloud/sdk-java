package ksyun.client.aicp.modifybatchinferencejob.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyBatchInferenceJobRequest
* @Description 请求参数
*/
@Data
public class ModifyBatchInferenceJobRequest{
    /***/
    @KsYunField(name="BatchId")
    private String BatchId;

    /***/
    @KsYunField(name="JobName")
    private String JobName;

    /***/
    @KsYunField(name="JobDesc")
    private String JobDesc;

}
