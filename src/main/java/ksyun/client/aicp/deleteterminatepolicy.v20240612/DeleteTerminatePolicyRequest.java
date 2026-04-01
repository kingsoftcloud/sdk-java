package ksyun.client.aicp.deleteterminatepolicy.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteTerminatePolicyRequest
* @Description 请求参数
*/
@Data
public class DeleteTerminatePolicyRequest{
    /**关停策略ID*/
    @KsYunField(name="TerminatePolicyId")
    private String TerminatePolicyId;

}
