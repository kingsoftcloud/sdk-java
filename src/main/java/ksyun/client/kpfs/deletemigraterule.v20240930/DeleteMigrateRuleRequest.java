package ksyun.client.kpfs.deletemigraterule.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteMigrateRuleRequest
* @Description 请求参数
*/
@Data
public class DeleteMigrateRuleRequest{
    /**数据迁移规则ID。*/
    @KsYunField(name="RuleId")
    private String RuleId;

}
