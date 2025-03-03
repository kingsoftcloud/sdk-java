package ksyun.client.knad.getknadpolicy.v20230323;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetKnadPolicyRequest
 * @Description 请求参数
 */
@Data
public class GetKnadPolicyRequest {
    /***/
    @KsYunField(name = "KnadId")
    private String KnadId;

}