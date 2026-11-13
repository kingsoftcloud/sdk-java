package ksyun.client.aicp.getskillspace.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetSkillSpaceRequest
* @Description 请求参数
*/
@Data
public class GetSkillSpaceRequest{
    /***/
    @KsYunField(name="SkillSpaceId")
    private String SkillSpaceId;

}
