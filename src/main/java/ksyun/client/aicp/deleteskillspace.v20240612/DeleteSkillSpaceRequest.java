package ksyun.client.aicp.deleteskillspace.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteSkillSpaceRequest
* @Description 请求参数
*/
@Data
public class DeleteSkillSpaceRequest{
    /**skill 空间id*/
    @KsYunField(name="SkillSpaceId")
    private String SkillSpaceId;

}
