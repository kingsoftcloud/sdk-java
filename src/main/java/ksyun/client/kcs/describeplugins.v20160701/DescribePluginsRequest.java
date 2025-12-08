package ksyun.client.kcs.describeplugins.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribePluginsRequest
* @Description 请求参数
*/
@Data
public class DescribePluginsRequest{
    /**实例ID*/
    @KsYunField(name="CacheId")
    private String CacheId;

    /**是否是已安装的插件。*/
    @KsYunField(name="Installed")
    private Boolean Installed;

    /**模糊查找*/
    @KsYunField(name="FuzzySearch")
    private String FuzzySearch;

    /**偏移量*/
    @KsYunField(name="Offset")
    private Integer Offset;

    /**返回最大记录数*/
    @KsYunField(name="Limit")
    private Integer Limit;

}
