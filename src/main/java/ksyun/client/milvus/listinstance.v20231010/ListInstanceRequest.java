package ksyun.client.milvus.listinstance.v20231010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListInstanceRequest
* @Description 请求参数
*/
@Data
public class ListInstanceRequest{
    /**默认0开始，为第一页*/
    @KsYunField(name="Offset")
    private String Offset;

    /**请求是不传默认返回10条*/
    @KsYunField(name="Limit")
    private String Limit;

    /**支持实例ID/实例名称 模糊搜索*/
    @KsYunField(name="FuzzySearch")
    private String FuzzySearch;

    /**支持过滤是否绑定安全组 可同模糊搜索一起使用*/
    @KsYunField(name="SecBindingStatus")
    private String SecBindingStatus;

}
