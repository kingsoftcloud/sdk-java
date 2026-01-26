package ksyun.client.aicp.deletemodel.v20251212;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteModelRequest
 * @Description 请求参数
 */
@Data
public class DeleteModelRequest {
    /**
     * 模型ID
     */
    @KsYunField(name = "ModelId")
    private String ModelId;

}
