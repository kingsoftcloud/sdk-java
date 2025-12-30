package ksyun.client.aicp.enablemodels.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname EnableModelsRequest
* @Description 请求参数
*/
@Data
public class EnableModelsRequest{
    /***/
    @KsYunField(name="ModelIds",type=2)
    private List<String> ModelIdsList;

}
