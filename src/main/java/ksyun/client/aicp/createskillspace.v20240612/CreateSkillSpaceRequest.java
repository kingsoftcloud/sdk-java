package ksyun.client.aicp.createskillspace.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateSkillSpaceRequest
* @Description 请求参数
*/
@Data
public class CreateSkillSpaceRequest{
    /**skill 空间名称*/
    @KsYunField(name="Name")
    private String Name;

    /**skill 空间描述*/
    @KsYunField(name="Description")
    private String Description;

    /**skill 空间内的skill
id列表*/
    @KsYunField(name="Skills",type=2)
    private List<String> SkillsList;

}
