package ksyun.client.knad.getknadpolicy.v20230323;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetKnadPolicyRequest
* @Description 请求参数
*/
@Data
public class GetKnadPolicyRequest{
    /***/
    @KsYunField(name="KnadId")
    private String KnadId;

}
