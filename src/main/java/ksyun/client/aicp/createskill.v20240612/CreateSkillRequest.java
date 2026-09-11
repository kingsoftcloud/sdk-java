package ksyun.client.aicp.createskill.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateSkillRequest
* @Description 请求参数
*/
@Data
public class CreateSkillRequest{
    /**skill 来源，填KS3则从KS3读取*/
    @KsYunField(name="SourceType")
    private String SourceType;

    /**skill数据源url，ks3地址

*/
    @KsYunField(name="SourceUrl")
    private String SourceUrl;

    /**加入的skill 空间id列表*/
    @KsYunField(name="SkillSpaces",type=2)
    private List<String> SkillSpacesList;

}
