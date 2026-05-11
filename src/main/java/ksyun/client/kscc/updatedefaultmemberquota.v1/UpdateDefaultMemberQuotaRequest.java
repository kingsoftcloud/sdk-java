package ksyun.client.kscc.updatedefaultmemberquota.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateDefaultMemberQuotaRequest
* @Description 请求参数
*/
@Data
public class UpdateDefaultMemberQuotaRequest{
    /**默认成员月度配额*/
    @KsYunField(name="DefaultMemberQuota")
    private Double DefaultMemberQuota;

}
