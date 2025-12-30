package ksyun.client.aicp.disableoverfreelimit.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DisableOverFreeLimitRequest
* @Description 请求参数
*/
@Data
public class DisableOverFreeLimitRequest{
    /***/
    @KsYunField(name="ModelIds",type=2)
    private List<String> ModelIdsList;

}
