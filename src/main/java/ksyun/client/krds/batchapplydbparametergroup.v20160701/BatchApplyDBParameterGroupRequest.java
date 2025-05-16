package ksyun.client.krds.batchapplydbparametergroup.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname BatchApplyDBParameterGroupRequest
 * @Description 请求参数
 */
@Data
public class BatchApplyDBParameterGroupRequest {
    /**
     * 实例ID.	如果需要批量应用参数组，则实例id之间用逗号隔开,至多允许批量应用10个实例（2022.01.07）
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 参数组ID	.通过参数组-列表(详情)接口获取
     */
    @KsYunField(name = "DBParameterGroupId")
    private String DBParameterGroupId;

}