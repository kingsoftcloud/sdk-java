package ksyun.client.kscc.updateaccountquota.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateAccountQuotaRequest
* @Description 请求参数
*/
@Data
public class UpdateAccountQuotaRequest{
    /**账号月度配额*/
    @KsYunField(name="QuotaAmount")
    private Double QuotaAmount;

}
