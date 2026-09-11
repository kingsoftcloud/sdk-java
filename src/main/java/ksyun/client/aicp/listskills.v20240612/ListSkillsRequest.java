package ksyun.client.aicp.listskills.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListSkillsRequest
* @Description 请求参数
*/
@Data
public class ListSkillsRequest{
    /**skill id*/
    @KsYunField(name="SkillId")
    private String SkillId;

    /**skill 名称*/
    @KsYunField(name="Name")
    private String Name;

    /**skill 状态

枚举：
CREATING 创建中
AVAILABLE 可用
UNAVAILABLE 不可用
UPDATING 更新中
DELETING 删除中

*/
    @KsYunField(name="Status")
    private String Status;

    /**页号*/
    @KsYunField(name="PageNumber")
    private Integer PageNumber;

    /**页大小*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
