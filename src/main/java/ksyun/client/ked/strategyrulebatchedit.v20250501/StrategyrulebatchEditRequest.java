package ksyun.client.ked.strategyrulebatchedit.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StrategyrulebatchEditRequest
* @Description 请求参数
*/
@Data
public class StrategyrulebatchEditRequest{
    /**安全组id*/
    @KsYunField(name="securityGroupIds",type=2)
    private List<String> SecurityGroupIdsList;

}
