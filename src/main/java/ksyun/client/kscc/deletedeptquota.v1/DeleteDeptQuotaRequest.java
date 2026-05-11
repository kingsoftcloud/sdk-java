package ksyun.client.kscc.deletedeptquota.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteDeptQuotaRequest
* @Description 请求参数
*/
@Data
public class DeleteDeptQuotaRequest{
    /**部门ID*/
    @KsYunField(name="DeptId")
    private String DeptId;

}
