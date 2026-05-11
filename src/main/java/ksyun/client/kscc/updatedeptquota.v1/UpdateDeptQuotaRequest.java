package ksyun.client.kscc.updatedeptquota.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateDeptQuotaRequest
* @Description 请求参数
*/
@Data
public class UpdateDeptQuotaRequest{
    /**部门ID*/
    @KsYunField(name="DeptId")
    private String DeptId;

    /**部门月度配额*/
    @KsYunField(name="QuotaAmount")
    private Double QuotaAmount;

}
