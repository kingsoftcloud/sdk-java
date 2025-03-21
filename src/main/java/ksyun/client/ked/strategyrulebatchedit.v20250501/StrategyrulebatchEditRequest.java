package ksyun.client.ked.strategyrulebatchedit.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname StrategyrulebatchEditRequest
 * @Description 请求参数
 */
@Data
public class StrategyrulebatchEditRequest {
    /**
     * 安全组id
     */
    @KsYunField(name = "securityGroupId", type = 2)
    private List<String> SecurityGroupIdList;

}