package ksyun.client.kfw.alteraclpriority.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AlterAclPriorityRequest
* @Description 请求参数
*/
@Data
public class AlterAclPriorityRequest{
    /**优先级(after/before+优先级)
before为置顶，after为置底
after+优先级 表示设置为该优先级+1 且之后的规则所有优先级都+1
before+优先级 表示设置为该优先级 原优先级规则及其之后所有规则优先级都+1
*/
    @KsYunField(name="PriorityPosition")
    private String PriorityPosition;

    /**访问控制策略id*/
    @KsYunField(name="AclId")
    private String AclId;

    /**防火墙id*/
    @KsYunField(name="CfwInstanceId")
    private String CfwInstanceId;

}
