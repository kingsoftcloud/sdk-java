package ksyun.client.aicp.describeapikeys.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeApikeysRequest
* @Description 请求参数
*/
@Data
public class DescribeApikeysRequest{
    /**分页页码，从1开始*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**每页条数，最多100*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**通过模型查关联的API Key*/
    @KsYunField(name="AssociatedModelId",type=1)
    private List<String> AssociatedModelIdList;

    /**按状态过滤查询*/
    @KsYunField(name="Status",type=1)
    private List<String> StatusList;

    /**名称搜索关键词*/
    @KsYunField(name="Namekeyword")
    private String Namekeyword;

    /**是否默认只查默认Key*/
    @KsYunField(name="DefaultKey")
    private Boolean DefaultKey;

    /**按apiKeyId 查询*/
    @KsYunField(name="KeyId",type=1)
    private List<String> KeyIdList;

}
