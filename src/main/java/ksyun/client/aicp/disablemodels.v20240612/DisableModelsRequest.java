package ksyun.client.aicp.disablemodels.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DisableModelsRequest
* @Description 请求参数
*/
@Data
public class DisableModelsRequest{
    /***/
    @KsYunField(name="ModelIds",type=2)
    private List<String> ModelIdsList;

}
