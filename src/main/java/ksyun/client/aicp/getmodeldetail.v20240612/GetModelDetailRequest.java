package ksyun.client.aicp.getmodeldetail.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetModelDetailRequest
* @Description 请求参数
*/
@Data
public class GetModelDetailRequest{
    /***/
    @KsYunField(name="ModelId")
    private String ModelId;

}
