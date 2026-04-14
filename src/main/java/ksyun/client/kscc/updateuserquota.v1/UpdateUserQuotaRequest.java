package ksyun.client.kscc.updateuserquota.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateUserQuotaRequest
* @Description 请求参数
*/
@Data
public class UpdateUserQuotaRequest{
    /**用户邮箱前缀，比如： zhangsan3*/
    @KsYunField(name="UserName")
    private String UserName;

    /**用户月度的限额*/
    @KsYunField(name="QuotaAmount")
    private Double QuotaAmount;

}
