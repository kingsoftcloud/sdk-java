package ksyun.client.aicp.deletebatchinferencejob.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteBatchInferenceJobRequest
* @Description 请求参数
*/
@Data
public class DeleteBatchInferenceJobRequest{
    /***/
    @KsYunField(name="BatchId")
    private String BatchId;

}
