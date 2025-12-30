package ksyun.client.kad.describeforwardsource.v20161122;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeForwardSourceRequest
* @Description 请求参数
*/
@Data
public class DescribeForwardSourceRequest{
    /**四层转发配置ID*/
    @KsYunField(name="ForwardConfId")
    private String ForwardConfId;

    /**一个或多个四层转发源站配置的ID*/
    @KsYunField(name="ForwardSourceId",type=1)
    private List<String> ForwardSourceIdList;

}
