package ksyun.client.aicp.stopbatchinferencejob.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StopBatchInferenceJobRequest
* @Description 请求参数
*/
@Data
public class StopBatchInferenceJobRequest{
    /***/
    @KsYunField(name="BatchId")
    private String BatchId;

}
