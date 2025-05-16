package ksyun.client.iam.updatepolicy.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname UpdatePolicyRequest
 * @Description 请求参数
 */
@Data
public class UpdatePolicyRequest {
    /**
     * 策略krn
     */
    @KsYunField(name = "PolicyKrn")
    private String PolicyKrn;

    /**
     * 新策略描述
     */
    @KsYunField(name = "NewDescription")
    private String NewDescription;

}