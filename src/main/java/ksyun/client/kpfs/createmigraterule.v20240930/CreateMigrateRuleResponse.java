package ksyun.client.kpfs.createmigraterule.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateMigrateRuleResponse
* @Description CreateMigrateRule 返回体
*/
@Data
@ToString
public class CreateMigrateRuleResponse extends BaseResponseModel {

    /**数据迁移规则ID。*/
    @JsonProperty("RuleId")
    private String RuleId;

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

}
