package ksyun.client.kec.describemodels.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeModelsRequest
* @Description 请求参数
*/
@Data
public class DescribeModelsRequest{
    /**预查看的实例启动模板ID*/
    @KsYunField(name="ModelId")
    private List<String> ModelIdList;

    /**单次调用所返回的最大实例数目，默认值为10。*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0。*/
    @KsYunField(name="Marker")
    private Integer Marker;


}