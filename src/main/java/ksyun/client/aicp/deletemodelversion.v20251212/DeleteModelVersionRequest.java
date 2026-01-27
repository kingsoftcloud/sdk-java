package ksyun.client.aicp.deletemodelversion.v20251212;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteModelVersionRequest
* @Description 请求参数
*/
@Data
public class DeleteModelVersionRequest{
    /**模型版本ID*/
    @KsYunField(name="ModelVersionId")
    private String ModelVersionId;

}
